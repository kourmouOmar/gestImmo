/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Etat"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class EtatService implements IEtatService {
	
	@Autowired
	EtatRepository etatRespository;
	
	@Override
	public EtatEntity getEtatById(Long idRole) {
		return etatRespository.getEtatBydId(idEtat);
	}

	@Override
	public List<EtatEntity> getAllEtats() {
		/* get all Etat*/
		return etatRespository.findAll();
	}

	@Override
	public EtatEntity addEtat(EtatDto etatDto) {
		/* add Etat */
		return etatRespository.save(EtatDto.dtoToEntity(EtatDto));
	}

	@Override
	public EtatEntity updateEtat(EtatDto etatDto) {
		/* update Etat*/
		return etatRespository.save(EtatDto.dtoToEntity(EtatDto));
	}

	@Override
	public void deleteEtat(Long idEtat) {
		/* delete Etat*/
		etatRespository.deleteById(idEtat);
	}
}