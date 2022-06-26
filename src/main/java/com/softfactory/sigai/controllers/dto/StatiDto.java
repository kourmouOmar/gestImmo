/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.controllers.dto;

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
public class StatiDto {

	private Long nombreLocations;
	private Long nombreVente;
	private Long nombreProprietaire;
	private Long nombreBien;

}