/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "proprietaire"
 */

@Entity
@Table(name = "proprietaire")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProprietaireEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_proprietaire", nullable = false)
	private Long idProprietaire;

	@Column(name = "nom", nullable = false, length = 255)
	private String nom;
	@Column(name = "prenom", nullable = false, length = 255)
	private String prenom;
	@Column(name = "telephone", length = 255)
	private String telephone;
	@Column(name = "email", length = 255)
	private String email;
	@Column(name = "cin", nullable = false, length = 255)
	private String cin;
	@Column(name = "rib", length = 255)
	private String rib;

	@OneToMany(mappedBy = "proprietaire", targetEntity = BienEntity.class)
	private List<BienEntity> listOfBien;

	@ManyToOne
	@JoinColumn(name = "id_adresse", referencedColumnName = "id_adresse")
	private AdresseEntity adresse;

	@Override
	public Long getId() {
		return idProprietaire;
	}

}
