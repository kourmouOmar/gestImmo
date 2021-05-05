/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.*;
import com.sofrecom.sirhus.socle.util.Functions;
import java.util.List;
import com.sofrecom.sirhus.transverse.repository.entite.VueEntity;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VueDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idVue        ;
    @Size(max=255)
    private String libelle;
    @Size(max=255)
    private String description;
	// Relations
    private List<BienDto> listOfBienDto;  

	// Relation Enum
	public enum VueRelationsEnum {
    	listOfBien; 
	}
   
	/**
     * Convert VueEntity -> VueDto
     * @return VueDto
     */
    public static VueDto entityToDto(VueEntity entity){
		VueDto dto = null;
		if(entity != null){
			dto = new VueDto();
        	dto.setIdVue(entity.getIdVue());
        	dto.setLibelle(entity.getLibelle());  
        	dto.setDescription(entity.getDescription());  
		}
		return  dto;
    }
	/**
     * Convert VueDto -> VueEntity
     * @param VueDto
     */
    public static VueEntity dtoToEntity(VueDto dto){
		VueEntity entity = null;
		if(dto != null){
			entity = new VueEntity();
        	entity.setIdVue(dto.getIdVue()) ;
        	entity.setLibelle(dto.getLibelle());   
        	entity.setDescription(dto.getDescription());   
		}
		
		return  entity;
    }
    /**
     * Convert list VueDto -> list VueEntity
     * @param List<VueDto>
     */
    public static List<VueEntity> dtosToEntities(List<VueDto> listDto){
		List<VueEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(VueDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list VueEntity -> list VueDto
     * @param List<VueEntity>
     */
    public static List<VueDto> entitiesToDtos(List<VueEntity> listEntity){
		List<VueDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(VueEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}