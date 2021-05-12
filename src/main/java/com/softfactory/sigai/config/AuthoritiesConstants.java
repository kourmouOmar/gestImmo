package com.softfactory.sigai.config;

/**
 * Constants for spring Security authorities
 */
public class AuthoritiesConstants {
	public static final String S_SECURITY_PREIX = "ROLE_";

	/**
	 * authorities
	 **/
	public static final String ADMIN = S_SECURITY_PREIX + "admin";
	public static final String ASSISTANTE = S_SECURITY_PREIX + "Assistante";

	/** module authorites */
	public static final String GET_ALL_MODULE = S_SECURITY_PREIX + "get-all-module";
	public static final String GET_MODULE_BY_ID = S_SECURITY_PREIX + "get-module-by-id";
	public static final String SAVE_MODULE = S_SECURITY_PREIX + "save-module";
	public static final String UPDATE_MODULE = S_SECURITY_PREIX + "update-module";
	public static final String DELETE_MODULE = S_SECURITY_PREIX + "delete-module";

	/** menu authorites */
	public static final String GET_ALL_MENU = S_SECURITY_PREIX + "get-all-menu";
	public static final String GET_MENU_BY_ID = S_SECURITY_PREIX + "get-menu-by-id";
	public static final String SAVE_MENU = S_SECURITY_PREIX + "save-menu";
	public static final String UPDATE_MENU = S_SECURITY_PREIX + "update-menu";
	public static final String DELETE_MENU = S_SECURITY_PREIX + "delete-menu";

	/** role authorites */
	public static final String GET_ALL_ROLE = S_SECURITY_PREIX + "get-all-role";
	public static final String GET_ROLE_BY_ID = S_SECURITY_PREIX + "get-role-by-id";
	public static final String SAVE_ROLE = S_SECURITY_PREIX + "save-role";
	public static final String UPDATE_ROLE = S_SECURITY_PREIX + "update-role";
	public static final String DELETE_ROLE = S_SECURITY_PREIX + "delete-role";

	/** acheteur authorites */
	public static final String GET_ALL_ACHETEUR = S_SECURITY_PREIX + "get-all-acheteur";
	public static final String GET_ACHETEUR_BY_ID = S_SECURITY_PREIX + "get-acheteur-by-id";
	public static final String SAVE_ACHETEUR = S_SECURITY_PREIX + "save-acheteur";
	public static final String UPDATE_ACHETEUR = S_SECURITY_PREIX + "update-acheteur";
	public static final String DELETE_ACHETEUR = S_SECURITY_PREIX + "delete-acheteur";

	/** adresse authorites */
	public static final String GET_ALL_ADRESSE = S_SECURITY_PREIX + "get-all-adresse";
	public static final String GET_ADRESSE_BY_ID = S_SECURITY_PREIX + "get-adresse-by-id";
	public static final String SAVE_ADRESSE = S_SECURITY_PREIX + "save-adresse";
	public static final String UPDATE_ADRESSE = S_SECURITY_PREIX + "update-adresse";
	public static final String DELETE_ADRESSE = S_SECURITY_PREIX + "delete-adresse";

	/** bien authorites */
	public static final String GET_ALL_BIEN = S_SECURITY_PREIX + "get-all-bien";
	public static final String GET_BIEN_BY_ID = S_SECURITY_PREIX + "get-bien-by-id";
	public static final String SAVE_BIEN = S_SECURITY_PREIX + "save-bien";
	public static final String UPDATE_BIEN = S_SECURITY_PREIX + "update-bien";
	public static final String DELETE_BIEN = S_SECURITY_PREIX + "delete-bien";

	/** etat authorites */
	public static final String GET_ALL_ETAT = S_SECURITY_PREIX + "get-all-etat";
	public static final String GET_ETAT_BY_ID = S_SECURITY_PREIX + "get-etat-by-id";
	public static final String SAVE_ETAT = S_SECURITY_PREIX + "save-etat";
	public static final String UPDATE_ETAT = S_SECURITY_PREIX + "update-etat";
	public static final String DELETE_ETAT = S_SECURITY_PREIX + "delete-etat";

	/** garant authorites */
	public static final String GET_ALL_GARANT = S_SECURITY_PREIX + "get-all-garant";
	public static final String GET_GARANT_BY_ID = S_SECURITY_PREIX + "get-garant-by-id";
	public static final String SAVE_GARANT = S_SECURITY_PREIX + "save-garant";
	public static final String UPDATE_GARANT = S_SECURITY_PREIX + "update-garant";
	public static final String DELETE_GARANT = S_SECURITY_PREIX + "delete-garant";

