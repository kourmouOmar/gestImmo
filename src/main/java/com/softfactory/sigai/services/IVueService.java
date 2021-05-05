/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
/**
 * Spring service "Vue"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IVueService{

/**
	 * Get Vue by Id
	 * 
	 * @param idVue
	 * @return VueEntity
	 */
	VueEntity getVueById(Long idVue);

	/**
	 * get all Vue
	 *
	 * @return List<VueEntity>
	 */
	List<VueEntity> getAllVues();

	/**
	 * add Vue
	 *
	 * @param VueDto
	 * @return VueEntity
	 */
	VueEntity addVue(VueDto VueDto);

	/**
	 * update Vue
	 *
	 * @param VueDto
	 * @return VueEntity
	 */
	VueEntity updateVue(VueDto VueDto);

	/**
	 * delete Vue
	 *
	 * @param idVue
	 * @return VueEntity
	 */
	void deleteVue(Long idVue);

}