package com.softfactory.sigai.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softfactory.sigai.config.AuthoritiesConstants;
import com.softfactory.sigai.config.SigaiResponse;
import com.softfactory.sigai.controllers.dto.MenuDto;
import com.softfactory.sigai.services.impl.MenuService;

/**
 * Spring controller "Menu"
 * 
 * @author : illass elbarhoumi
 * @creation : 08/11/20
 * @version : 1.0
 */
@RestController
public class MenuController {

	@Autowired
	private MenuService MenuService;

	@RequestMapping("/menus")
	@PreAuthorize("hasRole('"+AuthoritiesConstants.ADMIN+"')")
	public SigaiResponse getAllMenus() {
		/* get all Menu */
		return new SigaiResponse(MenuService.getAllMenus(), HttpStatus.OK);
	}

	@RequestMapping("/menus/{id}")
	public SigaiResponse getMenuById(@PathVariable Long id) {
		/* return Menu by id */
		return new SigaiResponse(MenuService.getMenuById(id), HttpStatus.OK);
	}

	@PostMapping("/menus/{id}")
	public SigaiResponse addMenu(@RequestBody MenuDto MenuDto) {
		/* add Menu */
		return new SigaiResponse(MenuService.addMenu(MenuDto), HttpStatus.OK);
	}

	@PutMapping("/menus/{id}")
	public SigaiResponse updateMenu(@RequestBody MenuDto MenuDto) {
		/* update Menu */
		return new SigaiResponse(MenuService.updateMenu(MenuDto), HttpStatus.OK);
	}

	@DeleteMapping("/menu/{id}")
	public SigaiResponse deleteMenu(@PathVariable Long id) {
		/* delete Menu */
		MenuService.deleteMenu(id);
		return new SigaiResponse(HttpStatus.OK);
	}

}
