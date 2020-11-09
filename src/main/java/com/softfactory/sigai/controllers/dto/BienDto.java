/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.BienEntity;
import com.softfactory.sigai.util.Functions;

import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BienDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String anneeConstruction;
    @Size(max=255)
    private String nombrePieces;
    @Size(max=255)
    private String superficie;
	// Relations
    private TypeBienDto typeBienDto;
    private ViewDto viewDto;
    private EtatDto etatDto;
    private StyleDto styleDto;
    private AdresseDto adresseDto;

	// Relation Enum
	public enum BienRelationsEnum {
		typeBien,
		view,
		etat,
		style,
    	adresse; 
	}
   
	/**
     * Convert BienEntity -> BienDto
     * @return BienDto
     */
    public static BienDto entityToDto(BienEntity entity){
		BienDto dto = null;
		if(entity != null){
			dto = new BienDto();
        	dto.setId(entity.getId());
        	dto.setAnneeConstruction(entity.getAnnee_construction());  
        	dto.setNombrePieces(entity.getNombre_pieces());  
        	dto.setSuperficie(entity.getSuperficie());  
		}
		return  dto;
    }
	/**
     * Convert BienDto -> BienEntity
     * @param BienDto
     */
    public static BienEntity dtoToEntity(BienDto dto){
		BienEntity entity = null;
		if(dto != null){
			entity = new BienEntity();
        	entity.setId(dto.getId()) ;
        	entity.setAnnee_construction(dto.getAnneeConstruction());   
        	entity.setNombre_pieces(dto.getNombrePieces());   
        	entity.setSuperficie(dto.getSuperficie());   
		}
		
		return  entity;
    }
    /**
     * Convert list BienDto -> list BienEntity
     * @param List<BienDto>
     */
    public static List<BienEntity> dtosToEntities(List<BienDto> listDto){
		List<BienEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(BienDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list BienEntity -> list BienDto
     * @param List<BienEntity>
     */
    public static List<BienDto> entitiesToDtos(List<BienEntity> listEntity){
		List<BienDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(BienEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}