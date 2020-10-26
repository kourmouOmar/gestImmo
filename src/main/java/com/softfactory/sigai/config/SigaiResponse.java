package com.softfactory.sigai.config;

import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;

/**
 * @author Omar_kourmou
 * @see <kourmou.omar@gmail.com>
 * @creation 26/10/2020
 * @version 1.0
 */
public class SigaiResponse extends org.springframework.http.ResponseEntity<Object> {

	/**
	 * Create a new {@code ExampleResponse} with the given status code, and no body
	 * no header
	 * 
	 * @param status
	 * 
	 */
	public SigaiResponse(HttpStatus status) {
		super(null, null, status);
	}

	/**
	 * Create a new {@code ExampleResponse} with the given status code, and no body
	 * no header
	 * 
	 * @param body   the entity body
	 * @param status the status code
	 * 
	 */
	public SigaiResponse(Object body, HttpStatus status) {
		super(body, null, status);
	}

	/**
	 * Create a new {@code ExampleResponse} with the given status code, and no body
	 * no header
	 * 
	 * @param headers the entity headers
	 * @param status  the status code
	 * 
	 */
	public SigaiResponse(MultiValueMap<String, String> headers, HttpStatus status) {
		super(headers, status);
	}

	/**
	 * Create a new {@code ExampleResponse} with the given status code, and no body
	 * no header
	 * 
	 * @param body    the entity body
	 * @param headers the entity headers
	 * @param status  the status code
	 * 
	 */
	public SigaiResponse(Object body, MultiValueMap<String, String> headers, HttpStatus status) {
		super(body, headers, status);
	}

}
