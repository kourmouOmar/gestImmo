/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.PaysEntity;
import com.softfactory.sigai.util.Functions;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaysDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String libelle;
    @Size(max=255)
    private String code;
	// Relations
    private List<AdresseDto> listOfAdresseDto;  

	// Relation Enum
	public enum PaysRelationsEnum {
    	listOfAdresse; 
	}
   
	/**
     * Convert PaysEntity -> PaysDto
     * @return PaysDto
     */
    public static PaysDto entityToDto(PaysEntity entity){
		PaysDto dto = null;
		if(entity != null){
			dto = new PaysDto();
        	dto.setId(entity.getId());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setCode(entity.getCode());  
		}
		return  dto;
    }
	/**
     * Convert PaysDto -> PaysEntity
     * @param PaysDto
     */
    public static PaysEntity dtoToEntity(PaysDto dto){
		PaysEntity entity = null;
		if(dto != null){
			entity = new PaysEntity();
        	entity.setId(dto.getId()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setCode(dto.getCode());   
		}
		
		return  entity;
    }
    /**
     * Convert list PaysDto -> list PaysEntity
     * @param List<PaysDto>
     */
    public static List<PaysEntity> dtosToEntities(List<PaysDto> listDto){
		List<PaysEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(PaysDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list PaysEntity -> list PaysDto
     * @param List<PaysEntity>
     */
    public static List<PaysDto> entitiesToDtos(List<PaysEntity> listEntity){
		List<PaysDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(PaysEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}