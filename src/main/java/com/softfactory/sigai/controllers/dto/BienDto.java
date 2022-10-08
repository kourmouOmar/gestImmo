/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.BienEntity;
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
public class BienDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idBien       ;
    private Long anneeConstruction;
    private Double superficie;
    private Long nombrePieces;
	// Relations
    private StyleDto styleDto;
    private List<VenteDto> listOfVenteDto;  
    private TypeBienDto typeBienDto;
    private EtatDto etatDto;
    private AdresseDto adresseDto;
    private ProprietaireDto proprietaireDto;
    private List<LocationDto> listOfLocationDto;  
    private VueDto vueDto;

	// Relation Enum
	public enum BienRelationsEnum {
		style,
		listOfVente,
		typeBien,
		etat,
		adresse,
		proprietaire,
		listOfLocation,
    	vue; 
	}
   
	/**
     * Convert BienEntity -> BienDto
     * @return BienDto
     */
    public static BienDto entityToDto(BienEntity entity){
		BienDto dto = null;
		if(entity != null){
			dto = new BienDto();
        	dto.setIdBien(entity.getIdBien());
        	dto.setAnneeConstruction(entity.getAnneeConstruction());  
        	dto.setSuperficie(entity.getSuperficie());  
        	dto.setNombrePieces(entity.getNombrePieces());
        	if(entity.getEtat() != null) {
        		dto.setEtatDto(EtatDto.entityToDto(entity.getEtat()));
        	}
        	if(entity.getVue() != null) {
        		dto.setVueDto(VueDto.entityToDto(entity.getVue()));
        	}
        	if(entity.getTypeBien() != null) {
        		dto.setTypeBienDto(TypeBienDto.entityToDto(entity.getTypeBien()));
        	}
        	if(entity.getStyle() != null) {
        		dto.setStyleDto(StyleDto.entityToDto(entity.getStyle()));
        	}
        	
        	if(entity.getProprietaire() != null) {
        		dto.setProprietaireDto(ProprietaireDto.entityToDto(entity.getProprietaire()));
        	}
        	
        	
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
        	entity.setIdBien(dto.getIdBien()) ;
        	entity.setAnneeConstruction(dto.getAnneeConstruction());   
        	entity.setSuperficie(dto.getSuperficie());   
        	entity.setNombrePieces(dto.getNombrePieces());  
        	if(dto.getEtatDto() != null) {
        		entity.setEtat(EtatDto.dtoToEntity(dto.getEtatDto()));
        	}
        	if(dto.getTypeBienDto() != null) {
        		entity.setTypeBien(TypeBienDto.dtoToEntity(dto.getTypeBienDto()));
        	}
        	if(dto.getStyleDto() != null) {
        		entity.setStyle(StyleDto.dtoToEntity(dto.getStyleDto()));
        	}
        	if(dto.getVueDto() != null) {
        		entity.setVue(VueDto.dtoToEntity(dto.getVueDto()));
        	}
        	if(dto.getProprietaireDto() != null) {
        		entity.setProprietaire(ProprietaireDto.dtoToEntity(dto.getProprietaireDto()));
        	}
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