package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.ProprietaireDto;
import com.softfactory.sigai.entities.ProprietaireEntity;

/**
 * Spring service "Proprietaire"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IProprietaireService{

/**
	 * Get Proprietaire by Id
	 * 
	 * @param idProprietaire
	 * @return ProprietaireEntity
	 */
	ProprietaireEntity getProprietaireById(Long idProprietaire);

	/**
	 * get all Proprietaire
	 *
	 * @return List<ProprietaireEntity>
	 */
	List<ProprietaireEntity> getAllProprietaires();

	/**
	 * add Proprietaire
	 *
	 * @param ProprietaireDto
	 * @return ProprietaireEntity
	 */
	ProprietaireEntity addProprietaire(ProprietaireEntity proprietaireEntity);

	/**
	 * update Proprietaire
	 *
	 * @param ProprietaireDto
	 * @return ProprietaireEntity
	 */
	ProprietaireEntity updateProprietaire(ProprietaireDto ProprietaireDto);

	/**
	 * delete Proprietaire
	 *
	 * @param idProprietaire
	 * @return ProprietaireEntity
	 */
	void deleteProprietaire(Long idProprietaire);

}