package com.softfactory.sigai.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Persistent class for entity stored in table "location"
 * 
 * @author : Kourmou omar
 * @see : <kourmou.omar@gmail.com>
 * @creation : 21-11-2020
 * @version : 1.0
 */

@Entity
@Table(name = "location")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationEntity {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="dateAcquisition")
	private Date dateAcquisition;
	
	@Column(name="dateLiberation")
	private Date dateLiberation;
	
	@Column(name="duree")
	private String duree;
	
	@Column(name="loyer")
	private double loyer;

	@OneToOne @JoinColumn(name="id_bien", nullable=false)
    private BienEntity bien;
	
	@OneToOne @JoinColumn(name="id_locataire", nullable=false)
    private GarantEntity locataire;
}
