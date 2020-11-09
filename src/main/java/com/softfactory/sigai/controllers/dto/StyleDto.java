/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.StyleEntity;
import com.softfactory.sigai.util.Functions;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StyleDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String libelle;
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
        	dto.setId(entity.getId());
        	dto.setLibelle(entity.getLibelle());  
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
        	entity.setId(dto.getId()) ;
        	entity.setLibelle(dto.getLibelle());   
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