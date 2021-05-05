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
 * Persistent class for entity stored in table "bien"
 */

@Entity
@Table(name="bien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BienEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(BienEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bien", nullable = false)
    private Long idBien ;

    @Column(name="annee_construction")
    private Long anneeConstruction ;
    @Column(name="superficie")
    private Double superficie ;
    @Column(name="nombre_pieces")
    private Long nombrePieces ;
						
    @ManyToOne
    @JoinColumn(name="id_style", referencedColumnName="id_style")
    private StyleEntity style;

    @OneToMany(mappedBy="bien", targetEntity=VenteEntity.class)
    private List<VenteEntity> listOfVente;

    @ManyToOne
    @JoinColumn(name="id_type", referencedColumnName="id_type_bien")
    private TypeBienEntity typeBien;

    @ManyToOne
    @JoinColumn(name="id_etat", referencedColumnName="id_etat")
    private EtatEntity etat;

    @ManyToOne
    @JoinColumn(name="id_adresse", referencedColumnName="id_adresse")
    private AdresseEntity adresse;

    @ManyToOne
    @JoinColumn(name="id_proprietaire", referencedColumnName="id_proprietaire")
    private ProprietaireEntity proprietaire;

    @OneToMany(mappedBy="bien", targetEntity=LocationEntity.class)
    private List<LocationEntity> listOfLocation;

    @ManyToOne
    @JoinColumn(name="id_vue", referencedColumnName="id_vue")
    private VueEntity vue;


     @Override
	 public Long getId() {
		return idBien;
	} 
 
  
   
}
