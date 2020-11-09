package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.TypeBienDto;
import com.softfactory.sigai.entities.TypeBienEntity;

/**
 * Spring service "TypeBien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface ITypeBienService{

/**
	 * Get TypeBien by Id
	 * 
	 * @param idTypeBien
	 * @return TypeBienEntity
	 */
	TypeBienEntity getTypeBienById(Long idTypeBien);

	/**
	 * get all TypeBien
	 *
	 * @return List<TypeBienEntity>
	 */
	List<TypeBienEntity> getAllTypeBiens();

	/**
	 * add TypeBien
	 *
	 * @param TypeBienDto
	 * @return TypeBienEntity
	 */
	TypeBienEntity addTypeBien(TypeBienDto TypeBienDto);

	/**
	 * update TypeBien
	 *
	 * @param TypeBienDto
	 * @return TypeBienEntity
	 */
	TypeBienEntity updateTypeBien(TypeBienDto TypeBienDto);

	/**
	 * delete TypeBien
	 *
	 * @param idTypeBien
	 * @return TypeBienEntity
	 */
	void deleteTypeBien(Long idTypeBien);

}