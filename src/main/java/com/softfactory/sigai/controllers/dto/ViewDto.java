/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import com.sofrecom.sirhus.socle.util.Functions;
import java.util.List;
import com.sofrecom.sirhus.transverse.repository.entite.ViewEntity;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ViewDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long id           ;
    @Size(max=255)
    private String libelle;
	// Relations
    private List<BienDto> listOfBienDto;  

	// Relation Enum
	public enum ViewRelationsEnum {
    	listOfBien; 
	}
   
	/**
     * Convert ViewEntity -> ViewDto
     * @return ViewDto
     */
    public static ViewDto entityToDto(ViewEntity entity){
		ViewDto dto = null;
		if(entity != null){
			dto = new ViewDto();
        	dto.setId(entity.getId());
        	dto.setLibelle(entity.getLibelle());  
		}
		return  dto;
    }
	/**
     * Convert ViewDto -> ViewEntity
     * @param ViewDto
     */
    public static ViewEntity dtoToEntity(ViewDto dto){
		ViewEntity entity = null;
		if(dto != null){
			entity = new ViewEntity();
        	entity.setId(dto.getId()) ;
        	entity.setLibelle(dto.getLibelle());   
		}
		
		return  entity;
    }
    /**
     * Convert list ViewDto -> list ViewEntity
     * @param List<ViewDto>
     */
    public static List<ViewEntity> dtosToEntities(List<ViewDto> listDto){
		List<ViewEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(ViewDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list ViewEntity -> list ViewDto
     * @param List<ViewEntity>
     */
    public static List<ViewDto> entitiesToDtos(List<ViewEntity> listEntity){
		List<ViewDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(ViewEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}