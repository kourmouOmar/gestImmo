/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.VilleDto;
import com.softfactory.sigai.entities.VilleEntity;

/**
 * Spring service "Ville"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IVilleService{

	/**
	 * Get Ville by Id
	 * 
	 * @param idVille
	 * @return VilleEntity
	 */
	VilleEntity getVilleById(Long idVille);

	/**
	 * get all Ville
	 *
	 * @return List<VilleEntity>
	 */
	List<VilleEntity> getAllVilles();

	/**
	 * add Ville
	 *
	 * @param VilleDto
	 * @return VilleEntity
	 */
	VilleEntity addVille(VilleDto VilleDto);

	/**
	 * update Ville
	 *
	 * @param VilleDto
	 * @return VilleEntity
	 */
	VilleEntity updateVille(VilleDto VilleDto);

	/**
	 * delete Ville
	 *
	 * @param idVille
	 * @return VilleEntity
	 */
	void deleteVille(Long idVille);

}