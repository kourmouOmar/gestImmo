package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.PaysDto;
import com.softfactory.sigai.entities.PaysEntity;
import com.softfactory.sigai.repository.IPaysRepository;
import com.softfactory.sigai.services.IPaysService;

/**
 * Spring serviceImpl "Pays"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class PaysService implements IPaysService {
	
	@Autowired
	IPaysRepository paysRespository;
	
	@Override
	public PaysEntity getPaysById(Long idPays) {
		return paysRespository.getPaysBydId(idPays);
	}

	@Override
	public List<PaysEntity> getAllPayss() {
		/* get all Pays*/
		return paysRespository.findAll();
	}

	@Override
	public PaysEntity addPays(PaysDto paysDto) {
		/* add Pays */
		return paysRespository.save(PaysDto.dtoToEntity(paysDto));
	}

	@Override
	public PaysEntity updatePays(PaysDto paysDto) {
		/* update Pays*/
		return paysRespository.save(PaysDto.dtoToEntity(paysDto));
	}

	@Override
	public void deletePays(Long idPays) {
		/* delete Pays*/
		paysRespository.deleteById(idPays);
	}
}