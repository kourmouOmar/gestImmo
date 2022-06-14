/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.TacheNoteEntity;
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
public class TacheNoteDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id;
    @Size(max=255)
    private String sujet;
    @Size(max=255)
    private String description;
    
    private String utilisateur;  

	
   
	/**
     * Convert TacheNoteEntity -> TacheNoteDto
     * @return TacheNoteEntity
     */
    public static TacheNoteDto entityToDto(TacheNoteEntity entity){
		TacheNoteDto dto = null;
		if(entity != null){
			dto = new TacheNoteDto();
        	dto.setId(entity.getId());
        	dto.setSujet(entity.getSujet());  
        	dto.setDescription(entity.getDescription());  
        	dto.setUtilisateur(entity.getUtilisateur());
		}
		return  dto;
    }
	/**
     * Convert TacheNoteDto -> TacheNoteEntity
     * @param TacheNoteDto
     */
    public static TacheNoteEntity dtoToEntity(TacheNoteDto dto){
    	TacheNoteEntity entity = null;
		if(dto != null){
			entity = new TacheNoteEntity();
        	entity.setId(dto.getId()) ;
        	entity.setSujet(dto.getSujet());   
        	entity.setDescription(dto.getDescription());
        	entity.setUtilisateur(dto.getUtilisateur());
		}
		
		return  entity;
    }
    /**
     * Convert list TacheNoteDto -> list EtatEntity
     * @param List<TacheNoteDto>
     */
    public static List<TacheNoteEntity> dtosToEntities(List<TacheNoteDto> listDto){
		List<TacheNoteEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(TacheNoteDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list TacheNoteEntity -> list TacheNoteDto
     * @param List<TacheNoteEntity>
     */
    public static List<TacheNoteDto> entitiesToDtos(List<TacheNoteEntity> listEntity){
		List<TacheNoteDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(TacheNoteEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}