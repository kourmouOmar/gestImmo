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
 * Persistent class for entity stored in table "utilisateur"
 */

@Entity
@Table(name="utilisateur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilisateurEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(UtilisateurEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utilisateur", nullable = false)
    private Long idUtilisateur ;

    @Column(name="nom", nullable=false, length=255)
    private String nom ;
    @Column(name="prenom", nullable=false, length=255)
    private String prenom ;
    @Column(name="telephone", length=255)
    private String telephone ;
    @Column(name="email", length=255)
    private String email ;
    @Column(name="cin", length=255)
    private String cin ;
    @Column(name="username", nullable=false, length=255)
    private String username ;
    @Column(name="password", nullable=false, length=255)
    private String password ;

    @OneToMany(mappedBy="utilisateur", targetEntity=UtilisateurRolesEntity.class)
    private List<UtilisateurRolesEntity> listOfUtilisateurRoles;


     @Override
	 public Long getId() {
		return idUtilisateur;
	} 
 
  
   
}
