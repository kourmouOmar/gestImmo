/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
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
	ViewRepository viewRespository;
	
	@Override
	public ViewEntity getViewById(Long idRole) {
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
		return viewRespository.save(ViewDto.dtoToEntity(ViewDto));
	}

	@Override
	public ViewEntity updateView(ViewDto viewDto) {
		/* update View*/
		return viewRespository.save(ViewDto.dtoToEntity(ViewDto));
	}

	@Override
	public void deleteView(Long idView) {
		/* delete View*/
		viewRespository.deleteById(idView);
	}
}