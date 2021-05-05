/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.VueDto;
import com.softfactory.sigai.entities.VueEntity;
import com.softfactory.sigai.repository.IVueRepository;
import com.softfactory.sigai.services.IVueService;

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
	IVueRepository vueRespository;
	
	@Override
	public VueEntity getVueById(Long idVue) {
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
		return vueRespository.save(VueDto.dtoToEntity(vueDto));
	}

	@Override
	public VueEntity updateVue(VueDto vueDto) {
		/* update Vue*/
		return vueRespository.save(VueDto.dtoToEntity(vueDto));
	}

	@Override
	public void deleteVue(Long idVue) {
		/* delete Vue*/
		vueRespository.deleteById(idVue);
	}
}