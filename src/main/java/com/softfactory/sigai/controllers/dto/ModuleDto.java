package com.softfactory.sigai.controllers.dto;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.ModuleEntity;
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
public class ModuleDto implements Serializable {

private static final long serialVersionUID = 1L;

    private Long idModules    ;
    private Boolean active;
    @Size(max=50)
    private String code;
    @Size(max=50)
    private String colorLibelle;
    @Size(max=150)
    private String description;
    @Size(max=50)
    private String iconeActive;
    @Size(max=50)
    private String iconeHover;
    @Size(max=50)
    private String iconeNormale;
    @Size(max=50)
    private String libelle;
	// Relations
    private List<MenuDto> listOfMenuDto;  

	// Relation Enum
	public enum ModuleRelationsEnum {
    	listOfMenu; 
	}
   
	/**
     * Convert ModuleEntity -> ModuleDto
     * @return ModuleDto
     */
    public static ModuleDto entityToDto(ModuleEntity entity){
		ModuleDto dto = null;
		if(entity != null){
			dto = new ModuleDto();
        	dto.setIdModules(entity.getId());
        	dto.setActive(entity.getActive());  
        	dto.setCode(entity.getCode());  
        	dto.setColorLibelle(entity.getColorLibelle());  
        	dto.setDescription(entity.getDescription());  
        	dto.setIconeActive(entity.getIconeActive());  
        	dto.setIconeHover(entity.getIconeHover());  
        	dto.setIconeNormale(entity.getIconeNormale());  
        	dto.setLibelle(entity.getLibelle());  
		}
		return  dto;
    }
	/**
     * Convert ModuleDto -> ModuleEntity
     * @param ModuleDto
     */
    public static ModuleEntity dtoToEntity(ModuleDto dto){
		ModuleEntity entity = null;
		if(dto != null){
			entity = new ModuleEntity();
        	entity.setId(dto.getIdModules()) ;
        	entity.setActive(dto.getActive());   
        	entity.setCode(dto.getCode());   
        	entity.setColorLibelle(dto.getColorLibelle());   
        	entity.setDescription(dto.getDescription());   
        	entity.setIconeActive(dto.getIconeActive());   
        	entity.setIconeHover(dto.getIconeHover());   
        	entity.setIconeNormale(dto.getIconeNormale());   
        	entity.setLibelle(dto.getLibelle());   
		}
		
		return  entity;
    }
    /**
     * Convert list ModuleDto -> list ModuleEntity
     * @param List<ModuleDto>
     */
    public static List<ModuleEntity> dtosToEntities(List<ModuleDto> listDto){
		List<ModuleEntity> list = new ArrayList<>();
 		if(Functions.isNotEmpty(listDto)){
        	for(ModuleDto dto:listDto){
    			list.add(dtoToEntity(dto));
    		}
		}
        return list;
    }
    /**
     * Convert list ModuleEntity -> list ModuleDto
     * @param List<ModuleEntity>
     */
    public static List<ModuleDto> entitiesToDtos(List<ModuleEntity> listEntity){
		List<ModuleDto> list = new ArrayList<>();
		if(Functions.isNotEmpty(listEntity)){
        	for(ModuleEntity entity:listEntity){
    			list.add(entityToDto(entity));
    		}
		}
        return list;
    }
}