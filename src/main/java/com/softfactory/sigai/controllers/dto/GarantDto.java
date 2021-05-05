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
import com.softfactory.sigai.entities.GarantEntity;
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
public class GarantDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idGarant     ;
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
    private AdresseDto adresseDto;
    private List<LocataireDto> listOfLocataireDto;  
    private TypeGarantDto typeGarantDto;

	// Relation Enum
	public enum GarantRelationsEnum {
		adresse,
		listOfLocataire,
    	typeGarant; 
	}
   
	/**
     * Convert GarantEntity -> GarantDto
     * @return GarantDto
     */
    public static GarantDto entityToDto(GarantEntity entity){
		GarantDto dto = null;
		if(entity != null){
			dto = new GarantDto();
        	dto.setIdGarant(entity.getIdGarant());
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
     * Convert GarantDto -> GarantEntity
     * @param GarantDto
     */
    public static GarantEntity dtoToEntity(GarantDto dto){
		GarantEntity entity = null;
		if(dto != null){
			entity = new GarantEntity();
        	entity.setIdGarant(dto.getIdGarant()) ;
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
     * Convert list GarantDto -> list GarantEntity
     * @param List<GarantDto>
     */
    public static List<GarantEntity> dtosToEntities(List<GarantDto> listDto){
		List<GarantEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(GarantDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list GarantEntity -> list GarantDto
     * @param List<GarantEntity>
     */
    public static List<GarantDto> entitiesToDtos(List<GarantEntity> listEntity){
		List<GarantDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(GarantEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}