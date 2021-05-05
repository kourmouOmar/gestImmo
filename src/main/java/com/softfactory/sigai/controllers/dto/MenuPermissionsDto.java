/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.MenuPermissionsEntity;
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
public class MenuPermissionsDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idMenuPermissions ;
    private Long idPermission;
	// Relations
    private MenuDto menuDto;
    private List<RoleMenusPermissionsDto> listOfRoleMenusPermissionsDto;  

	// Relation Enum
	public enum MenuPermissionsRelationsEnum {
		menu,
    	listOfRoleMenusPermissions; 
	}
   
	/**
     * Convert MenuPermissionsEntity -> MenuPermissionsDto
     * @return MenuPermissionsDto
     */
    public static MenuPermissionsDto entityToDto(MenuPermissionsEntity entity){
		MenuPermissionsDto dto = null;
		if(entity != null){
			dto = new MenuPermissionsDto();
        	dto.setIdMenuPermissions(entity.getIdMenuPermissions());
        	dto.setIdPermission(entity.getIdPermission());  
		}
		return  dto;
    }
	/**
     * Convert MenuPermissionsDto -> MenuPermissionsEntity
     * @param MenuPermissionsDto
     */
    public static MenuPermissionsEntity dtoToEntity(MenuPermissionsDto dto){
		MenuPermissionsEntity entity = null;
		if(dto != null){
			entity = new MenuPermissionsEntity();
        	entity.setIdMenuPermissions(dto.getIdMenuPermissions()) ;
        	entity.setIdPermission(dto.getIdPermission());   
		}
		
		return  entity;
    }
    /**
     * Convert list MenuPermissionsDto -> list MenuPermissionsEntity
     * @param List<MenuPermissionsDto>
     */
    public static List<MenuPermissionsEntity> dtosToEntities(List<MenuPermissionsDto> listDto){
		List<MenuPermissionsEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(MenuPermissionsDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list MenuPermissionsEntity -> list MenuPermissionsDto
     * @param List<MenuPermissionsEntity>
     */
    public static List<MenuPermissionsDto> entitiesToDtos(List<MenuPermissionsEntity> listEntity){
		List<MenuPermissionsDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(MenuPermissionsEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}