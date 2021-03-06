package com.softfactory.sigai.entities;

import java.util.Date;
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

/**
 * Persistent class for entity stored in table "acheteur"
 * 
 * @author : Kourmou omar
 * @see : <kourmou.omar@gmail.com>
 * @creation : 21-11-2020
 * @version : 1.0
 */

@Entity
@RequiredArgsConstructor
@Data
@Table(name = "vente")
public class VenteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "dateVente")
	private Date dateVente;

	@Column(name = "prix")
	private double prix;

	@OneToMany(targetEntity = AdresseEntity.class, cascade = CascadeType.ALL, mappedBy = "vente")
	private List<AdresseEntity> adresse;

	@OneToMany(targetEntity = BienEntity.class, cascade = CascadeType.ALL, mappedBy = "vente")
	private List<BienEntity> bien;
}
