/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Vue"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class VueService implements IVueService {
	
	@Autowired
	VueRepository vueRespository;
	
	@Override
	public VueEntity getVueById(Long idRole) {
		return vueRespository.getVueBydId(idVue);
	}

	@Override
	public List<VueEntity> getAllVues() {
		/* get all Vue*/
		return vueRespository.findAll();
	}

	@Override
	public VueEntity addVue(VueDto vueDto) {
		/* add Vue */
		return vueRespository.save(VueDto.dtoToEntity(VueDto));
	}

	@Override
	public VueEntity updateVue(VueDto vueDto) {
		/* update Vue*/
		return vueRespository.save(VueDto.dtoToEntity(VueDto));
	}

	@Override
	public void deleteVue(Long idVue) {
		/* delete Vue*/
		vueRespository.deleteById(idVue);
	}
}