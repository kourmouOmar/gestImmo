/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Locataire"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class LocataireService implements ILocataireService {
	
	@Autowired
	LocataireRepository locataireRespository;
	
	@Override
	public LocataireEntity getLocataireById(Long idRole) {
		return locataireRespository.getLocataireBydId(idLocataire);
	}

	@Override
	public List<LocataireEntity> getAllLocataires() {
		/* get all Locataire*/
		return locataireRespository.findAll();
	}

	@Override
	public LocataireEntity addLocataire(LocataireDto locataireDto) {
		/* add Locataire */
		return locataireRespository.save(LocataireDto.dtoToEntity(LocataireDto));
	}

	@Override
	public LocataireEntity updateLocataire(LocataireDto locataireDto) {
		/* update Locataire*/
		return locataireRespository.save(LocataireDto.dtoToEntity(LocataireDto));
	}

	@Override
	public void deleteLocataire(Long idLocataire) {
		/* delete Locataire*/
		locataireRespository.deleteById(idLocataire);
	}
}