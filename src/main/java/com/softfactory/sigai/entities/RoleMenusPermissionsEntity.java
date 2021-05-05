/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

 
import java.util.Date;



import lombok.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import javax.persistence.*;

/**
 * Persistent class for entity stored in table "role_menus_permissions"
 */

@Entity
@Table(name="role_menus_permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleMenusPermissionsEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(RoleMenusPermissionsEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role_menus_permissions", nullable = false)
    private Long idRoleMenusPermissions ;

		
    @ManyToOne
    @JoinColumn(name="id_role_permissions", referencedColumnName="id_role_permissions")
    private RolePermissionsEntity rolePermissions;

    @ManyToOne
    @JoinColumn(name="id_menu_permissions", referencedColumnName="id_menu_permissions")
    private MenuPermissionsEntity menuPermissions;


     @Override
	 public Long getId() {
		return idRoleMenusPermissions;
	} 
 
  
   
}
