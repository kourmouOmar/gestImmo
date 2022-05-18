/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.LocataireEntity;
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
public class LocataireDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idLocataire  ;
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
    @NotNull
    @Size(max=255)
    private String cin;
    @Size(max=255)
    private String rib;
    
    @NotNull
    private Date dateNaissance;
	// Relations
    private AdresseDto adresseDto;
    private GarantDto garantDto;

	// Relation Enum
	public enum LocataireRelationsEnum {
		adresse,
    	garant; 
	}
   
	/**
     * Convert LocataireEntity -> LocataireDto
     * @return LocataireDto
     */
    public static LocataireDto entityToDto(LocataireEntity entity){
		LocataireDto dto = null;
		if(entity != null){
			dto = new LocataireDto();
        	dto.setIdLocataire(entity.getIdLocataire());
        	dto.setNom(entity.getNom());  
        	dto.setPrenom(entity.getPrenom());  
        	dto.setTelephone(entity.getTelephone());  
        	dto.setEmail(entity.getEmail());  
        	dto.setCin(entity.getCin());  
        	dto.setRib(entity.getRib());  
        	dto.setDateNaissance(entity.getDateNaissance());  
		}
		return  dto;
    }
	/**
     * Convert LocataireDto -> LocataireEntity
     * @param LocataireDto
     */
    public static LocataireEntity dtoToEntity(LocataireDto dto){
		LocataireEntity entity = null;
		if(dto != null){
			entity = new LocataireEntity();
        	entity.setIdLocataire(dto.getIdLocataire()) ;
        	entity.setNom(dto.getNom());   
        	entity.setPrenom(dto.getPrenom());   
        	entity.setTelephone(dto.getTelephone());   
        	entity.setEmail(dto.getEmail());   
        	entity.setCin(dto.getCin());   
        	entity.setRib(dto.getRib());   
        	entity.setDateNaissance(dto.getDateNaissance());   
		}
		
		return  entity;
    }
    /**
     * Convert list LocataireDto -> list LocataireEntity
     * @param List<LocataireDto>
     */
    public static List<LocataireEntity> dtosToEntities(List<LocataireDto> listDto){
		List<LocataireEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(LocataireDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list LocataireEntity -> list LocataireDto
     * @param List<LocataireEntity>
     */
    public static List<LocataireDto> entitiesToDtos(List<LocataireEntity> listEntity){
		List<LocataireDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(LocataireEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}