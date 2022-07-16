/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.VenteEntity;
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
public class VenteDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idVente      ;
    @NotNull
    private Date dateVente;
    @NotNull
    private Double prix;
	// Relations
    private BienDto bienDto;
    private AcheteurDto acheteurDto;

	// Relation Enum
	public enum VenteRelationsEnum {
		bien,
    	acheteur; 
	}
   
	/**
     * Convert VenteEntity -> VenteDto
     * @return VenteDto
     */
    public static VenteDto entityToDto(VenteEntity entity){
		VenteDto dto = null;
		if(entity != null){
			dto = new VenteDto();
        	dto.setIdVente(entity.getIdVente());
        	dto.setDateVente(entity.getDateVente());  
        	dto.setPrix(entity.getPrix());  
		}
		return  dto;
    }
	/**
     * Convert VenteDto -> VenteEntity
     * @param VenteDto
     */
    public static VenteEntity dtoToEntity(VenteDto dto){
		VenteEntity entity = null;
		if(dto != null){
			entity = new VenteEntity();
        	entity.setIdVente(dto.getIdVente()) ;
        	entity.setDateVente(dto.getDateVente());   
        	entity.setPrix(dto.getPrix());  
        	//entity.setAcheteur(AcheteurDto.dtoToEntity(dto.getAcheteurDto()));
		}
		
		return  entity;
    }
    /**
     * Convert list VenteDto -> list VenteEntity
     * @param List<VenteDto>
     */
    public static List<VenteEntity> dtosToEntities(List<VenteDto> listDto){
		List<VenteEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(VenteDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list VenteEntity -> list VenteDto
     * @param List<VenteEntity>
     */
    public static List<VenteDto> entitiesToDtos(List<VenteEntity> listEntity){
		List<VenteDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(VenteEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}