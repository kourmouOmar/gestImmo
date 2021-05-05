/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.MenuEntity;
import com.softfactory.sigai.util.Functions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MenuDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idMenu       ;
    @NotNull
    @Size(max=50)
    private String libelle;
    @NotNull
    @Size(max=50)
    private String icon;
    @NotNull
    @Size(max=50)
    private String iconClick;
    @NotNull
    @Size(max=100)
    private String url;
    private Long parentId;
	// Relations
    private ModuleDto moduleDto;
    private List<RoleMenusDto> listOfRoleMenusDto;  
    private List<MenuPermissionsDto> listOfMenuPermissionsDto;  

	// Relation Enum
	public enum MenuRelationsEnum {
		module,
		listOfRoleMenus,
    	listOfMenuPermissions; 
	}
   
	/**
     * Convert MenuEntity -> MenuDto
     * @return MenuDto
     */
    public static MenuDto entityToDto(MenuEntity entity){
		MenuDto dto = null;
		if(entity != null){
			dto = new MenuDto();
        	dto.setIdMenu(entity.getIdMenu());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setIcon(entity.getIcon());  
        	dto.setIconClick(entity.getIconClick());  
        	dto.setUrl(entity.getUrl());  
        	dto.setParentId(entity.getParentId());  
		}
		return  dto;
    }
	/**
     * Convert MenuDto -> MenuEntity
     * @param MenuDto
     */
    public static MenuEntity dtoToEntity(MenuDto dto){
		MenuEntity entity = null;
		if(dto != null){
			entity = new MenuEntity();
        	entity.setIdMenu(dto.getIdMenu()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setIcon(dto.getIcon());   
        	entity.setIconClick(dto.getIconClick());   
        	entity.setUrl(dto.getUrl());   
        	entity.setParentId(dto.getParentId());   
		}
		
		return  entity;
    }
    /**
     * Convert list MenuDto -> list MenuEntity
     * @param List<MenuDto>
     */
    public static List<MenuEntity> dtosToEntities(List<MenuDto> listDto){
		List<MenuEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(MenuDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list MenuEntity -> list MenuDto
     * @param List<MenuEntity>
     */
    public static List<MenuDto> entitiesToDtos(List<MenuEntity> listEntity){
		List<MenuDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(MenuEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}