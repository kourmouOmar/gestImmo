/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softfactory.sigai.entities.ContactEntity;
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
public class ContactDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	@NotNull
	@Size(max = 255)
	private String nom;
	@NotNull
	@Size(max = 255)
	private String prenom;
	@Size(max = 255)
	private String telephone;
	@Size(max = 255)
	private String email;
	private String adresse;

	/**
	 * Convert ContactEntity -> AcheteurDto
	 * 
	 * @return AcheteurDto
	 */
	public static ContactDto entityToDto(ContactEntity entity) {
		ContactDto dto = null;
		if (entity != null) {
			dto = new ContactDto();
			dto.setId(entity.getId());
			dto.setNom(entity.getNom());
			dto.setPrenom(entity.getPrenom());
			dto.setTelephone(entity.getTelephone());
			dto.setEmail(entity.getEmail());
			dto.setAdresse(entity.getAdresse());

		}
		return dto;
	}

	/**
	 * Convert ContactDto -> ContactEntity
	 * 
	 * @param ContactDto
	 */
	public static ContactEntity dtoToEntity(ContactDto dto) {
		ContactEntity entity = null;
		if (dto != null) {
			entity = new ContactEntity();
			entity.setIdContact(dto.getId());
			entity.setNom(dto.getNom());
			entity.setPrenom(dto.getPrenom());
			entity.setTelephone(dto.getTelephone());
			entity.setEmail(dto.getEmail());
			entity.setAdresse(dto.getAdresse());
		}

		return entity;
	}

	/**
	 * Convert list ContactDto -> list ContactEntity
	 * 
	 * @param List<ContactDto>
	 */
	public static List<ContactEntity> dtosToEntities(List<ContactDto> listDto) {
		List<ContactEntity> list = new ArrayList<>();
		if (Functions.isNotEmpty(listDto)) {
			for (ContactDto dto : listDto) {
				list.add(dtoToEntity(dto));
			}
		}
		return list;
	}

	/**
	 * Convert list ContactEntity -> list ContactDto
	 * 
	 * @param List<ContactEntity>
	 */
	public static List<ContactDto> entitiesToDtos(List<ContactEntity> listEntity) {
		List<ContactDto> list = new ArrayList<>();
		if (Functions.isNotEmpty(listEntity)) {
			for (ContactEntity entity : listEntity) {
				list.add(entityToDto(entity));
			}
		}
		return list;
	}
}