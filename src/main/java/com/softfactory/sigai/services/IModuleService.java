/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services;

import java.util.List;

import com.softfactory.sigai.controllers.dto.ModuleDto;
import com.softfactory.sigai.entities.ModuleEntity;

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
	 * 
	 * @param active
	 * @return
	 */
	ModuleEntity activeDesactiveModule(Boolean active,Long id);
	/**
	 * delete Module
	 *
	 * @param idModule
	 * @return ModuleEntity
	 */
	void deleteModule(Long idModule);

}