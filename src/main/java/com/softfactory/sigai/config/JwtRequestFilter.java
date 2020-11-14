package com.softfactory.sigai.config;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtRequestFilter extends GenericFilterBean {

	private static final String AUTHORITIES_KEY = "authorities";

	private final JwtConfig jwtConfig;

	public JwtRequestFilter(JwtConfig jwtConfig) {
		this.jwtConfig = jwtConfig;
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		/* On récupère le header d'authentification */
		String header = httpServletRequest.getHeader(jwtConfig.getHeader());

		/* On vérifie le header ainsi que que le prefix */
		if (header == null || !header.startsWith(jwtConfig.getPrefix())) {
			filterChain.doFilter(servletRequest, response);
			/* si non valide oncontinue vers les autres filtres */
			return;
		}

		/* On récupère le token */
		String token = header.replace(jwtConfig.getPrefix(), "");
		try {
			/*
			 * On valide le token, si ce dernier a expiré la création du Claims lancera une
			 * exception
			 */
			Claims claims = Jwts.parser().setSigningKey(jwtConfig.getSecret().getBytes()).parseClaimsJws(token)
					.getBody();

			String username = claims.getSubject();
			if (username != null) {

				List<SimpleGrantedAuthority> authorities = Arrays
						.stream(claims.get(AUTHORITIES_KEY).toString().split(",")).map(p -> {
							return new SimpleGrantedAuthority(AuthoritiesConstants.S_SECURITY_PREIX + p);
						}).collect(Collectors.toList());
				User principal = new User(username, "", authorities);

				Authentication authentication = new UsernamePasswordAuthenticationToken(principal, token, authorities);
				/* On authentifie l'utilisateur */
				SecurityContextHolder.getContext().setAuthentication(authentication);
			}

		} catch (Exception e) {
			/* On vide le context de sécurité */
			SecurityContextHolder.clearContext();
		}

		/* On continue vers le filtre suivant */
		filterChain.doFilter(servletRequest, response);
	}

}
