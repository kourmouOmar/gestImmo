package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.EtatEntity;
import com.softfactory.sigai.util.Functions;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EtatDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String libelle;
	// Relations
    private List<BienDto> listOfBienDto;  

	// Relation Enum
	public enum EtatRelationsEnum {
    	listOfBien; 
	}
   
	/**
     * Convert EtatEntity -> EtatDto
     * @return EtatDto
     */
    public static EtatDto entityToDto(EtatEntity entity){
		EtatDto dto = null;
		if(entity != null){
			dto = new EtatDto();
        	dto.setId(entity.getId());
        	dto.setLibelle(entity.getLibelle());  
		}
		return  dto;
    }
	/**
     * Convert EtatDto -> EtatEntity
     * @param EtatDto
     */
    public static EtatEntity dtoToEntity(EtatDto dto){
		EtatEntity entity = null;
		if(dto != null){
			entity = new EtatEntity();
        	entity.setId(dto.getId()) ;
        	entity.setLibelle(dto.getLibelle());   
		}
		
		return  entity;
    }
    /**
     * Convert list EtatDto -> list EtatEntity
     * @param List<EtatDto>
     */
    public static List<EtatEntity> dtosToEntities(List<EtatDto> listDto){
		List<EtatEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(EtatDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list EtatEntity -> list EtatDto
     * @param List<EtatEntity>
     */
    public static List<EtatDto> entitiesToDtos(List<EtatEntity> listEntity){
		List<EtatDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(EtatEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}