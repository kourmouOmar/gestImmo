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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "role_menus"
 */

@Entity
@Table(name="role_menus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleMenusEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(RoleMenusEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role_menus", nullable = false)
    private Long idRoleMenus ;

		
    @ManyToOne
    @JoinColumn(name="id_menu", referencedColumnName="id_menu")
    private MenuEntity menu;

    @ManyToOne
    @JoinColumn(name="id_role", referencedColumnName="id_role")
    private RoleEntity role;


     @Override
	 public Long getId() {
		return idRoleMenus;
	} 
 
  
   
}
