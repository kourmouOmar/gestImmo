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

    @Column(name="id_roles", nullable=false)
    private Long idRoles ;
	
    @ManyToOne
    @JoinColumn(name="id_utilisateur", referencedColumnName="id_utilisateur")
    private UtilisateurEntity utilisateur;


     @Override
	 public Long getId() {
		return idUtilisateurRoles;
	} 
 
  
   
}
