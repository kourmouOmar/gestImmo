/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.GarantDto;
import com.softfactory.sigai.entities.GarantEntity;

/**
 * Spring service "Garant"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IGarantService{

/**
	 * Get Garant by Id
	 * 
	 * @param idGarant
	 * @return GarantEntity
	 */
	GarantEntity getGarantById(Long idGarant);

	/**
	 * get all Garant
	 *
	 * @return List<GarantEntity>
	 */
	List<GarantEntity> getAllGarants();

	/**
	 * add Garant
	 *
	 * @param GarantDto
	 * @return GarantEntity
	 */
	GarantEntity addGarant(GarantDto GarantDto);

	/**
	 * update Garant
	 *
	 * @param GarantDto
	 * @return GarantEntity
	 */
	GarantEntity updateGarant(GarantDto GarantDto);

	/**
	 * delete Garant
	 *
	 * @param idGarant
	 * @return GarantEntity
	 */
	void deleteGarant(Long idGarant);

}