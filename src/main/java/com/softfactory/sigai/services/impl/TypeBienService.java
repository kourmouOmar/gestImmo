package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.TypeBienDto;
import com.softfactory.sigai.entities.TypeBienEntity;
import com.softfactory.sigai.repository.ITypeBienRepository;
import com.softfactory.sigai.services.ITypeBienService;

/**
 * Spring serviceImpl "TypeBien"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class TypeBienService implements ITypeBienService {
	
	@Autowired
	ITypeBienRepository typebienRespository;
	
	@Override
	public TypeBienEntity getTypeBienById(Long idTypeBien) {
		return typebienRespository.getTypeBienBydId(idTypeBien);
	}

	@Override
	public List<TypeBienEntity> getAllTypeBiens() {
		/* get all TypeBien*/
		return typebienRespository.findAll();
	}

	@Override
	public TypeBienEntity addTypeBien(TypeBienDto typebienDto) {
		/* add TypeBien */
		return typebienRespository.save(TypeBienDto.dtoToEntity(typebienDto));
	}

	@Override
	public TypeBienEntity updateTypeBien(TypeBienDto typebienDto) {
		/* update TypeBien*/
		return typebienRespository.save(TypeBienDto.dtoToEntity(typebienDto));
	}

	@Override
	public void deleteTypeBien(Long idTypeBien) {
		/* delete TypeBien*/
		typebienRespository.deleteById(idTypeBien);
	}
}