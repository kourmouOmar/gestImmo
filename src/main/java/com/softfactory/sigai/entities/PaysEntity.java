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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "pays"
 */

@Entity
@Table(name = "pays")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaysEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pays", nullable = false)
	private Long idPays;

	@Column(name = "libelle", nullable = false, length = 255)
	private String libelle;
	@Column(name = "code", nullable = false, length = 255)
	private String code;

	@OneToMany(mappedBy = "pays", targetEntity = AdresseEntity.class)
	private List<AdresseEntity> listOfAdresse;

	@Override
	public Long getId() {
		return idPays;
	}

}
