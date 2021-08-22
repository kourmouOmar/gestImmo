/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * Persistent class for entity stored in table "menu"
 */

@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuEntity extends AbstractCommonEntity<Long> implements Cloneable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_menu", nullable = false)
	private Long idMenu;

	@Column(name = "libelle", nullable = false, length = 50)
	private String libelle;

	@Column(name = "icon", nullable = false, length = 50)
	private String icon;

	@Column(name = "icon_click", nullable = false, length = 50)
	private String iconClick;

	@Column(name = "url", nullable = false, length = 100)
	private String url;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private MenuEntity parentMenu;

	@ManyToOne
	@JoinColumn(name = "id_module", referencedColumnName = "id_module")
	private ModuleEntity module;

	@OneToMany(mappedBy = "parentMenu", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@LazyCollection(LazyCollectionOption.FALSE)
	//@JsonIgnore
	private List<MenuEntity> childMenus;

	@OneToMany(mappedBy = "menu", targetEntity = RoleMenusEntity.class)
	private List<RoleMenusEntity> listOfRoleMenus;

	@OneToMany(mappedBy = "menu", targetEntity = MenuPermissionsEntity.class)
	private List<MenuPermissionsEntity> listOfMenuPermissions;

	@Override
	public Long getId() {
		return idMenu;
	}

	public MenuEntity(MenuEntity entity) {
		this.idMenu = entity.getIdMenu();
		this.libelle = entity.getLibelle();
		this.icon = entity.getIcon();
		this.iconClick = entity.getIconClick();
		this.url = entity.getUrl();
		this.parentMenu = entity.getParentMenu();
		this.module = entity.getModule();
		this.childMenus = entity.getChildMenus();
		this.listOfMenuPermissions = entity.getListOfMenuPermissions();
	}

}
