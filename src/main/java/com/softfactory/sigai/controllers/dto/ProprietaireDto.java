package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.ProprietaireEntity;
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
public class ProprietaireDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id;
    @Size(max=255)
    private String cin;
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
   
	/**
     * Convert ProprietaireEntity -> ProprietaireDto
     * @return ProprietaireDto
     */
    public static ProprietaireDto entityToDto(ProprietaireEntity entity){
		ProprietaireDto dto = null;
		if(entity != null){
			dto = new ProprietaireDto();
			//if(!entity.getId().equals(null)) {
				dto.setId(entity.getId());
			//}
        	dto.setCin(entity.getCin());  
        	dto.setEmail(entity.getEmail());  
        	dto.setNom(entity.getNom());  
        	dto.setPrenom(entity.getPrenom());  
        	dto.setRib(entity.getRib());  
        	dto.setTelephone(entity.getTelephone());  
		}
		return  dto;
    }
	/**
     * Convert ProprietaireDto -> ProprietaireEntity
     * @param ProprietaireDto
     */
    public static ProprietaireEntity dtoToEntity(ProprietaireDto dto){
		ProprietaireEntity entity = null;
		if(dto != null){
			entity = new ProprietaireEntity();
			//if(!dto.getId().equals(null)) {
	        	entity.setId(dto.getId());
			//}
        	entity.setCin(dto.getCin());   
        	entity.setEmail(dto.getEmail());   
        	entity.setNom(dto.getNom());   
        	entity.setPrenom(dto.getPrenom());   
        	entity.setRib(dto.getRib());   
        	entity.setTelephone(dto.getTelephone());   
		}
		
		return  entity;
    }
    /**
     * Convert list ProprietaireDto -> list ProprietaireEntity
     * @param List<ProprietaireDto>
     */
    public static List<ProprietaireEntity> dtosToEntities(List<ProprietaireDto> listDto){
		List<ProprietaireEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(ProprietaireDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list ProprietaireEntity -> list ProprietaireDto
     * @param List<ProprietaireEntity>
     */
    public static List<ProprietaireDto> entitiesToDtos(List<ProprietaireEntity> listEntity){
		List<ProprietaireDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(ProprietaireEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}