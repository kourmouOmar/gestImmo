package com.softfactory.sigai.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
@Table(name = "role")
public class RoleEntity {
	
	private static final long serialVersionUID = -354054054054L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	@Column(name="libelle")
	private String libelle;
	
	@Column(name="description")
	private String description;
	
	
	@OneToMany(targetEntity = UserEntity.class , cascade = CascadeType.ALL,mappedBy = "utilisateur")
	@JsonIgnore
	private UserEntity userEntity;
	

}
