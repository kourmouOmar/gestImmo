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
@Table(name = "pays")
public class PaysEntity {

	private static final long serialVersionUID = -354054054054L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="libelle")
	private String annee_construction;
	
	@Column(name="code")
	private String superficie;
	
	@OneToMany(targetEntity = AdresseEntity.class , cascade = CascadeType.ALL,mappedBy = "pays")
	private List<AdresseEntity> adresse;
}
