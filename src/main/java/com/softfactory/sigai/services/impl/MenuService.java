/*
 * Be careful, do not modify this class, it is generated automatically.
 */
package com.softfactory.sigai.service.impl;
/**
 * Spring serviceImpl "Menu"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */

@Service
public class MenuService implements IMenuService {
	
	@Autowired
	MenuRepository menuRespository;
	
	@Override
	public MenuEntity getMenuById(Long idRole) {
		return menuRespository.getMenuBydId(idMenu);
	}

	@Override
	public List<MenuEntity> getAllMenus() {
		/* get all Menu*/
		return menuRespository.findAll();
	}

	@Override
	public MenuEntity addMenu(MenuDto menuDto) {
		/* add Menu */
		return menuRespository.save(MenuDto.dtoToEntity(MenuDto));
	}

	@Override
	public MenuEntity updateMenu(MenuDto menuDto) {
		/* update Menu*/
		return menuRespository.save(MenuDto.dtoToEntity(MenuDto));
	}

	@Override
	public void deleteMenu(Long idMenu) {
		/* delete Menu*/
		menuRespository.deleteById(idMenu);
	}
}