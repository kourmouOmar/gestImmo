package com.softfactory.sigai.controllers.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * dto "SigaiUserDto"
 * 
 * @author : kourmou omar
 * @see : <kourmou.omar@gmail.com>
 * @creation : 05. 12. 2020
 * @version : 1.0
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SigaiUserDto {
	@JsonProperty("user_name")
	private String username;
	
	@JsonProperty("nom_complet")
	private String fullName;
	
	@JsonProperty("token_dto")
	private JwtResponseDto token;
}
