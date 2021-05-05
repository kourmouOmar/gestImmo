/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import com.sofrecom.sirhus.socle.util.Functions;
import java.util.List;
import com.sofrecom.sirhus.transverse.repository.entite.TypeGarantEntity;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TypeGarantDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idTypeGarant ;
    @NotNull
    @Size(max=255)
    private String libelle;
    @NotNull
    @Size(max=255)
    private String description;
	// Relations
    private List<GarantDto> listOfGarantDto;  

	// Relation Enum
	public enum TypeGarantRelationsEnum {
    	listOfGarant; 
	}
   
	/**
     * Convert TypeGarantEntity -> TypeGarantDto
     * @return TypeGarantDto
     */
    public static TypeGarantDto entityToDto(TypeGarantEntity entity){
		TypeGarantDto dto = null;
		if(entity != null){
			dto = new TypeGarantDto();
        	dto.setIdTypeGarant(entity.getIdTypeGarant());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setDescription(entity.getDescription());  
		}
		return  dto;
    }
	/**
     * Convert TypeGarantDto -> TypeGarantEntity
     * @param TypeGarantDto
     */
    public static TypeGarantEntity dtoToEntity(TypeGarantDto dto){
		TypeGarantEntity entity = null;
		if(dto != null){
			entity = new TypeGarantEntity();
        	entity.setIdTypeGarant(dto.getIdTypeGarant()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setDescription(dto.getDescription());   
		}
		
		return  entity;
    }
    /**
     * Convert list TypeGarantDto -> list TypeGarantEntity
     * @param List<TypeGarantDto>
     */
    public static List<TypeGarantEntity> dtosToEntities(List<TypeGarantDto> listDto){
		List<TypeGarantEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(TypeGarantDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list TypeGarantEntity -> list TypeGarantDto
     * @param List<TypeGarantEntity>
     */
    public static List<TypeGarantDto> entitiesToDtos(List<TypeGarantEntity> listEntity){
		List<TypeGarantDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(TypeGarantEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}