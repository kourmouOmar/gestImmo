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
 * Persistent class for entity stored in table "pays"
 */

@Entity
@Table(name="pays")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaysEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(PaysEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pays", nullable = false)
    private Long idPays ;

    @Column(name="libelle", nullable=false, length=255)
    private String libelle ;
    @Column(name="code", nullable=false, length=255)
    private String code ;

    @OneToMany(mappedBy="pays", targetEntity=AdresseEntity.class)
    private List<AdresseEntity> listOfAdresse;


     @Override
	 public Long getId() {
		return idPays;
	} 
 
  
   
}
