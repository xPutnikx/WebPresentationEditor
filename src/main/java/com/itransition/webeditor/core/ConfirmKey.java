package com.itransition.webeditor.core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ConfirmKey {
	
	public static String generate(String name, String password) throws NoSuchAlgorithmException {
		String message = name + password;
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		byte[] messageBytes = message.getBytes();
		byte[] digestBytes = messageDigest.digest(messageBytes);
		StringBuffer digest = new StringBuffer();
		for (byte b : digestBytes) {
			digest.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1,3));
		}
		return digest.toString();
	}
}
