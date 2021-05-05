/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
/**
 * Spring service "Vente"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IVenteService{

/**
	 * Get Vente by Id
	 * 
	 * @param idVente
	 * @return VenteEntity
	 */
	VenteEntity getVenteById(Long idVente);

	/**
	 * get all Vente
	 *
	 * @return List<VenteEntity>
	 */
	List<VenteEntity> getAllVentes();

	/**
	 * add Vente
	 *
	 * @param VenteDto
	 * @return VenteEntity
	 */
	VenteEntity addVente(VenteDto VenteDto);

	/**
	 * update Vente
	 *
	 * @param VenteDto
	 * @return VenteEntity
	 */
	VenteEntity updateVente(VenteDto VenteDto);

	/**
	 * delete Vente
	 *
	 * @param idVente
	 * @return VenteEntity
	 */
	void deleteVente(Long idVente);

}