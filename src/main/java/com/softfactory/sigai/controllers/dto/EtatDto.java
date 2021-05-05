/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.EtatEntity;
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
public class EtatDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idEtat       ;
    @Size(max=255)
    private String libelle;
    @Size(max=255)
    private String description;
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
        	dto.setIdEtat(entity.getIdEtat());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setDescription(entity.getDescription());  
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
        	entity.setIdEtat(dto.getIdEtat()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setDescription(dto.getDescription());   
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