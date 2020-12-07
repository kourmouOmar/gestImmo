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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.softfactory.sigai.entities.common.AbstractCommonEntity;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Persistent class for entity stored in table "Module"
 * 
 * @author : Kourmou omar
 * @see : <kourmou.omar@gmail.com>
 * @creation : 21-11-2020
 * @version : 1.0
 */

@Entity
@Table(name = "module")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ModuleEntity extends AbstractCommonEntity<Long> {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_modules", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(length = 50)
	private String libelle;

	@NotNull
	@Column(length = 50)
	private String code;

	@NotNull
	private Boolean active;

	@Column(length = 150)
	private String description;

	@Column(length = 50)
	private String iconeActive;

	@Column(length = 50)
	private String iconeNormale;

	@Column(length = 50)
	private String iconeHover;
	
	@Column(length = 50)
	private String colorLibelle;

	
	@OneToMany(mappedBy = "module", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnore
	private List<MenuEntity> menus;

	/**
	 * copy constructor recommended to use over Clone as The clone method returns a
	 * general Object reference. Therefore, we need to typecast it to the
	 * appropriate type
	 * 
	 * @param entity
	 */
	public ModuleEntity(ModuleEntity entity) {
		this.id = entity.getId();
		this.libelle = entity.getLibelle();
		this.code = entity.getCode();
		this.active = entity.getActive();
		this.description = entity.getDescription();
		this.iconeActive = entity.getIconeActive();
		this.iconeNormale = entity.getIconeNormale();
		this.iconeHover = entity.getIconeHover();
		this.colorLibelle = entity.getColorLibelle();
	}


}
