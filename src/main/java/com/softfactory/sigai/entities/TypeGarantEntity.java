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
 * Persistent class for entity stored in table "type_garant"
 */

@Entity
@Table(name="type_garant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TypeGarantEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(TypeGarantEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_type_garant", nullable = false)
    private Long idTypeGarant ;

    @Column(name="libelle", nullable=false, length=255)
    private String libelle ;
    @Column(name="description", nullable=false, length=255)
    private String description ;

    @OneToMany(mappedBy="typeGarant", targetEntity=GarantEntity.class)
    private List<GarantEntity> listOfGarant;


     @Override
	 public Long getId() {
		return idTypeGarant;
	} 
 
  
   
}
