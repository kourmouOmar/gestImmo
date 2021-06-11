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
import com.softfactory.sigai.entities.PermissionEntity;
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
public class PermissionDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idPermission ;
    
    @NotNull
    @Size(max=50)
    private String libelle;
    
    @Size(max=255)
    private String description;
    
    @NotNull
    private Boolean active;
	// Relations
    private List<RolePermissionsDto> listOfRolePermissionsDto;  

	// Relation Enum
	public enum PermissionRelationsEnum {
    	listOfRolePermissions; 
	}
   
	/**
     * Convert PermissionEntity -> PermissionDto
     * @return PermissionDto
     */
    public static PermissionDto entityToDto(PermissionEntity entity){
		PermissionDto dto = null;
		if(entity != null){
			dto = new PermissionDto();
        	dto.setIdPermission(entity.getIdPermission());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setDescription(entity.getDescription());  
        	dto.setActive(entity.getActive());  
		}
		return  dto;
    }
	/**
     * Convert PermissionDto -> PermissionEntity
     * @param PermissionDto
     */
    public static PermissionEntity dtoToEntity(PermissionDto dto){
		PermissionEntity entity = null;
		if(dto != null){
			entity = new PermissionEntity();
        	entity.setIdPermission(dto.getIdPermission()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setDescription(dto.getDescription());   
        	entity.setActive(dto.getActive());   
		}
		
		return  entity;
    }
    /**
     * Convert list PermissionDto -> list PermissionEntity
     * @param List<PermissionDto>
     */
    public static List<PermissionEntity> dtosToEntities(List<PermissionDto> listDto){
		List<PermissionEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(PermissionDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list PermissionEntity -> list PermissionDto
     * @param List<PermissionEntity>
     */
    public static List<PermissionDto> entitiesToDtos(List<PermissionEntity> listEntity){
		List<PermissionDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(PermissionEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}