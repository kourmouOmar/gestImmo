package com.softfactory.sigai.util;

/**
 * @category : Functions util
 * @author : KOURMOU Omar
 * @see : <kourmou.omar@gmqil.com>
 * @creation : 09/11/20
 * @version : 1.0
 */
public class Constants {

	public static final String HEADERS = "Accept=application/json";
	/**
	 * Common
	 */
	public static final String EMPTY = "";
	public static final String HTTP = "http://";
	public static final String HTTPS = "https://";
	public static final String NEW_LINE_SEPARATOR = "\n";

	/**
	 * Size string
	 */
	public static final int STR_LENGTH_LESS1 = -1;
	public static final int STR_LENGTH_0 = 0;
	public static final int STR_LENGTH_1 = 1;
	public static final int STR_LENGTH_2 = 2;
	public static final int STR_LENGTH_5 = 5;
	public static final int STR_LENGTH_8 = 8;
	public static final int STR_LENGTH_9 = 9;
	public static final int STR_LENGTH_11 = 11;
	public static final int STR_LENGTH_35 = 35;
	public static final int STR_LENGTH_3 = 3;
	public static final int STR_LENGTH_4 = 4;
	public static final int STR_LENGTH_14 = 14;
	public static final int STR_LENGTH_18 = 18;
	public static final int STR_LENGTH_19 = 19;
	public static final int STR_LENGTH_23 = 23;
	public static final int STR_LENGTH_25 = 25;
	public static final int STR_LENGTH_32 = 32;
	public static final int STR_LENGTH_49 = 49;
	public static final int STR_LENGTH_30 = 30;

	/**
	 * Status
	 */
	public static final String CREATED_STATUS = "CREATE";
	public static final String UPDATED_STATUS = "UPDATE";
	public static final String DELETED_STATUS = "DELETE";

	/**
	 * Message files names
	 */
	public static final String MSG_SOCLE_FILE_NAME = "socle.message.properties";

	/**
	 * Other
	 */
	public static final String NO_PARAM = "Pas de paramètre";
	public static final String NULL_OBJECT = "Objet null";

	public static final String ERRORS_NULL = "errors.null";
	public static final String ERRORS_NUMBER = "errors.number";
	public static final String ERRORS_DATE = "errors.date";
	public static final String VALIDATOR_RESOURCES = ".ValidatorResources";
	public static final String PARSE_DATE_ERROR = "Erreur parsing date!";
	public static final String TIMESTAMP_FORMAT = "validator.timestampFormat";
	public static final String NUMBER_FORMAT = "validator.numberFormat";
	public static final String DECIMAL_FORMAT = "validator.decimalFormat";
	public static final String DATE_FORMAT_COURT = "validator.dateFormat.court";

	/**
	 * default constructor
	 */
	private Constants() {
		super();
	}
}