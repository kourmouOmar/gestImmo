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
import com.softfactory.sigai.entities.UtilisateurEntity;
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
public class UtilisateurDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idUtilisateur ;
    @NotNull
    @Size(max=255)
    private String nom;
    @NotNull
    @Size(max=255)
    private String prenom;
    @Size(max=255)
    private String telephone;
    @Size(max=255)
    private String email;
    @Size(max=255)
    private String cin;
    @NotNull
    @Size(max=255)
    private String username;
    @NotNull
    @Size(max=255)
    private String password;
	// Relations
    private List<UtilisateurRolesDto> listOfUtilisateurRolesDto;  

	// Relation Enum
	public enum UtilisateurRelationsEnum {
    	listOfUtilisateurRoles; 
	}
   
	/**
     * Convert UtilisateurEntity -> UtilisateurDto
     * @return UtilisateurDto
     */
    public static UtilisateurDto entityToDto(UtilisateurEntity entity){
		UtilisateurDto dto = null;
		if(entity != null){
			dto = new UtilisateurDto();
        	dto.setIdUtilisateur(entity.getIdUtilisateur());
        	dto.setNom(entity.getNom());  
        	dto.setPrenom(entity.getPrenom());  
        	dto.setTelephone(entity.getTelephone());  
        	dto.setEmail(entity.getEmail());  
        	dto.setCin(entity.getCin());  
        	dto.setUsername(entity.getUsername());  
        	dto.setPassword(entity.getPassword());  
		}
		return  dto;
    }
	/**
     * Convert UtilisateurDto -> UtilisateurEntity
     * @param UtilisateurDto
     */
    public static UtilisateurEntity dtoToEntity(UtilisateurDto dto){
		UtilisateurEntity entity = null;
		if(dto != null){
			entity = new UtilisateurEntity();
        	entity.setIdUtilisateur(dto.getIdUtilisateur()) ;
        	entity.setNom(dto.getNom());   
        	entity.setPrenom(dto.getPrenom());   
        	entity.setTelephone(dto.getTelephone());   
        	entity.setEmail(dto.getEmail());   
        	entity.setCin(dto.getCin());   
        	entity.setUsername(dto.getUsername());   
        	entity.setPassword(dto.getPassword());   
		}
		
		return  entity;
    }
    /**
     * Convert list UtilisateurDto -> list UtilisateurEntity
     * @param List<UtilisateurDto>
     */
    public static List<UtilisateurEntity> dtosToEntities(List<UtilisateurDto> listDto){
		List<UtilisateurEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(UtilisateurDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list UtilisateurEntity -> list UtilisateurDto
     * @param List<UtilisateurEntity>
     */
    public static List<UtilisateurDto> entitiesToDtos(List<UtilisateurEntity> listEntity){
		List<UtilisateurDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(UtilisateurEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}