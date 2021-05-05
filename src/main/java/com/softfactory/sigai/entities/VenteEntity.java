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
 * Persistent class for entity stored in table "vente"
 */

@Entity
@Table(name="vente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VenteEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(VenteEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vente", nullable = false)
    private Long idVente ;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_vente", nullable=false)
    private Date dateVente ;
    @Column(name="prix", nullable=false)
    private Double prix ;
		
    @ManyToOne
    @JoinColumn(name="id_bien", referencedColumnName="id_bien")
    private BienEntity bien;

    @ManyToOne
    @JoinColumn(name="id_acheteur", referencedColumnName="id_acheteur")
    private AcheteurEntity acheteur;


     @Override
	 public Long getId() {
		return idVente;
	} 
 
  
   
}
