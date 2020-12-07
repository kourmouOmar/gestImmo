package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.GarantEntity;
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
public class GarantDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String email;
    @Size(max=255)
    private String nom;
    @Size(max=255)
    private String prenom;
    @Size(max=255)
    private String rib;
    @Size(max=255)
    private String telephone;
	// Relations
    private List<LocationDto> listOfLocationDto;  
    private List<AdresseDto> listOfAdresseDto;  
    private TypeGarantDto typeGarantDto;

	// Relation Enum
	public enum GarantRelationsEnum {
		listOfLocation,
		listOfAdresse,
    	typeGarant; 
	}
   
	/**
     * Convert GarantEntity -> GarantDto
     * @return GarantDto
     */
    public static GarantDto entityToDto(GarantEntity entity){
		GarantDto dto = null;
		if(entity != null){
			dto = new GarantDto();
        	dto.setId(entity.getId());
        	dto.setEmail(entity.getEmail());  
        	dto.setNom(entity.getNom());  
        	dto.setPrenom(entity.getPrenom());  
        	dto.setRib(entity.getRib());  
        	dto.setTelephone(entity.getTelephone());  
		}
		return  dto;
    }
	/**
     * Convert GarantDto -> GarantEntity
     * @param GarantDto
     */
    public static GarantEntity dtoToEntity(GarantDto dto){
		GarantEntity entity = null;
		if(dto != null){
			entity = new GarantEntity();
        	entity.setId(dto.getId()) ;
        	entity.setEmail(dto.getEmail());   
        	entity.setNom(dto.getNom());   
        	entity.setPrenom(dto.getPrenom());   
        	entity.setRib(dto.getRib());   
        	entity.setTelephone(dto.getTelephone());   
		}
		
		return  entity;
    }
    /**
     * Convert list GarantDto -> list GarantEntity
     * @param List<GarantDto>
     */
    public static List<GarantEntity> dtosToEntities(List<GarantDto> listDto){
		List<GarantEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(GarantDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list GarantEntity -> list GarantDto
     * @param List<GarantEntity>
     */
    public static List<GarantDto> entitiesToDtos(List<GarantEntity> listEntity){
		List<GarantDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(GarantEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}