/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.StyleEntity;
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
public class StyleDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idStyle      ;
    @Size(max=255)
    private String libelle;
    @Size(max=255)
    private String description;
	// Relations
    private List<BienDto> listOfBienDto;  

	// Relation Enum
	public enum StyleRelationsEnum {
    	listOfBien; 
	}
   
	/**
     * Convert StyleEntity -> StyleDto
     * @return StyleDto
     */
    public static StyleDto entityToDto(StyleEntity entity){
		StyleDto dto = null;
		if(entity != null){
			dto = new StyleDto();
        	dto.setIdStyle(entity.getIdStyle());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setDescription(entity.getDescription());  
		}
		return  dto;
    }
	/**
     * Convert StyleDto -> StyleEntity
     * @param StyleDto
     */
    public static StyleEntity dtoToEntity(StyleDto dto){
		StyleEntity entity = null;
		if(dto != null){
			entity = new StyleEntity();
        	entity.setIdStyle(dto.getIdStyle()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setDescription(dto.getDescription());   
		}
		
		return  entity;
    }
    /**
     * Convert list StyleDto -> list StyleEntity
     * @param List<StyleDto>
     */
    public static List<StyleEntity> dtosToEntities(List<StyleDto> listDto){
		List<StyleEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(StyleDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list StyleEntity -> list StyleDto
     * @param List<StyleEntity>
     */
    public static List<StyleDto> entitiesToDtos(List<StyleEntity> listEntity){
		List<StyleDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(StyleEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}