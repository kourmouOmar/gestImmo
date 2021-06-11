package com.softfactory.sigai.controllers.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Dto correspondant qux informations transmises (menus + authorities)
 * 
 * @author Omar_kourmou
 * @version 1.0
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MenusAuthoritiesDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Set<MenuDto> menus;
	private Set<GrantedAuthority> authorities;

}