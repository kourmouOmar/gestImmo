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
 * Persistent class for entity stored in table "role_permissions"
 */

@Entity
@Table(name="role_permissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RolePermissionsEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(RolePermissionsEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role_permissions", nullable = false)
    private Long idRolePermissions ;

		
    @ManyToOne
    @JoinColumn(name="id_role", referencedColumnName="id_role")
    private RoleEntity role;

    @ManyToOne
    @JoinColumn(name="id_permission", referencedColumnName="id_permission")
    private PermissionEntity permission;

    @OneToMany(mappedBy="rolePermissions", targetEntity=RoleMenusPermissionsEntity.class)
    private List<RoleMenusPermissionsEntity> listOfRoleMenusPermissions;


     @Override
	 public Long getId() {
		return idRolePermissions;
	} 
 
  
   
}
