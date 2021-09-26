/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "permission"
 */

@Entity
@Table(name = "permission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PermissionEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_permission", nullable = false)
	private Long idPermission;

	@Column(name = "libelle", nullable = false, length = 50)
	private String libelle;

	@Column(name = "description", length = 255)
	private String description;

	@Column(name = "active", nullable = false)
	private Boolean active;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private PermissionEntity parentPermission;

	@OneToMany(mappedBy = "permission", targetEntity = RolePermissionsEntity.class)
	private List<RolePermissionsEntity> listOfRolePermissions;

	@OneToMany(mappedBy = "parentPermission", cascade = CascadeType.ALL, orphanRemoval = true)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<PermissionEntity> childPerms;

	@Override
	public Long getId() {
		return idPermission;
	}

}
