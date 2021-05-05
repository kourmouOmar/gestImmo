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
 * Persistent class for entity stored in table "garant"
 */

@Entity
@Table(name="garant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GarantEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(GarantEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_garant", nullable = false)
    private Long idGarant ;

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
		
    @ManyToOne
    @JoinColumn(name="id_adresse", referencedColumnName="id_adresse")
    private AdresseEntity adresse;

    @OneToMany(mappedBy="garant", targetEntity=LocataireEntity.class)
    private List<LocataireEntity> listOfLocataire;

    @ManyToOne
    @JoinColumn(name="id_type_garant", referencedColumnName="id_type_garant")
    private TypeGarantEntity typeGarant;


     @Override
	 public Long getId() {
		return idGarant;
	} 
 
  
   
}
