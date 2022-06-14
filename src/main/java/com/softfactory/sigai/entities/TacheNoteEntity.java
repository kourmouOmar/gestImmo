/*
How does spring.jpa.hibernate.ddl-auto property exactly work in Spring? * Be careful, do not modify this class, it is generated automatically.
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
 * Persistent class for entity stored in table "tache note"
 */

@Entity
@Table(name = "tache_note")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TacheNoteEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "sujet", length = 255)
	private String sujet;

	@Column(name = "description", length = 255)
	private String description;

	@Column(name = "utilisateur", length = 255)
	private String utilisateur;

	@Override
	public Long getId() {
		return id;
	}

}
