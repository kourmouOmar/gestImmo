/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.RoleMenusEntity;
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
public class RoleMenusDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idRoleMenus  ;
	// Relations
    private MenuDto menuDto;
    private RoleDto roleDto;

	// Relation Enum
	public enum RoleMenusRelationsEnum {
		menu,
    	role; 
	}
   
	/**
     * Convert RoleMenusEntity -> RoleMenusDto
     * @return RoleMenusDto
     */
    public static RoleMenusDto entityToDto(RoleMenusEntity entity){
		RoleMenusDto dto = null;
		if(entity != null){
			dto = new RoleMenusDto();
        	dto.setIdRoleMenus(entity.getIdRoleMenus());
		}
		return  dto;
    }
	/**
     * Convert RoleMenusDto -> RoleMenusEntity
     * @param RoleMenusDto
     */
    public static RoleMenusEntity dtoToEntity(RoleMenusDto dto){
		RoleMenusEntity entity = null;
		if(dto != null){
			entity = new RoleMenusEntity();
        	entity.setIdRoleMenus(dto.getIdRoleMenus()) ;
		}
		
		return  entity;
    }
    /**
     * Convert list RoleMenusDto -> list RoleMenusEntity
     * @param List<RoleMenusDto>
     */
    public static List<RoleMenusEntity> dtosToEntities(List<RoleMenusDto> listDto){
		List<RoleMenusEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(RoleMenusDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list RoleMenusEntity -> list RoleMenusDto
     * @param List<RoleMenusEntity>
     */
    public static List<RoleMenusDto> entitiesToDtos(List<RoleMenusEntity> listEntity){
		List<RoleMenusDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(RoleMenusEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}