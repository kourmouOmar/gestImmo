/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

 
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Persistent class for entity stored in table "locataire"
 */

@Entity
@Table(name="locataire")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LocataireEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(LocataireEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_locataire", nullable = false)
    private Long idLocataire ;

    @Column(name="nom", nullable=false, length=255)
    private String nom ;
    @Column(name="prenom", nullable=false, length=255)
    private String prenom ;
    @Column(name="telephone", length=255)
    private String telephone ;
    @Column(name="email", length=255)
    private String email ;
    @Column(name="cin", nullable=false, length=255)
    private String cin ;
    @Column(name="rib", length=255)
    private String rib ;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_naissance", nullable=false)
    private Date dateNaissance ;
		
    @ManyToOne
    @JoinColumn(name="id_adresse", referencedColumnName="id_adresse")
    private AdresseEntity adresse;

    @ManyToOne
    @JoinColumn(name="id_garant", referencedColumnName="id_garant")
    private GarantEntity garant;


     @Override
	 public Long getId() {
		return idLocataire;
	} 
 
  
   
}
