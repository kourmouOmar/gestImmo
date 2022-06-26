/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.ModuleDto;
import com.softfactory.sigai.entities.ModuleEntity;
import com.softfactory.sigai.repository.IModuleRepository;
import com.softfactory.sigai.services.IModuleService;

/**
 * Spring serviceImpl "Module"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class ModuleService implements IModuleService {
	
	@Autowired
	IModuleRepository moduleRespository;
	
	@Override
	public ModuleEntity getModuleById(Long idModule) {
		return moduleRespository.getModuleBydId(idModule);
	}

	@Override
	public List<ModuleEntity> getAllModules() {
		/* get all Module*/
		return moduleRespository.findAll();
	}

	@Override
	public ModuleEntity addModule(ModuleDto moduleDto) {
		/* add Module */
		return moduleRespository.save(ModuleDto.dtoToEntity(moduleDto));
	}

	@Override
	public ModuleEntity updateModule(ModuleDto moduleDto) {
		/* update Module*/
		return moduleRespository.save(ModuleDto.dtoToEntity(moduleDto));
	}

	@Override
	public void deleteModule(Long idModule) {
		/* delete Module*/
		moduleRespository.deleteById(idModule);
	}

	@Override
	public ModuleEntity activeDesactiveModule(Boolean active,Long id) {
		ModuleEntity module = moduleRespository.getModuleBydId(id);
		module.setActive(active);
		moduleRespository.save(module);
		return module;
	}
}