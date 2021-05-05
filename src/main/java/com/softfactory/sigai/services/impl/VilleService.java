/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	VilleRepository villeRespository;
	
	@Override
	public VilleEntity getVilleById(Long idRole) {
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
		return villeRespository.save(VilleDto.dtoToEntity(VilleDto));
	}

	@Override
	public VilleEntity updateVille(VilleDto villeDto) {
		/* update Ville*/
		return villeRespository.save(VilleDto.dtoToEntity(VilleDto));
	}

	@Override
	public void deleteVille(Long idVille) {
		/* delete Ville*/
		villeRespository.deleteById(idVille);
	}
}