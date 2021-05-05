/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	ModuleRepository moduleRespository;
	
	@Override
	public ModuleEntity getModuleById(Long idRole) {
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
		return moduleRespository.save(ModuleDto.dtoToEntity(ModuleDto));
	}

	@Override
	public ModuleEntity updateModule(ModuleDto moduleDto) {
		/* update Module*/
		return moduleRespository.save(ModuleDto.dtoToEntity(ModuleDto));
	}

	@Override
	public void deleteModule(Long idModule) {
		/* delete Module*/
		moduleRespository.deleteById(idModule);
	}
}