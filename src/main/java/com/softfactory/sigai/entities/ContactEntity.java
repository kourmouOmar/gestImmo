/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "contact"
 */

@Entity
@Table(name = "contact")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ContactEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contact", nullable = false)
	private Long idContact;

	@Column(name = "nom", nullable = false, length = 255)
	private String nom;
	@Column(name = "prenom", nullable = false, length = 255)
	private String prenom;
	@Column(name = "telephone", length = 255)
	private String telephone;

	@Column(name = "email", length = 255)
	private String email;

	@Column(name = "adresse", length = 255)
	private String adresse;

	@Override
	public Long getId() {
		return idContact;
	}

}
