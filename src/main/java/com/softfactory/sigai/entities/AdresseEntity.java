package com.softfactory.sigai.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
@Table(name = "adresse")
public class AdresseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "num_appartement")
	private int num_appartement;

	@Column(name = "num_etage")
	private int num_etage;

	@Column(name = "batiment")
	private String batiment;

	@Column(name = "quartier")
	private String quartier;
<<<<<<< HEAD
	
	@OneToOne(targetEntity = BienEntity.class , cascade = CascadeType.ALL,mappedBy = "adresse")
    private BienEntity bien;
	
	@OneToOne @JoinColumn(name="id_ville", nullable=false)
    private VilleEntity ville;
	
	@OneToOne @JoinColumn(name="id_region", nullable=false)
    private RegionEntity region;
	
	@OneToOne @JoinColumn(name="id_pays", nullable=false)
    private PaysEntity pays;
	

	@OneToOne @JoinColumn(name="id_acheteur", nullable=false)
    private AcheteurEntity acheteur;
	
	@OneToOne @JoinColumn(name="id_proprietaire", nullable=false)
    private AcheteurEntity proprietaire;
	
	@OneToOne @JoinColumn(name="id_garant", nullable=true)
    private GarantEntity garant;
	
	@OneToOne @JoinColumn(name="id_vente", nullable=true)
    private VenteEntity vente;
=======

	@OneToOne(targetEntity = BienEntity.class, cascade = CascadeType.ALL, mappedBy = "adresse")
	private BienEntity bien;

	@OneToOne
	@JoinColumn(name = "id_ville", nullable = false)
	private VilleEntity ville;

	@OneToOne
	@JoinColumn(name = "id_region", nullable = false)
	private RegionEntity region;

	@OneToOne
	@JoinColumn(name = "id_pays", nullable = false)
	private PaysEntity pays;

	@OneToOne
	@JoinColumn(name = "id_acheteur", nullable = false)
	private AcheteurEntity acheteur;

	@OneToOne
	@JoinColumn(name = "id_proprietaire", nullable = false)
	private AcheteurEntity proprietaire;

	@OneToOne
	@JoinColumn(name = "id_garant", nullable = true)
	private GarantEntity garant;

	@OneToOne
	@JoinColumn(name = "id_vente", nullable = true)
	private VenteEntity vente;
>>>>>>> 8965d793cce4dfc49f5f4a230b4a27d88cee438f

}
