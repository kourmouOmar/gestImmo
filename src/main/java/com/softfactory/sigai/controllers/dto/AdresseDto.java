
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.AdresseEntity;
import com.softfactory.sigai.util.Functions;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AdresseDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String batiment;
    private Integer numAppartement;
    private Integer numEtage;
    @Size(max=255)
    private String quartier;
	// Relations
    private List<BienDto> listOfBienDto;  
    private VilleDto villeDto;
    private RegionDto regionDto;
    private PaysDto paysDto;

	// Relation Enum
	public enum AdresseRelationsEnum {
		listOfBien,
		ville,
		region,
    	pays; 
	}
   
	/**
     * Convert AdresseEntity -> AdresseDto
     * @return AdresseDto
     */
    public static AdresseDto entityToDto(AdresseEntity entity){
		AdresseDto dto = null;
		if(entity != null){
			dto = new AdresseDto();
        	dto.setId(entity.getId());
        	dto.setBatiment(entity.getBatiment());  
        	dto.setNumAppartement(entity.getNum_appartement());  
        	dto.setNumEtage(entity.getNum_etage());  
        	dto.setQuartier(entity.getQuartier());  
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
        	entity.setId(dto.getId()) ;
        	entity.setBatiment(dto.getBatiment());   
        	entity.setNum_appartement(dto.getNumAppartement());   
        	entity.setNum_etage(dto.getNumEtage());   
        	entity.setQuartier(dto.getQuartier());   
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