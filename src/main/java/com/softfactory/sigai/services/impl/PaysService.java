/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	PaysRepository paysRespository;
	
	@Override
	public PaysEntity getPaysById(Long idRole) {
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
		return paysRespository.save(PaysDto.dtoToEntity(PaysDto));
	}

	@Override
	public PaysEntity updatePays(PaysDto paysDto) {
		/* update Pays*/
		return paysRespository.save(PaysDto.dtoToEntity(PaysDto));
	}

	@Override
	public void deletePays(Long idPays) {
		/* delete Pays*/
		paysRespository.deleteById(idPays);
	}
}