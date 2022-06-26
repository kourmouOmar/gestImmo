/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class statiDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idAcheteur;
	@NotNull
	@Size(max = 255)
	private String nom;
	@NotNull
	@Size(max = 255)
	private String prenom;
	@Size(max = 255)
	private String telephone;
	@Size(max = 255)
	private String email;

}