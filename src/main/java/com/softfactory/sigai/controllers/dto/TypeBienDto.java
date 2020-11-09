/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import java.util.List;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.TypeBienEntity;
import com.softfactory.sigai.util.Functions;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TypeBienDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String libelle;
	// Relations
    private List<BienDto> listOfBienDto;  

	// Relation Enum
	public enum TypeBienRelationsEnum {
    	listOfBien; 
	}
   
	/**
     * Convert TypeBienEntity -> TypeBienDto
     * @return TypeBienDto
     */
    public static TypeBienDto entityToDto(TypeBienEntity entity){
		TypeBienDto dto = null;
		if(entity != null){
			dto = new TypeBienDto();
        	dto.setId(entity.getId());
        	dto.setLibelle(entity.getLibelle());  
		}
		return  dto;
    }
	/**
     * Convert TypeBienDto -> TypeBienEntity
     * @param TypeBienDto
     */
    public static TypeBienEntity dtoToEntity(TypeBienDto dto){
		TypeBienEntity entity = null;
		if(dto != null){
			entity = new TypeBienEntity();
        	entity.setId(dto.getId()) ;
        	entity.setLibelle(dto.getLibelle());   
		}
		
		return  entity;
    }
    /**
     * Convert list TypeBienDto -> list TypeBienEntity
     * @param List<TypeBienDto>
     */
    public static List<TypeBienEntity> dtosToEntities(List<TypeBienDto> listDto){
		List<TypeBienEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(TypeBienDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list TypeBienEntity -> list TypeBienDto
     * @param List<TypeBienEntity>
     */
    public static List<TypeBienDto> entitiesToDtos(List<TypeBienEntity> listEntity){
		List<TypeBienDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(TypeBienEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}