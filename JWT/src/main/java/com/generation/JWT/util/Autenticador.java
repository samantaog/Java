package com.generation.JWT.util;

import javax.xml.bind.DatatypeConverter;

import com.generation.JWT.model.Usuario;

public class Autenticador {
	private static final String prefix = "GeNeRaTiOn";

	public static String encode(Usuario usuario) {
		return DatatypeConverter.printHexBinary((prefix + usuario).getBytes());

	}

	public static boolean isValid(String token) {
		byte strByte[] = DatatypeConverter.parseHexBinary(token);
		String newToken = new String(strByte);
		return newToken.startsWith(prefix);

	}

}
