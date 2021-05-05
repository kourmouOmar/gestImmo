/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
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
	ProprietaireEntity addProprietaire(ProprietaireDto ProprietaireDto);

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