package com.softfactory.sigai.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
@Table(name = "region")
public class RegionEntity {

	private static final long serialVersionUID = -354054054054L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="libelle")
	private String libelle;
	
	@OneToMany(targetEntity = AdresseEntity.class , cascade = CascadeType.ALL,mappedBy = "region")
	private List<AdresseEntity> adresse;
}
