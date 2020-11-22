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
import com.softfactory.sigai.entities.common.AbstractCommonEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Persistent class for entity stored in table "Menu"
 * 
 * @author : Kourmou omar
 * @see : <kourmou.omar@gmail.com>
 * @creation : 21-11-2020
 * @version : 1.0
 */

@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuEntity extends AbstractCommonEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_menu", nullable = false)
	private Long idMenu;

	@Column(name = "libelle", nullable = false)
	private String libelle;

	@Column(name = "icon", nullable = false)
	private String icon;

	@Column(name = "icon_click", nullable = false)
	private String iconClick;

	@Column(name = "url", nullable = false)
	private String url;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private MenuEntity parentMenu;

	@ManyToOne
	@JoinColumn(name = "id_module")
	private ModuleEntity module;

	@OneToMany(mappedBy = "parentMenu", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JsonIgnore
	private List<MenuEntity> childMenus;

	

	/**
	 * copy constructor recommended to use over Clone as The clone method returns a
	 * general Object reference. Therefore, we need to typecast it to the
	 * appropriate type
	 * 
	 * @param entity
	 */
	public MenuEntity(MenuEntity entity) {
		this.idMenu = entity.getIdMenu();
		this.libelle = entity.getLibelle();
		this.icon = entity.getIcon();
		this.iconClick = entity.getIconClick();
		this.url = entity.getUrl();
		this.parentMenu = entity.getParentMenu();
		this.module = entity.getModule();
		this.childMenus = entity.getChildMenus();
	}

	@Override
	public Long getId() {
		return idMenu;
	}
}
