package com.softfactory.sigai.controllers.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  Dto correspondant qux informations trans;ises sous forme de token Nom
 *  @author Omar_kourmou
 *  @version 1.0
 *  
 * */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponseDto  implements Serializable{
	
	private static final long serialVersionUID =1L;
	private String header;
	private String expires;
	
	private String token;

}
