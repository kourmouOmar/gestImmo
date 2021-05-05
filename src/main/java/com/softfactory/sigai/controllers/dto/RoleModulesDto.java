/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.RoleModulesEntity;
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
public class RoleModulesDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idRoleModules ;
	// Relations
    private ModuleDto moduleDto;
    private RoleDto roleDto;

	// Relation Enum
	public enum RoleModulesRelationsEnum {
		module,
    	role; 
	}
   
	/**
     * Convert RoleModulesEntity -> RoleModulesDto
     * @return RoleModulesDto
     */
    public static RoleModulesDto entityToDto(RoleModulesEntity entity){
		RoleModulesDto dto = null;
		if(entity != null){
			dto = new RoleModulesDto();
        	dto.setIdRoleModules(entity.getIdRoleModules());
		}
		return  dto;
    }
	/**
     * Convert RoleModulesDto -> RoleModulesEntity
     * @param RoleModulesDto
     */
    public static RoleModulesEntity dtoToEntity(RoleModulesDto dto){
		RoleModulesEntity entity = null;
		if(dto != null){
			entity = new RoleModulesEntity();
        	entity.setIdRoleModules(dto.getIdRoleModules()) ;
		}
		
		return  entity;
    }
    /**
     * Convert list RoleModulesDto -> list RoleModulesEntity
     * @param List<RoleModulesDto>
     */
    public static List<RoleModulesEntity> dtosToEntities(List<RoleModulesDto> listDto){
		List<RoleModulesEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(RoleModulesDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list RoleModulesEntity -> list RoleModulesDto
     * @param List<RoleModulesEntity>
     */
    public static List<RoleModulesDto> entitiesToDtos(List<RoleModulesEntity> listEntity){
		List<RoleModulesDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(RoleModulesEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}