package com.softfactory.sigai.config;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *  @author Omar_kourmou
 *  @see kourmou.omar@gmail.com
 *  @ceation 13/11/2020
 *  @version 1.0
 * */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class JwtConfig {
	
	@Value("${security.jwt.uri:/auth/**}")
	private String uri;
	
	@Value("${security.jwt.header:Authorization}")
	private String header;
	
	@Value("${security.jwt.prefix:Bearer}")
	private String prefix;
	
	@Value("${token.timeout:600}")
	private int expiration;
	
	@Value("${security.jwt.secret:okoOKU5Sjh}")
	private String secret;
}
