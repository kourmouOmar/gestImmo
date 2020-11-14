package com.softfactory.sigai.config;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class TokenProvider {

	private static final String AUTHORITIES_KEY = "authorities";

	@Autowired
	private JwtConfig jwtConfig;

	@Bean
	public JwtConfig jwtConfig() {
		return new JwtConfig();
	}

	/**
	 * Create token
	 *
	 * @param userName
	 * @param authorities
	 * @param now
	 * @return
	 */
	public String createToken(String userName, Collection<? extends GrantedAuthority> authorities, Date now) {
		/* get user authorities */
		String userAuthorities = authorities.stream().map(GrantedAuthority::getAuthority)
				.collect(Collectors.joining(","));

		/* create token */
		return Jwts.builder().setSubject(userName).claim(AUTHORITIES_KEY, userAuthorities)
				.signWith(SignatureAlgorithm.HS512, jwtConfig.getSecret().getBytes()).setIssuedAt(now)
				.setExpiration(getExpirationTime(now)).compact();
	}

	public Date getExpirationTime(Date now) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		calendar.add(Calendar.SECOND, jwtConfig.getExpiration());
		return calendar.getTime();
	}

	/**
	 *
	 * @return
	 */
	public String getHeader() {
		return jwtConfig.getHeader();
	}

	/**
	 *
	 * @return
	 */
	public String getPrefix() {
		return jwtConfig.getPrefix();
	}

	public int getExpiration() {
		return jwtConfig.getExpiration();
	}
}
