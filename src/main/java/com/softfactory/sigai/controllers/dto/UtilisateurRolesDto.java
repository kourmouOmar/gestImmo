/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import com.sofrecom.sirhus.socle.util.Functions;
import com.sofrecom.sirhus.transverse.repository.entite.UtilisateurRolesEntity;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurRolesDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idUtilisateurRoles ;
    @NotNull
    private Long idRoles;
	// Relations
    private UtilisateurDto utilisateurDto;

	// Relation Enum
	public enum UtilisateurRolesRelationsEnum {
    	utilisateur; 
	}
   
	/**
     * Convert UtilisateurRolesEntity -> UtilisateurRolesDto
     * @return UtilisateurRolesDto
     */
    public static UtilisateurRolesDto entityToDto(UtilisateurRolesEntity entity){
		UtilisateurRolesDto dto = null;
		if(entity != null){
			dto = new UtilisateurRolesDto();
        	dto.setIdUtilisateurRoles(entity.getIdUtilisateurRoles());
        	dto.setIdRoles(entity.getIdRoles());  
		}
		return  dto;
    }
	/**
     * Convert UtilisateurRolesDto -> UtilisateurRolesEntity
     * @param UtilisateurRolesDto
     */
    public static UtilisateurRolesEntity dtoToEntity(UtilisateurRolesDto dto){
		UtilisateurRolesEntity entity = null;
		if(dto != null){
			entity = new UtilisateurRolesEntity();
        	entity.setIdUtilisateurRoles(dto.getIdUtilisateurRoles()) ;
        	entity.setIdRoles(dto.getIdRoles());   
		}
		
		return  entity;
    }
    /**
     * Convert list UtilisateurRolesDto -> list UtilisateurRolesEntity
     * @param List<UtilisateurRolesDto>
     */
    public static List<UtilisateurRolesEntity> dtosToEntities(List<UtilisateurRolesDto> listDto){
		List<UtilisateurRolesEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(UtilisateurRolesDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list UtilisateurRolesEntity -> list UtilisateurRolesDto
     * @param List<UtilisateurRolesEntity>
     */
    public static List<UtilisateurRolesDto> entitiesToDtos(List<UtilisateurRolesEntity> listEntity){
		List<UtilisateurRolesDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(UtilisateurRolesEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}