/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.BienDto;
import com.softfactory.sigai.entities.BienEntity;

/**
 * Spring service "Bien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IBienService{

/**
	 * Get Bien by Id
	 * 
	 * @param idBien
	 * @return BienEntity
	 */
	BienEntity getBienById(Long idBien);

	/**
	 * get all Bien
	 *
	 * @return List<BienEntity>
	 */
	List<BienEntity> getAllBiens();

	/**
	 * add Bien
	 *
	 * @param BienDto
	 * @return BienEntity
	 */
	BienEntity addBien(BienDto BienDto);

	/**
	 * update Bien
	 *
	 * @param BienDto
	 * @return BienEntity
	 */
	BienEntity updateBien(BienDto BienDto);

	/**
	 * delete Bien
	 *
	 * @param idBien
	 * @return BienEntity
	 */
	void deleteBien(Long idBien);

}