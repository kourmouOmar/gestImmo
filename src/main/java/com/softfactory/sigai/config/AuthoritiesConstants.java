package com.softfactory.sigai.config;

/**
 * Constants for spring Security authorities
 * */
public class AuthoritiesConstants {
	public static final String  S_SECURITY_PREIX = "ROLE_";
	
	/**
	 * authorities
	 **/
	public static final String ADMIN = S_SECURITY_PREIX + "admin";
	public static final String ASSISTANTE = S_SECURITY_PREIX + "Assistante";
}
