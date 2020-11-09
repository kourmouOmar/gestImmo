package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.PaysDto;
import com.softfactory.sigai.entities.PaysEntity;

/**
 * Spring service "Pays"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IPaysService{

/**
	 * Get Pays by Id
	 * 
	 * @param idPays
	 * @return PaysEntity
	 */
	PaysEntity getPaysById(Long idPays);

	/**
	 * get all Pays
	 *
	 * @return List<PaysEntity>
	 */
	List<PaysEntity> getAllPayss();

	/**
	 * add Pays
	 *
	 * @param PaysDto
	 * @return PaysEntity
	 */
	PaysEntity addPays(PaysDto PaysDto);

	/**
	 * update Pays
	 *
	 * @param PaysDto
	 * @return PaysEntity
	 */
	PaysEntity updatePays(PaysDto PaysDto);

	/**
	 * delete Pays
	 *
	 * @param idPays
	 * @return PaysEntity
	 */
	void deletePays(Long idPays);

}