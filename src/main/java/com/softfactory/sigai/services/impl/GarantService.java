/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.GarantDto;
import com.softfactory.sigai.entities.GarantEntity;
import com.softfactory.sigai.repository.IGarantRepository;
import com.softfactory.sigai.services.IGarantService;

/**
 * Spring serviceImpl "Garant"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class GarantService implements IGarantService {
	
	@Autowired
	IGarantRepository garantRespository;
	
	@Override
	public GarantEntity getGarantById(Long idGarant) {
		return garantRespository.getGarantBydId(idGarant);
	}

	@Override
	public List<GarantEntity> getAllGarants() {
		/* get all Garant*/
		return garantRespository.findAll();
	}

	@Override
	public GarantEntity addGarant(GarantDto garantDto) {
		/* add Garant */
		return garantRespository.save(GarantDto.dtoToEntity(garantDto));
	}

	@Override
	public GarantEntity updateGarant(GarantDto garantDto) {
		/* update Garant*/
		return garantRespository.save(GarantDto.dtoToEntity(garantDto));
	}

	@Override
	public void deleteGarant(Long idGarant) {
		/* delete Garant*/
		garantRespository.deleteById(idGarant);
	}
}