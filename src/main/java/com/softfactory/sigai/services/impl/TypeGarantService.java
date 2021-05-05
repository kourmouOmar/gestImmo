/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "TypeGarant"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class TypeGarantService implements ITypeGarantService {
	
	@Autowired
	TypeGarantRepository typegarantRespository;
	
	@Override
	public TypeGarantEntity getTypeGarantById(Long idRole) {
		return typegarantRespository.getTypeGarantBydId(idTypeGarant);
	}

	@Override
	public List<TypeGarantEntity> getAllTypeGarants() {
		/* get all TypeGarant*/
		return typegarantRespository.findAll();
	}

	@Override
	public TypeGarantEntity addTypeGarant(TypeGarantDto typegarantDto) {
		/* add TypeGarant */
		return typegarantRespository.save(TypeGarantDto.dtoToEntity(TypeGarantDto));
	}

	@Override
	public TypeGarantEntity updateTypeGarant(TypeGarantDto typegarantDto) {
		/* update TypeGarant*/
		return typegarantRespository.save(TypeGarantDto.dtoToEntity(TypeGarantDto));
	}

	@Override
	public void deleteTypeGarant(Long idTypeGarant) {
		/* delete TypeGarant*/
		typegarantRespository.deleteById(idTypeGarant);
	}
}