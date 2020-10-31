package com.softfactory.sigai.controllers.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.UserEntity;

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
public class UserDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String username;
	private String password;
	private Long idRole;
	
	/**
	 * Convert UserEntity to UserDto
	 * 
	 * @return UserDto
	 */
	public static UserDto entityToDto(UserEntity entity) {
		UserDto dto = null;
		if (entity != null) {
			dto = new UserDto();
			dto.setUsername(entity.getUsername());
			dto.setPassword(entity.getPassword());
			//dto.setRelo(entity.getRole());
		}
		return dto;
	}
	
	/**
	 * Convert UserDto -> UserEntity
	 * 
	 * @param ParametresDTO
	 */
	public static UserEntity dtoToEntity(UserDto dto) {
		UserEntity entity = null;
		if (dto != null) {
			entity = new UserEntity();
			entity.setUsername(dto.getUsername());
			entity.setPassword(dto.getPassword());
		}

		return entity;
	}

}

