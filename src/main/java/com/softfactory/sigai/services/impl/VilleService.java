/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.VilleDto;
import com.softfactory.sigai.entities.VilleEntity;
import com.softfactory.sigai.repository.IVilleRepository;
import com.softfactory.sigai.services.IVilleService;

/**
 * Spring serviceImpl "Ville"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class VilleService implements IVilleService {
	
	@Autowired
	IVilleRepository villeRespository;
	
	@Override
	public VilleEntity getVilleById(Long idVille) {
		return villeRespository.getVilleBydId(idVille);
	}

	@Override
	public List<VilleEntity> getAllVilles() {
		/* get all Ville*/
		return villeRespository.findAll();
	}

	@Override
	public VilleEntity addVille(VilleDto villeDto) {
		/* add Ville */
		return villeRespository.save(VilleDto.dtoToEntity(villeDto));
	}

	@Override
	public VilleEntity updateVille(VilleDto villeDto) {
		/* update Ville*/
		return villeRespository.save(VilleDto.dtoToEntity(villeDto));
	}

	@Override
	public void deleteVille(Long idVille) {
		/* delete Ville*/
		villeRespository.deleteById(idVille);
	}
}