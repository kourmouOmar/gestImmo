/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "location"
 */

@Entity
@Table(name = "location")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LocationEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_location", nullable = false)
	private Long idLocation;

	@Column(name = "duree")
	private Double duree;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_acquisition")
	private Date dateAcquisition;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_liberation")
	private Date dateLiberation;
	@Column(name = "loyer")
	private Double loyer;
	@Column(name = "id_locataire")
	private Long idLocataire;

	@ManyToOne
	@JoinColumn(name = "id_bien", referencedColumnName = "id_bien")
	private BienEntity bien;

	@Override
	public Long getId() {
		return idLocation;
	}

}
