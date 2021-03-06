package com.softfactory.sigai.controllers.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.util.CollectionUtils;
import com.softfactory.sigai.entities.MenuEntity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Data Transfer Object (DTO) "MenuChildDto"
 * 
 * @author : KOURRMOU Omar 
 * @see : <kourmou.omar@gmail.com>
 * @creation : 19 12. 2020
 * @version : 1.0
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuChildDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idMenu;

	@NotNull
	private String libelle;

	@NotNull
	private String icon;

	@NotNull
	private String iconClick;

	@NotNull
	private String url;

	private List<MenuDto> childMenus;


	/**
	 * convert entity to dto
	 * 
	 * @param menu
	 * @return
	 */
	public static MenuChildDto entityToDto(MenuEntity menu) {
		MenuChildDto menuDto = new MenuChildDto();
		if (menu != null) {
			menuDto.setIdMenu(menu.getIdMenu());
			menuDto.setLibelle(menu.getLibelle());
			menuDto.setIcon(menu.getIcon());
			menuDto.setIconClick(menu.getIconClick());
			menuDto.setUrl(menu.getUrl());
			//menuDto.setChildMenus(MenuDto.entitiesToDtos(menu.getChildMenus()));
		}
		return menuDto;
	}

	/**
	 * convert dto to entity
	 * 
	 * @param menuDto
	 * @return
	 */
	public static MenuEntity dtoToEntity(MenuChildDto menuDto) {
		MenuEntity menu = new MenuEntity();
		if (menuDto != null) {
			menu.setIdMenu(menuDto.getIdMenu());
			menu.setLibelle(menuDto.getLibelle());
			menu.setLibelle(menuDto.getLibelle());
			menu.setIcon(menuDto.getIcon());
			menu.setIconClick(menuDto.getIconClick());
			menu.setUrl(menuDto.getUrl());
			menu.setChildMenus(MenuDto.dtosToEntities(menuDto.getChildMenus()));
		}
		return menu;
	}

	/**
	 * convert list of entities to dtos
	 * 
	 * @param menuList
	 * @return
	 */
	public static List<MenuChildDto> entitiesToDtos(List<MenuEntity> menuList) {
		List<MenuChildDto> menuDtos = new ArrayList<>();
		if (!CollectionUtils.isEmpty(menuList)) {
			menuList.forEach(d -> menuDtos.add(MenuChildDto.entityToDto(d)));
		}
		return menuDtos;
	}

	/**
	 * convert list of dtos to entities
	 * 
	 * @param menuDtoList
	 * @return
	 */
	public static List<MenuEntity> dtosToEntities(List<MenuChildDto> menuDtoList) {
		List<MenuEntity> menus = new ArrayList<>();
		if (!CollectionUtils.isEmpty(menuDtoList)) {
			menuDtoList.forEach(d -> menus.add(MenuChildDto.dtoToEntity(d)));
		}
		return menus;
	}

}
