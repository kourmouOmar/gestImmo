/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.RegionEntity;
import com.softfactory.sigai.util.Functions;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegionDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String libelle;
	// Relations
    private List<AdresseDto> listOfAdresseDto;  

	// Relation Enum
	public enum RegionRelationsEnum {
    	listOfAdresse; 
	}
   
	/**
     * Convert RegionEntity -> RegionDto
     * @return RegionDto
     */
    public static RegionDto entityToDto(RegionEntity entity){
		RegionDto dto = null;
		if(entity != null){
			dto = new RegionDto();
        	dto.setId(entity.getId());
        	dto.setLibelle(entity.getLibelle());  
		}
		return  dto;
    }
	/**
     * Convert RegionDto -> RegionEntity
     * @param RegionDto
     */
    public static RegionEntity dtoToEntity(RegionDto dto){
		RegionEntity entity = null;
		if(dto != null){
			entity = new RegionEntity();
        	entity.setId(dto.getId()) ;
        	entity.setLibelle(dto.getLibelle());   
		}
		
		return  entity;
    }
    /**
     * Convert list RegionDto -> list RegionEntity
     * @param List<RegionDto>
     */
    public static List<RegionEntity> dtosToEntities(List<RegionDto> listDto){
		List<RegionEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(RegionDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list RegionEntity -> list RegionDto
     * @param List<RegionEntity>
     */
    public static List<RegionDto> entitiesToDtos(List<RegionEntity> listEntity){
		List<RegionDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(RegionEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}