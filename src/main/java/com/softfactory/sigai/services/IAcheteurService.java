/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.AcheteurDto;
import com.softfactory.sigai.entities.AcheteurEntity;


/**
 * Spring service "Acheteur"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IAcheteurService{

	/**
	 * Get Acheteur by Id
	 * 
	 * @param idAcheteur
	 * @return AcheteurEntity
	 */
	AcheteurEntity getAcheteurById(Long idAcheteur);

	/**
	 * get all Acheteur
	 *
	 * @return List<AcheteurEntity>
	 */
	List<AcheteurEntity> getAllAcheteurs();

	/**
	 * add Acheteur
	 *
	 * @param AcheteurDto
	 * @return AcheteurEntity
	 */
	AcheteurEntity addAcheteur(AcheteurDto AcheteurDto);

	/**
	 * update Acheteur
	 *
	 * @param AcheteurDto
	 * @return AcheteurEntity
	 */
	AcheteurEntity updateAcheteur(AcheteurDto AcheteurDto);

	/**
	 * delete Acheteur
	 *
	 * @param idAcheteur
	 * @return AcheteurEntity
	 */
	void deleteAcheteur(Long idAcheteur);

}