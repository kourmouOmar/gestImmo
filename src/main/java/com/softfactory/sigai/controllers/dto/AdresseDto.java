/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.AdresseEntity;
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
public class AdresseDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idAdresse    ;
    @Size(max=255)
    private String numAppartement;
    private Double etage;
    @Size(max=255)
    private String batiment;
    @Size(max=255)
    private String quartier;
    private Double codePostale;
	// Relations
    private List<BienDto> listOfBienDto;  
    private List<AcheteurDto> listOfAcheteurDto;  
    private List<GarantDto> listOfGarantDto;  
    private PaysDto paysDto;
    private List<LocataireDto> listOfLocataireDto;  
    private VilleDto villeDto;
    private List<ProprietaireDto> listOfProprietaireDto;  

	// Relation Enum
	public enum AdresseRelationsEnum {
		listOfBien,
		listOfAcheteur,
		listOfGarant,
		pays,
		listOfLocataire,
		ville,
    	listOfProprietaire; 
	}
   
	/**
     * Convert AdresseEntity -> AdresseDto
     * @return AdresseDto
     */
    public static AdresseDto entityToDto(AdresseEntity entity){
		AdresseDto dto = null;
		if(entity != null){
			dto = new AdresseDto();
        	dto.setIdAdresse(entity.getIdAdresse());
        	dto.setNumAppartement(entity.getNumAppartement());  
        	dto.setEtage(entity.getEtage());  
        	dto.setBatiment(entity.getBatiment());  
        	dto.setQuartier(entity.getQuartier());  
        	dto.setCodePostale(entity.getCodePostale());  
		}
		return  dto;
    }
	/**
     * Convert AdresseDto -> AdresseEntity
     * @param AdresseDto
     */
    public static AdresseEntity dtoToEntity(AdresseDto dto){
		AdresseEntity entity = null;
		if(dto != null){
			entity = new AdresseEntity();
        	entity.setIdAdresse(dto.getIdAdresse()) ;
        	entity.setNumAppartement(dto.getNumAppartement());   
        	entity.setEtage(dto.getEtage());   
        	entity.setBatiment(dto.getBatiment());   
        	entity.setQuartier(dto.getQuartier());   
        	entity.setCodePostale(dto.getCodePostale());   
		}
		
		return  entity;
    }
    /**
     * Convert list AdresseDto -> list AdresseEntity
     * @param List<AdresseDto>
     */
    public static List<AdresseEntity> dtosToEntities(List<AdresseDto> listDto){
		List<AdresseEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(AdresseDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list AdresseEntity -> list AdresseDto
     * @param List<AdresseEntity>
     */
    public static List<AdresseDto> entitiesToDtos(List<AdresseEntity> listEntity){
		List<AdresseDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(AdresseEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}