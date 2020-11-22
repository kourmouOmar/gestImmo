package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.LocationEntity;
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
public class LocationDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    private Date dateAcquisition;
    private Date dateLiberation;
    @Size(max=255)
    private String duree;
    private Double loyer;
	// Relations
    private BienDto bienDto;
    private GarantDto garantDto;

	// Relation Enum
	public enum LocationRelationsEnum {
		bien,
    	garant; 
	}
   
	/**
     * Convert LocationEntity -> LocationDto
     * @return LocationDto
     */
    public static LocationDto entityToDto(LocationEntity entity){
		LocationDto dto = null;
		if(entity != null){
			dto = new LocationDto();
        	dto.setId(entity.getId());
        	dto.setDateAcquisition(entity.getDateAcquisition());  
        	dto.setDateLiberation(entity.getDateLiberation());  
        	dto.setDuree(entity.getDuree());  
        	dto.setLoyer(entity.getLoyer());  
		}
		return  dto;
    }
	/**
     * Convert LocationDto -> LocationEntity
     * @param LocationDto
     */
    public static LocationEntity dtoToEntity(LocationDto dto){
		LocationEntity entity = null;
		if(dto != null){
			entity = new LocationEntity();
        	entity.setId(dto.getId()) ;
        	entity.setDateAcquisition(dto.getDateAcquisition());   
        	entity.setDateLiberation(dto.getDateLiberation());   
        	entity.setDuree(dto.getDuree());   
        	entity.setLoyer(dto.getLoyer());   
		}
		
		return  entity;
    }
    /**
     * Convert list LocationDto -> list LocationEntity
     * @param List<LocationDto>
     */
    public static List<LocationEntity> dtosToEntities(List<LocationDto> listDto){
		List<LocationEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(LocationDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list LocationEntity -> list LocationDto
     * @param List<LocationEntity>
     */
    public static List<LocationDto> entitiesToDtos(List<LocationEntity> listEntity){
		List<LocationDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(LocationEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}