package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.BienDto;
import com.softfactory.sigai.entities.BienEntity;
import com.softfactory.sigai.repository.IBienRepository;
import com.softfactory.sigai.services.IBienService;
/**
 * Spring serviceImpl "Bien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class BienService implements IBienService {
	
	@Autowired
	IBienRepository bienRespository;
	
	@Override
	public BienEntity getBienById(Long idBien) {
		return bienRespository.getBienBydId(idBien);
	}

	@Override
	public List<BienEntity> getAllBiens() {
		/* get all Bien*/
		return bienRespository.findAll();
	}

	@Override
	public BienEntity addBien(BienDto bienDto) {
		/* add Bien */
		return bienRespository.save(BienDto.dtoToEntity(bienDto));
	}

	@Override
	public BienEntity updateBien(BienDto bienDto) {
		/* update Bien*/
		return bienRespository.save(BienDto.dtoToEntity(bienDto));
	}

	@Override
	public void deleteBien(Long idBien) {
		/* delete Bien*/
		bienRespository.deleteById(idBien);
	}
}