/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.LocataireEntity;
import com.softfactory.sigai.entities.LocationEntity;
import com.softfactory.sigai.repository.ILocataireRepository;
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

    private Long idLocation   ;
    private Double duree;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateAcquisition;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date dateLiberation;
    
    private Double loyer;
    private Long idLocataire;
    
    private Long idLocataire2;
    private Long idBien;
	// Relations
    private BienDto bienDto;
    
    private String  locataireFullName;
  

	// Relation Enum
	public enum LocationRelationsEnum {
    	bien; 
	}
   
	/**
     * Convert LocationEntity -> LocationDto
     * @return LocationDto
     */
    public static LocationDto entityToDto(LocationEntity entity){
		LocationDto dto = null;
		if(entity != null){
			dto = new LocationDto();
        	dto.setIdLocation(entity.getIdLocation());
        	dto.setDuree(entity.getDuree());  
        	dto.setDateAcquisition(entity.getDateAcquisition());  
        	dto.setDateLiberation(entity.getDateLiberation());  
        	dto.setLoyer(entity.getLoyer());  
        	dto.setIdLocataire(entity.getIdLocataire()); 
        	if(entity.getBien() != null) {
        		dto.setBienDto(BienDto.entityToDto(entity.getBien()));
        	}
        	
        	
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
        	entity.setIdLocation(dto.getIdLocation()) ;
        	entity.setDuree(dto.getDuree());   
        	entity.setDateAcquisition(dto.getDateAcquisition());   
        	entity.setDateLiberation(dto.getDateLiberation());   
        	entity.setLoyer(dto.getLoyer());   
        	entity.setIdLocataire(dto.getIdLocataire());
        	entity.setBien(BienDto.dtoToEntity(dto.getBienDto()));
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