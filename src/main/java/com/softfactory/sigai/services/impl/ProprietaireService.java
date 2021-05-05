/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Proprietaire"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class ProprietaireService implements IProprietaireService {
	
	@Autowired
	ProprietaireRepository proprietaireRespository;
	
	@Override
	public ProprietaireEntity getProprietaireById(Long idRole) {
		return proprietaireRespository.getProprietaireBydId(idProprietaire);
	}

	@Override
	public List<ProprietaireEntity> getAllProprietaires() {
		/* get all Proprietaire*/
		return proprietaireRespository.findAll();
	}

	@Override
	public ProprietaireEntity addProprietaire(ProprietaireDto proprietaireDto) {
		/* add Proprietaire */
		return proprietaireRespository.save(ProprietaireDto.dtoToEntity(ProprietaireDto));
	}

	@Override
	public ProprietaireEntity updateProprietaire(ProprietaireDto proprietaireDto) {
		/* update Proprietaire*/
		return proprietaireRespository.save(ProprietaireDto.dtoToEntity(ProprietaireDto));
	}

	@Override
	public void deleteProprietaire(Long idProprietaire) {
		/* delete Proprietaire*/
		proprietaireRespository.deleteById(idProprietaire);
	}
}