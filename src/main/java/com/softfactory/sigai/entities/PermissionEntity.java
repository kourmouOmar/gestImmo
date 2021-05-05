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
 * Persistent class for entity stored in table "permission"
 */

@Entity
@Table(name="permission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PermissionEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(PermissionEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_permission", nullable = false)
    private Long idPermission ;

    @Column(name="libelle", nullable=false, length=50)
    private String libelle ;
    @Column(name="description", length=255)
    private String description ;
    @Column(name="active", nullable=false)
    private Boolean active ;
    @Column(name="parent_id")
    private Long parentId ;

    @OneToMany(mappedBy="permission", targetEntity=RolePermissionsEntity.class)
    private List<RolePermissionsEntity> listOfRolePermissions;


     @Override
	 public Long getId() {
		return idPermission;
	} 
 
  
   
}
