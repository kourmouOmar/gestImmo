/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.TypeBienEntity;
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
public class TypeBienDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idTypeBien   ;
    @Size(max=255)
    private String libelle;
    @Size(max=255)
    private String description;
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
        	dto.setIdTypeBien(entity.getIdTypeBien());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setDescription(entity.getDescription());  
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
        	entity.setIdTypeBien(dto.getIdTypeBien()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setDescription(dto.getDescription());   
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