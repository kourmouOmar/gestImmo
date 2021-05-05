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

    private Long idAcheteur   ;
    @NotNull
    @Size(max=255)
    private String nom;
    @NotNull
    @Size(max=255)
    private String prenom;
    @Size(max=255)
    private String telephone;
    @Size(max=255)
    private String email;
	// Relations
    private AdresseDto adresseDto;
    private List<VenteDto> listOfVenteDto;  

	// Relation Enum
	public enum AcheteurRelationsEnum {
		adresse,
    	listOfVente; 
	}
   
	/**
     * Convert AcheteurEntity -> AcheteurDto
     * @return AcheteurDto
     */
    public static AcheteurDto entityToDto(AcheteurEntity entity){
		AcheteurDto dto = null;
		if(entity != null){
			dto = new AcheteurDto();
        	dto.setIdAcheteur(entity.getIdAcheteur());
        	dto.setNom(entity.getNom());  
        	dto.setPrenom(entity.getPrenom());  
        	dto.setTelephone(entity.getTelephone());  
        	dto.setEmail(entity.getEmail());  
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
        	entity.setIdAcheteur(dto.getIdAcheteur()) ;
        	entity.setNom(dto.getNom());   
        	entity.setPrenom(dto.getPrenom());   
        	entity.setTelephone(dto.getTelephone());   
        	entity.setEmail(dto.getEmail());   
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