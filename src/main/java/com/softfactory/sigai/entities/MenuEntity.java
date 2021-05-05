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
 * Persistent class for entity stored in table "menu"
 */

@Entity
@Table(name="menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(MenuEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_menu", nullable = false)
    private Long idMenu ;

    @Column(name="libelle", nullable=false, length=50)
    private String libelle ;
    @Column(name="icon", nullable=false, length=50)
    private String icon ;
    @Column(name="icon_click", nullable=false, length=50)
    private String iconClick ;
    @Column(name="url", nullable=false, length=100)
    private String url ;
    @Column(name="parent_id")
    private Long parentId ;
	
    @ManyToOne
    @JoinColumn(name="id_module", referencedColumnName="id_module")
    private ModuleEntity module;

    @OneToMany(mappedBy="menu", targetEntity=RoleMenusEntity.class)
    private List<RoleMenusEntity> listOfRoleMenus;

    @OneToMany(mappedBy="menu", targetEntity=MenuPermissionsEntity.class)
    private List<MenuPermissionsEntity> listOfMenuPermissions;


     @Override
	 public Long getId() {
		return idMenu;
	} 
 
  
   
}
