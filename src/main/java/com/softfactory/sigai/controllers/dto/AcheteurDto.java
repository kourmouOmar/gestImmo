package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.AcheteurEntity;
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
public class AcheteurDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String email;
    @Size(max=255)
    private String nom;
    @Size(max=255)
    private String prenom;
    @Size(max=255)
    private String telephone;
	// Relations
    private List<AdresseDto> listOfAdresse2Dto;  
    private List<AdresseDto> listOfAdresseDto;  

	// Relation Enum
	public enum AcheteurRelationsEnum {
		listOfAdresse2,
    	listOfAdresse; 
	}
   
	/**
     * Convert AcheteurEntity -> AcheteurDto
     * @return AcheteurDto
     */
    public static AcheteurDto entityToDto(AcheteurEntity entity){
		AcheteurDto dto = null;
		if(entity != null){
			dto = new AcheteurDto();
        	dto.setId(entity.getId());
        	dto.setEmail(entity.getEmail());  
        	dto.setNom(entity.getNom());  
        	dto.setPrenom(entity.getPrenom());  
        	dto.setTelephone(entity.getTelephone());  
		}
		return  dto;
    }
	/**
     * Convert AcheteurDto -> AcheteurEntity
     * @param AcheteurDto
     */
    public static AcheteurEntity dtoToEntity(AcheteurDto dto){
		AcheteurEntity entity = null;
		if(dto != null){
			entity = new AcheteurEntity();
        	entity.setId(dto.getId()) ;
        	entity.setEmail(dto.getEmail());   
        	entity.setNom(dto.getNom());   
        	entity.setPrenom(dto.getPrenom());   
        	entity.setTelephone(dto.getTelephone());   
		}
		
		return  entity;
    }
    /**
     * Convert list AcheteurDto -> list AcheteurEntity
     * @param List<AcheteurDto>
     */
    public static List<AcheteurEntity> dtosToEntities(List<AcheteurDto> listDto){
		List<AcheteurEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(AcheteurDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list AcheteurEntity -> list AcheteurDto
     * @param List<AcheteurEntity>
     */
    public static List<AcheteurDto> entitiesToDtos(List<AcheteurEntity> listEntity){
		List<AcheteurDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(AcheteurEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}