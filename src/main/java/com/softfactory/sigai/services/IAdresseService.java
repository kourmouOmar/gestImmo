/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.AdresseDto;
import com.softfactory.sigai.entities.AdresseEntity;


/**
 * Spring service "Adresse"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IAdresseService{

/**
	 * Get Adresse by Id
	 * 
	 * @param idAdresse
	 * @return AdresseEntity
	 */
	AdresseEntity getAdresseById(Long idAdresse);

	/**
	 * get all Adresse
	 *
	 * @return List<AdresseEntity>
	 */
	List<AdresseEntity> getAllAdresses();

	/**
	 * add Adresse
	 *
	 * @param AdresseDto
	 * @return AdresseEntity
	 */
	AdresseEntity addAdresse(AdresseDto AdresseDto);

	/**
	 * update Adresse
	 *
	 * @param AdresseDto
	 * @return AdresseEntity
	 */
	AdresseEntity updateAdresse(AdresseDto AdresseDto);

	/**
	 * delete Adresse
	 *
	 * @param idAdresse
	 * @return AdresseEntity
	 */
	void deleteAdresse(Long idAdresse);

}