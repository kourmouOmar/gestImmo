/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.RoleMenusPermissionsEntity;
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
public class RoleMenusPermissionsDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idRoleMenusPermissions ;
	// Relations
    private RolePermissionsDto rolePermissionsDto;
    private MenuPermissionsDto menuPermissionsDto;

	// Relation Enum
	public enum RoleMenusPermissionsRelationsEnum {
		rolePermissions,
    	menuPermissions; 
	}
   
	/**
     * Convert RoleMenusPermissionsEntity -> RoleMenusPermissionsDto
     * @return RoleMenusPermissionsDto
     */
    public static RoleMenusPermissionsDto entityToDto(RoleMenusPermissionsEntity entity){
		RoleMenusPermissionsDto dto = null;
		if(entity != null){
			dto = new RoleMenusPermissionsDto();
        	dto.setIdRoleMenusPermissions(entity.getIdRoleMenusPermissions());
		}
		return  dto;
    }
	/**
     * Convert RoleMenusPermissionsDto -> RoleMenusPermissionsEntity
     * @param RoleMenusPermissionsDto
     */
    public static RoleMenusPermissionsEntity dtoToEntity(RoleMenusPermissionsDto dto){
		RoleMenusPermissionsEntity entity = null;
		if(dto != null){
			entity = new RoleMenusPermissionsEntity();
        	entity.setIdRoleMenusPermissions(dto.getIdRoleMenusPermissions()) ;
		}
		
		return  entity;
    }
    /**
     * Convert list RoleMenusPermissionsDto -> list RoleMenusPermissionsEntity
     * @param List<RoleMenusPermissionsDto>
     */
    public static List<RoleMenusPermissionsEntity> dtosToEntities(List<RoleMenusPermissionsDto> listDto){
		List<RoleMenusPermissionsEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(RoleMenusPermissionsDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list RoleMenusPermissionsEntity -> list RoleMenusPermissionsDto
     * @param List<RoleMenusPermissionsEntity>
     */
    public static List<RoleMenusPermissionsDto> entitiesToDtos(List<RoleMenusPermissionsEntity> listEntity){
		List<RoleMenusPermissionsDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(RoleMenusPermissionsEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}