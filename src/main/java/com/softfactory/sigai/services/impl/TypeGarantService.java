/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.TypeGarantDto;
import com.softfactory.sigai.entities.TypeGarantEntity;
import com.softfactory.sigai.repository.ITypeGarantRepository;
import com.softfactory.sigai.services.ITypeGarantService;

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
	ITypeGarantRepository typegarantRespository;
	
	@Override
	public TypeGarantEntity getTypeGarantById(Long idTypeGarant) {
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
		return typegarantRespository.save(TypeGarantDto.dtoToEntity(typegarantDto));
	}

	@Override
	public TypeGarantEntity updateTypeGarant(TypeGarantDto typegarantDto) {
		/* update TypeGarant*/
		return typegarantRespository.save(TypeGarantDto.dtoToEntity(typegarantDto));
	}

	@Override
	public void deleteTypeGarant(Long idTypeGarant) {
		/* delete TypeGarant*/
		typegarantRespository.deleteById(idTypeGarant);
	}
}