/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
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