/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service;
/**
 * Spring service "Module"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
public interface IModuleService{

/**
	 * Get Module by Id
	 * 
	 * @param idModule
	 * @return ModuleEntity
	 */
	ModuleEntity getModuleById(Long idModule);

	/**
	 * get all Module
	 *
	 * @return List<ModuleEntity>
	 */
	List<ModuleEntity> getAllModules();

	/**
	 * add Module
	 *
	 * @param ModuleDto
	 * @return ModuleEntity
	 */
	ModuleEntity addModule(ModuleDto ModuleDto);

	/**
	 * update Module
	 *
	 * @param ModuleDto
	 * @return ModuleEntity
	 */
	ModuleEntity updateModule(ModuleDto ModuleDto);

	/**
	 * delete Module
	 *
	 * @param idModule
	 * @return ModuleEntity
	 */
	void deleteModule(Long idModule);

}