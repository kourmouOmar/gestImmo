package com.softfactory.sigai.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Persistent class for entity stored in table "acheteur"
 * 
 * @author : Kourmou omar
 * @see : <kourmou.omar@gmail.com>
 * @creation : 21-11-2020
 * @version : 1.0
 */

@Entity
//@Data
@Table(name = "proprietaire")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class ProprietaireEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	@Column(name = "email")
	private String email;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "cin")
	private String cin;

	@Column(name = "rib")
	private String rib;

	@OneToMany(targetEntity = AdresseEntity.class, cascade = CascadeType.ALL, mappedBy = "proprietaire")
	private List<AdresseEntity> adresse;
}
