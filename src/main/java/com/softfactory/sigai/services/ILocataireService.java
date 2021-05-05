/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.LocataireDto;
import com.softfactory.sigai.entities.LocataireEntity;

/**
 * Spring service "Locataire"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface ILocataireService{

/**
	 * Get Locataire by Id
	 * 
	 * @param idLocataire
	 * @return LocataireEntity
	 */
	LocataireEntity getLocataireById(Long idLocataire);

	/**
	 * get all Locataire
	 *
	 * @return List<LocataireEntity>
	 */
	List<LocataireEntity> getAllLocataires();

	/**
	 * add Locataire
	 *
	 * @param LocataireDto
	 * @return LocataireEntity
	 */
	LocataireEntity addLocataire(LocataireDto LocataireDto);

	/**
	 * update Locataire
	 *
	 * @param LocataireDto
	 * @return LocataireEntity
	 */
	LocataireEntity updateLocataire(LocataireDto LocataireDto);

	/**
	 * delete Locataire
	 *
	 * @param idLocataire
	 * @return LocataireEntity
	 */
	void deleteLocataire(Long idLocataire);

}