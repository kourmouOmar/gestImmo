/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.TypeGarantDto;
import com.softfactory.sigai.entities.TypeGarantEntity;

/**
 * Spring service "TypeGarant"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface ITypeGarantService{

/**
	 * Get TypeGarant by Id
	 * 
	 * @param idTypeGarant
	 * @return TypeGarantEntity
	 */
	TypeGarantEntity getTypeGarantById(Long idTypeGarant);

	/**
	 * get all TypeGarant
	 *
	 * @return List<TypeGarantEntity>
	 */
	List<TypeGarantEntity> getAllTypeGarants();

	/**
	 * add TypeGarant
	 *
	 * @param TypeGarantDto
	 * @return TypeGarantEntity
	 */
	TypeGarantEntity addTypeGarant(TypeGarantDto TypeGarantDto);

	/**
	 * update TypeGarant
	 *
	 * @param TypeGarantDto
	 * @return TypeGarantEntity
	 */
	TypeGarantEntity updateTypeGarant(TypeGarantDto TypeGarantDto);

	/**
	 * delete TypeGarant
	 *
	 * @param idTypeGarant
	 * @return TypeGarantEntity
	 */
	void deleteTypeGarant(Long idTypeGarant);

}