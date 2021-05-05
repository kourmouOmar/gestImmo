/*
 * Be careful, do not modify this class, it is generated automatically.
 */

package com.softfactory.sigai.entities;

 
import java.util.Date;



import lombok.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Date;

import javax.persistence.*;

/**
 * Persistent class for entity stored in table "location"
 */

@Entity
@Table(name="location")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LocationEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(LocationEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_location", nullable = false)
    private Long idLocation ;

    @Column(name="duree")
    private Double duree ;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_acquisition")
    private Date dateAcquisition ;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_liberation")
    private Date dateLiberation ;
    @Column(name="loyer")
    private Double loyer ;
    @Column(name="id_locataire")
    private Long idLocataire ;
	
    @ManyToOne
    @JoinColumn(name="id_bien", referencedColumnName="id_bien")
    private BienEntity bien;


     @Override
	 public Long getId() {
		return idLocation;
	} 
 
  
   
}
