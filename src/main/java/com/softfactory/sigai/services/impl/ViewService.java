package com.softfactory.sigai.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softfactory.sigai.controllers.dto.ViewDto;
import com.softfactory.sigai.entities.ViewEntity;
import com.softfactory.sigai.repository.IViewRepository;
import com.softfactory.sigai.services.IViewService;

/**
 * Spring serviceImpl "View"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class ViewService implements IViewService {
	
	@Autowired
	IViewRepository viewRespository;
	
	@Override
	public ViewEntity getViewById(Long idView) {
		return viewRespository.getViewBydId(idView);
	}

	@Override
	public List<ViewEntity> getAllViews() {
		/* get all View*/
		return viewRespository.findAll();
	}

	@Override
	public ViewEntity addView(ViewDto viewDto) {
		/* add View */
		return viewRespository.save(ViewDto.dtoToEntity(viewDto));
	}

	@Override
	public ViewEntity updateView(ViewDto viewDto) {
		/* update View*/
		return viewRespository.save(ViewDto.dtoToEntity(viewDto));
	}

	@Override
	public void deleteView(Long idView) {
		/* delete View*/
		viewRespository.deleteById(idView);
	}
}