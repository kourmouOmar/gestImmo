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
 * Persistent class for entity stored in table "ville"
 */

@Entity
@Table(name="ville")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VilleEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(VilleEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ville", nullable = false)
    private Long idVille ;

    @Column(name="libelle", nullable=false, length=255)
    private String libelle ;

    @OneToMany(mappedBy="ville", targetEntity=AdresseEntity.class)
    private List<AdresseEntity> listOfAdresse;


     @Override
	 public Long getId() {
		return idVille;
	} 
 
  
   
}
