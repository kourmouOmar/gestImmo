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
 * Persistent class for entity stored in table "module"
 */

@Entity
@Table(name="module")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ModuleEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(ModuleEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_module", nullable = false)
    private Long idModule ;

    @Column(name="active")
    private Boolean active ;
    @Column(name="code", length=255)
    private String code ;
    @Column(name="color_libelle", length=255)
    private String colorLibelle ;
    @Column(name="description", length=255)
    private String description ;
    @Column(name="icone_active", length=255)
    private String iconeActive ;
    @Column(name="icone_hover", length=255)
    private String iconeHover ;
    @Column(name="icone_normale", length=255)
    private String iconeNormale ;
    @Column(name="libelle", length=255)
    private String libelle ;

    @OneToMany(mappedBy="module", targetEntity=RoleModulesEntity.class)
    private List<RoleModulesEntity> listOfRoleModules;

    @OneToMany(mappedBy="module", targetEntity=MenuEntity.class)
    private List<MenuEntity> listOfMenu;


     @Override
	 public Long getId() {
		return idModule;
	} 
 
  
   
}
