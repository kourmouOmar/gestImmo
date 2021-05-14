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
 * Persistent class for entity stored in table "utilisateur_roles"
 */

@Entity
@Table(name="utilisateur_roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilisateurRolesEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(UtilisateurRolesEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_utilisateur_roles", nullable = false)
    private Long idUtilisateurRoles ;


	@ManyToOne
	@JoinColumn(name = "id_roles", referencedColumnName="id_role")
	private RoleEntity roleEntity;
	
    @ManyToOne
    @JoinColumn(name="id_utilisateur", referencedColumnName="id_utilisateur")
    private UtilisateurEntity utilisateurEntity;


     @Override
	 public Long getId() {
		return idUtilisateurRoles;
	} 
 
  
   
}
