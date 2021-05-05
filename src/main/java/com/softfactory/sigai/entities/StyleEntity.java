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
 * Persistent class for entity stored in table "style"
 */

@Entity
@Table(name="style")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StyleEntity extends AbstractCommonEntity<Long>  implements Cloneable  {

    private static Logger logger = LoggerFactory.getLogger(StyleEntity.class);
 
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_style", nullable = false)
    private Long idStyle ;

    @Column(name="libelle", length=255)
    private String libelle ;
    @Column(name="description", length=255)
    private String description ;

    @OneToMany(mappedBy="style", targetEntity=BienEntity.class)
    private List<BienEntity> listOfBien;


     @Override
	 public Long getId() {
		return idStyle;
	} 
 
  
   
}
