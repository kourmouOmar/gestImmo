/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.RoleEntity;
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
public class RoleDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idRole       ;
    @Size(max=255)
    private String libelle;
    @Size(max=255)
    private String description;
	// Relations
    private List<RoleMenusDto> listOfRoleMenusDto;  
    private List<RoleModulesDto> listOfRoleModulesDto;  
    private List<RolePermissionsDto> listOfRolePermissionsDto;  

	// Relation Enum
	public enum RoleRelationsEnum {
		listOfRoleMenus,
		listOfRoleModules,
    	listOfRolePermissions; 
	}
   
	/**
     * Convert RoleEntity -> RoleDto
     * @return RoleDto
     */
    public static RoleDto entityToDto(RoleEntity entity){
		RoleDto dto = null;
		if(entity != null){
			dto = new RoleDto();
        	dto.setIdRole(entity.getIdRole());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setDescription(entity.getDescription());  
		}
		return  dto;
    }
	/**
     * Convert RoleDto -> RoleEntity
     * @param RoleDto
     */
    public static RoleEntity dtoToEntity(RoleDto dto){
		RoleEntity entity = null;
		if(dto != null){
			entity = new RoleEntity();
        	entity.setIdRole(dto.getIdRole()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setDescription(dto.getDescription());   
		}
		
		return  entity;
    }
    /**
     * Convert list RoleDto -> list RoleEntity
     * @param List<RoleDto>
     */
    public static List<RoleEntity> dtosToEntities(List<RoleDto> listDto){
		List<RoleEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(RoleDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list RoleEntity -> list RoleDto
     * @param List<RoleEntity>
     */
    public static List<RoleDto> entitiesToDtos(List<RoleEntity> listEntity){
		List<RoleDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(RoleEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}