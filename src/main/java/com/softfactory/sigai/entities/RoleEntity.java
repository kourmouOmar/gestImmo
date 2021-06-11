/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

 
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "role"
 */

@Entity
@Table(name="role")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(RoleEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role", nullable = false)
    private Long idRole ;

    @Column(name="libelle", length=255)
    private String libelle ;
    
    @Column(name="description", length=255)
    private String description ;

    @OneToMany(mappedBy="role", targetEntity=RoleMenusEntity.class)
    private List<RoleMenusEntity> listOfRoleMenus;

    @OneToMany(mappedBy="role", targetEntity=RoleModulesEntity.class)
    private List<RoleModulesEntity> listOfRoleModules;

    @OneToMany(mappedBy="role", targetEntity=RolePermissionsEntity.class)
    private List<RolePermissionsEntity> listOfRolePermissions;


     @Override
	 public Long getId() {
		return idRole;
	} 
 
  
   
}
