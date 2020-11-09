package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.EtatDto;
import com.softfactory.sigai.entities.EtatEntity;

/**
 * Spring service "Etat"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IEtatService{

/**
	 * Get Etat by Id
	 * 
	 * @param idEtat
	 * @return EtatEntity
	 */
	EtatEntity getEtatById(Long idEtat);

	/**
	 * get all Etat
	 *
	 * @return List<EtatEntity>
	 */
	List<EtatEntity> getAllEtats();

	/**
	 * add Etat
	 *
	 * @param EtatDto
	 * @return EtatEntity
	 */
	EtatEntity addEtat(EtatDto EtatDto);

	/**
	 * update Etat
	 *
	 * @param EtatDto
	 * @return EtatEntity
	 */
	EtatEntity updateEtat(EtatDto EtatDto);

	/**
	 * delete Etat
	 *
	 * @param idEtat
	 * @return EtatEntity
	 */
	void deleteEtat(Long idEtat);

}