	/** location authorites */
	public static final String GET_ALL_LOCATION = S_SECURITY_PREIX + "get-all-location";
	public static final String GET_LOCATION_BY_ID = S_SECURITY_PREIX + "get-location-by-id";
	public static final String SAVE_LOCATION = S_SECURITY_PREIX + "save-location";
	public static final String UPDATE_LOCATION = S_SECURITY_PREIX + "update-location";
	public static final String DELETE_LOCATION = S_SECURITY_PREIX + "delete-location";

	/** pays authorites */
	public static final String GET_ALL_PAYS = S_SECURITY_PREIX + "get-all-pays";
	public static final String GET_PAYS_BY_ID = S_SECURITY_PREIX + "get-pays-by-id";
	public static final String SAVE_PAYS = S_SECURITY_PREIX + "save-pays";
	public static final String UPDATE_PAYS = S_SECURITY_PREIX + "update-pays";
	public static final String DELETE_PAYS = S_SECURITY_PREIX + "delete-pays";

	/** proprietaire authorites */
	public static final String GET_ALL_PROPREETAIRE = S_SECURITY_PREIX + "get-all-proprietaire";
	public static final String GET_PROPREETAIRE_BY_ID = S_SECURITY_PREIX + "get-proprietaire-by-id";
	public static final String SAVE_PROPREETAIRE = S_SECURITY_PREIX + "save-proprietaire";
	public static final String UPDATE_PROPREETAIRE = S_SECURITY_PREIX + "update-proprietaire";
	public static final String DELETE_PROPREETAIRE = S_SECURITY_PREIX + "delete-proprietaire";

	/** style authorites */
	public static final String GET_ALL_STYLE = S_SECURITY_PREIX + "get-all-style";
	public static final String GET_STYLE_BY_ID = S_SECURITY_PREIX + "get-style-by-id";
	public static final String SAVE_STYLE = S_SECURITY_PREIX + "save-style";
	public static final String UPDATE_STYLE = S_SECURITY_PREIX + "update-style";
	public static final String DELETE_STYLE = S_SECURITY_PREIX + "delete-style";

	/** type-bien authorites */
	public static final String GET_ALL_TYPE_BIEN = S_SECURITY_PREIX + "get-all-type-bien";
	public static final String GET_TYPE_BIEN_BY_ID = S_SECURITY_PREIX + "get-type-bien-by-id";
	public static final String SAVE_TYPE_BIEN = S_SECURITY_PREIX + "save-type-bien";
	public static final String UPDATE_TYPE_BIEN = S_SECURITY_PREIX + "update-type-bien";
	public static final String DELETE_TYPE_BIEN = S_SECURITY_PREIX + "delete-type-bien";

	/** type-garant authorites */
	public static final String GET_ALL_TYPE_GARANT = S_SECURITY_PREIX + "get-all-type-garant";
	public static final String GET_TYPE_GARANT_BY_ID = S_SECURITY_PREIX + "get-type-garant-by-id";
	public static final String SAVE_TYPE_GARANT = S_SECURITY_PREIX + "save-type-garant";
	public static final String UPDATE_TYPE_GARANT = S_SECURITY_PREIX + "update-type-garant";
	public static final String DELETE_TYPE_GARANT = S_SECURITY_PREIX + "delete-type-garant";

	/** vente authorites */
	public static final String GET_ALL_VENTE = S_SECURITY_PREIX + "get-all-vente";
	public static final String GET_VENTE_BY_ID = S_SECURITY_PREIX + "get-vente-by-id";
	public static final String SAVE_VENTE = S_SECURITY_PREIX + "save-vente";
	public static final String UPDATE_VENTE = S_SECURITY_PREIX + "update-vente";
	public static final String DELETE_VENTE = S_SECURITY_PREIX + "delete-vente";

	/** ville authorites */
	public static final String GET_ALL_VILLE = S_SECURITY_PREIX + "get-all-ville";
	public static final String GET_VILLE_BY_ID = S_SECURITY_PREIX + "get-ville-by-id";
	public static final String SAVE_VILLE = S_SECURITY_PREIX + "save-ville";
	public static final String UPDATE_VILLE = S_SECURITY_PREIX + "update-ville";
	public static final String DELETE_VILLE = S_SECURITY_PREIX + "delete-ville";

	public AuthoritiesConstants() {
	}

}
