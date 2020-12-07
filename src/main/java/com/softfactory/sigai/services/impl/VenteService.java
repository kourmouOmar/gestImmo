package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.VenteDto;
import com.softfactory.sigai.entities.VenteEntity;
import com.softfactory.sigai.repository.IVenteRepository;
import com.softfactory.sigai.services.IVenteService;

/**
 * Spring serviceImpl "Vente"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class VenteService implements IVenteService {
	
	@Autowired
	IVenteRepository venteRespository;
	
	@Override
	public VenteEntity getVenteById(Long idVente) {
		return venteRespository.getVenteBydId(idVente);
	}

	@Override
	public List<VenteEntity> getAllVentes() {
		/* get all Vente*/
		return venteRespository.findAll();
	}

	@Override
	public VenteEntity addVente(VenteDto venteDto) {
		/* add Vente */
		return venteRespository.save(VenteDto.dtoToEntity(venteDto));
	}

	@Override
	public VenteEntity updateVente(VenteDto venteDto) {
		/* update Vente*/
		return venteRespository.save(VenteDto.dtoToEntity(venteDto));
	}

	@Override
	public void deleteVente(Long idVente) {
		/* delete Vente*/
		venteRespository.deleteById(idVente);
	}
}