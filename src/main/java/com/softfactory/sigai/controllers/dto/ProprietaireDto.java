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
import com.softfactory.sigai.entities.ProprietaireEntity;
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
public class ProprietaireDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idProprietaire ;
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
	// Relations
    private List<BienDto> listOfBienDto;  
    private AdresseDto adresseDto;

	// Relation Enum
	public enum ProprietaireRelationsEnum {
		listOfBien,
    	adresse; 
	}
   
	/**
     * Convert ProprietaireEntity -> ProprietaireDto
     * @return ProprietaireDto
     */
    public static ProprietaireDto entityToDto(ProprietaireEntity entity){
		ProprietaireDto dto = null;
		if(entity != null){
			dto = new ProprietaireDto();
        	dto.setIdProprietaire(entity.getIdProprietaire());
        	dto.setNom(entity.getNom());  
        	dto.setPrenom(entity.getPrenom());  
        	dto.setTelephone(entity.getTelephone());  
        	dto.setEmail(entity.getEmail());  
        	dto.setCin(entity.getCin());  
        	dto.setRib(entity.getRib());  
		}
		return  dto;
    }
	/**
     * Convert ProprietaireDto -> ProprietaireEntity
     * @param ProprietaireDto
     */
    public static ProprietaireEntity dtoToEntity(ProprietaireDto dto){
		ProprietaireEntity entity = null;
		if(dto != null){
			entity = new ProprietaireEntity();
        	entity.setIdProprietaire(dto.getIdProprietaire()) ;
        	entity.setNom(dto.getNom());   
        	entity.setPrenom(dto.getPrenom());   
        	entity.setTelephone(dto.getTelephone());   
        	entity.setEmail(dto.getEmail());   
        	entity.setCin(dto.getCin());   
        	entity.setRib(dto.getRib());   
		}
		
		return  entity;
    }
    /**
     * Convert list ProprietaireDto -> list ProprietaireEntity
     * @param List<ProprietaireDto>
     */
    public static List<ProprietaireEntity> dtosToEntities(List<ProprietaireDto> listDto){
		List<ProprietaireEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(ProprietaireDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list ProprietaireEntity -> list ProprietaireDto
     * @param List<ProprietaireEntity>
     */
    public static List<ProprietaireDto> entitiesToDtos(List<ProprietaireEntity> listEntity){
		List<ProprietaireDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(ProprietaireEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}