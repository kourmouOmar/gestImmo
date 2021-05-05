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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * Persistent class for entity stored in table "adresse"
 */

@Entity
@Table(name="adresse")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdresseEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(AdresseEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_adresse", nullable = false)
    private Long idAdresse ;

    @Column(name="num_appartement", length=255)
    private String numAppartement ;
    @Column(name="etage")
    private Double etage ;
    @Column(name="batiment", length=255)
    private String batiment ;
    @Column(name="quartier", length=255)
    private String quartier ;
    @Column(name="code_postale")
    private Double codePostale ;
		
    @OneToMany(mappedBy="adresse", targetEntity=BienEntity.class)
    private List<BienEntity> listOfBien;

    @OneToMany(mappedBy="adresse", targetEntity=AcheteurEntity.class)
    private List<AcheteurEntity> listOfAcheteur;

    @OneToMany(mappedBy="adresse", targetEntity=GarantEntity.class)
    private List<GarantEntity> listOfGarant;

    @ManyToOne
    @JoinColumn(name="id_pays", referencedColumnName="id_pays")
    private PaysEntity pays;

    @OneToMany(mappedBy="adresse", targetEntity=LocataireEntity.class)
    private List<LocataireEntity> listOfLocataire;

    @ManyToOne
    @JoinColumn(name="id_ville", referencedColumnName="id_ville")
    private VilleEntity ville;

    @OneToMany(mappedBy="adresse", targetEntity=ProprietaireEntity.class)
    private List<ProprietaireEntity> listOfProprietaire;


     @Override
	 public Long getId() {
		return idAdresse;
	} 
 
  
   
}
