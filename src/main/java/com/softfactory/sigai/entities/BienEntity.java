package com.softfactory.sigai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@Data
@Table(name = "bien")
public class BienEntity {
	
	private static final long serialVersionUID = -354054054054L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="annee_construction")
	private String annee_construction;
	
	@Column(name="superficie")
	private String superficie;
	
	@Column(name="nombre_pieces")
	private String nombre_pieces;
	
	@OneToOne @JoinColumn(name="id_adresse", nullable=false)
    private AdresseEntity adresse;
	
	@ManyToOne @JoinColumn(name="id_style", nullable=false)
    private StyleEntity style;
	
	@ManyToOne @JoinColumn(name="id_view", nullable=false)
    private ViewEntity view;
	
	@ManyToOne @JoinColumn(name="id_etat", nullable=false)
    private EtatEntity etat;
	
	@OneToOne @JoinColumn(name="id_type", nullable=false)
    private TypeBienEntity type_bien;
	
	@OneToOne @JoinColumn(name="id_vente", nullable=true)
    private VenteEntity vente;
	
	/*
	@ManyToOne @JoinColumn(name="id_proprietaire", nullable=false)
    private ProprietaireEntity proprietaire;
    */
	
}
