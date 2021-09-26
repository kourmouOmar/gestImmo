/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "role_modules"
 */

@Entity
@Table(name = "role_modules")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleModulesEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role_modules", nullable = false)
	private Long idRoleModules;

	@ManyToOne
	@JoinColumn(name = "id_module", referencedColumnName = "id_module")
	private ModuleEntity module;

	@ManyToOne
	@JoinColumn(name = "id_role", referencedColumnName = "id_role")
	private RoleEntity role;

	@Override
	public Long getId() {
		return idRoleModules;
	}

}
