/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.VilleEntity;
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
public class VilleDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idVille      ;
    @NotNull
    @Size(max=255)
    private String libelle;
	// Relations
    private List<AdresseDto> listOfAdresseDto;  

	// Relation Enum
	public enum VilleRelationsEnum {
    	listOfAdresse; 
	}
   
	/**
     * Convert VilleEntity -> VilleDto
     * @return VilleDto
     */
    public static VilleDto entityToDto(VilleEntity entity){
		VilleDto dto = null;
		if(entity != null){
			dto = new VilleDto();
        	dto.setIdVille(entity.getIdVille());
        	dto.setLibelle(entity.getLibelle());  
		}
		return  dto;
    }
	/**
     * Convert VilleDto -> VilleEntity
     * @param VilleDto
     */
    public static VilleEntity dtoToEntity(VilleDto dto){
		VilleEntity entity = null;
		if(dto != null){
			entity = new VilleEntity();
        	entity.setIdVille(dto.getIdVille()) ;
        	entity.setLibelle(dto.getLibelle());   
		}
		
		return  entity;
    }
    /**
     * Convert list VilleDto -> list VilleEntity
     * @param List<VilleDto>
     */
    public static List<VilleEntity> dtosToEntities(List<VilleDto> listDto){
		List<VilleEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(VilleDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list VilleEntity -> list VilleDto
     * @param List<VilleEntity>
     */
    public static List<VilleDto> entitiesToDtos(List<VilleEntity> listEntity){
		List<VilleDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(VilleEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}