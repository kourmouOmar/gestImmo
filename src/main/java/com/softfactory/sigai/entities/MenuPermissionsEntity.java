/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

 
import java.util.Date;



import lombok.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "menu_permissions"
 */

@Entity
@Table(name="menu_permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuPermissionsEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(MenuPermissionsEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_menu_permissions", nullable = false)
    private Long idMenuPermissions ;

    @Column(name="id_permission")
    private Long idPermission ;
	
    @ManyToOne
    @JoinColumn(name="id_menu", referencedColumnName="id_menu")
    private MenuEntity menu;

    @OneToMany(mappedBy="menuPermissions", targetEntity=RoleMenusPermissionsEntity.class)
    private List<RoleMenusPermissionsEntity> listOfRoleMenusPermissions;


     @Override
	 public Long getId() {
		return idMenuPermissions;
	} 
 
  
   
}
