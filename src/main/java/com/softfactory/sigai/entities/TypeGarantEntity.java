package com.softfactory.sigai.entities;

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
 * Persistent class for entity stored in table "typeGarant"
 * 
 * @author : Kourmou omar
 * @see : <kourmou.omar@gmail.com>
 * @creation : 21-11-2020
 * @version : 1.0
 */

@Entity
@RequiredArgsConstructor
@Data
@Table(name = "type_garant")
public class TypeGarantEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "libelle")
	private String libelle;

	@OneToMany(targetEntity = GarantEntity.class, cascade = CascadeType.ALL, mappedBy = "type_garant")
	private List<GarantEntity> garantEntity;

}
