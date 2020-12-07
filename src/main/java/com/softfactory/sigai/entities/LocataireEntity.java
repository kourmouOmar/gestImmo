package com.softfactory.sigai.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class LocataireEntity {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="rib")
	private String rib;
	
	@Column(name="dateNaissance")
	private String dateNaissance;
	
	@Column(name="profession")
	private String profession;
	
	@OneToOne @JoinColumn(name="id_adresse", nullable=false)
    private AdresseEntity adresse;
	
	@OneToOne @JoinColumn(name="id_Garant", nullable=false)
    private GarantEntity garant;
}
