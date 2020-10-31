package com.softfactory.sigai.controllers.dto;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.RoleEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * UserDto DTO (Data Transfer Object)
 * 
 * @author : kourmou omar
 * @creation : 31/10/20
 * @version : 1.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RoleDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String libelle;
	private String description;
	private List<UserDto> users;
	
	/**
	 * Convert RoleEntity to RoleDto
	 * 
	 * @return RoleDto
	 */
	public static RoleDto entityToDto(RoleEntity entity) {
		RoleDto dto = null;
		if (entity != null) {
			dto = new RoleDto();
			dto.setLibelle(entity.getLibelle());
			dto.setDescription(entity.getDescription());
		}
		return dto;
	}
	
	/**
	 * Convert RoleDto -> RoleEntity
	 * 
	 * @param ParametresDTO
	 */
	public static RoleEntity dtoToEntity(RoleDto dto) {
		RoleEntity entity = null;
		if (dto != null) {
			entity = new RoleEntity();
			entity.setLibelle(dto.getLibelle());
			entity.setDescription(dto.getDescription());
		}

		return entity;
	}

}
