/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Acheteur"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class AcheteurService implements IAcheteurService {
	
	@Autowired
	AcheteurRepository acheteurRespository;
	
	@Override
	public AcheteurEntity getAcheteurById(Long idRole) {
		return acheteurRespository.getAcheteurBydId(idAcheteur);
	}

	@Override
	public List<AcheteurEntity> getAllAcheteurs() {
		/* get all Acheteur*/
		return acheteurRespository.findAll();
	}

	@Override
	public AcheteurEntity addAcheteur(AcheteurDto acheteurDto) {
		/* add Acheteur */
		return acheteurRespository.save(AcheteurDto.dtoToEntity(AcheteurDto));
	}

	@Override
	public AcheteurEntity updateAcheteur(AcheteurDto acheteurDto) {
		/* update Acheteur*/
		return acheteurRespository.save(AcheteurDto.dtoToEntity(AcheteurDto));
	}

	@Override
	public void deleteAcheteur(Long idAcheteur) {
		/* delete Acheteur*/
		acheteurRespository.deleteById(idAcheteur);
	}
}