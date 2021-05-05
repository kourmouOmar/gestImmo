/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	VenteRepository venteRespository;
	
	@Override
	public VenteEntity getVenteById(Long idRole) {
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
		return venteRespository.save(VenteDto.dtoToEntity(VenteDto));
	}

	@Override
	public VenteEntity updateVente(VenteDto venteDto) {
		/* update Vente*/
		return venteRespository.save(VenteDto.dtoToEntity(VenteDto));
	}

	@Override
	public void deleteVente(Long idVente) {
		/* delete Vente*/
		venteRespository.deleteById(idVente);
	}
}