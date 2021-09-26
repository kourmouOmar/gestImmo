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
 * Persistent class for entity stored in table "vue"
 */

@Entity
@Table(name = "vue")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VueEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vue", nullable = false)
	private Long idVue;

	@Column(name = "libelle", length = 255)
	private String libelle;
	@Column(name = "description", length = 255)
	private String description;

	@OneToMany(mappedBy = "vue", targetEntity = BienEntity.class)
	private List<BienEntity> listOfBien;

	@Override
	public Long getId() {
		return idVue;
	}

}
