package com.aml.password;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GeneratePassword {

	public static final String num = "0123456789";
	public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String lower = upper.toLowerCase();
	public static String symbols = "!@#$%^&*_=+-/.?<>)";
	public static final ThreadLocalRandom t1 = null;

	public static String createPassword(PasswordType st, int min, int max) throws ExceptionPassword {

		char[] pass = new char[max];

		if (PasswordType.low == st) {
			String low = num + lower;

			for (int i = 0; i < max; i++) {
				pass[i] = low.charAt(t1.current().nextInt(low.length()));

			}

		}
		if (PasswordType.midium == st) {

			String med = lower + num + upper;

			for (int i = 0; i < max; i++) {
				pass[i] = med.charAt(t1.current().nextInt(med.length()));
			}

		}

		if (PasswordType.high == st) {
			String heigh = lower + num + upper + symbols;

			for (int i = 0; i < max; i++) {
				pass[i] = heigh.charAt(t1.current().nextInt(heigh.length()));
			}

		}
		String password = new String(pass);
		return password;

	}

	public static void main(String[] args) throws ExceptionPassword {

		PasswordType type = null;
		System.out.println("Please write your password length is low, midium or high");

		Scanner sc = new Scanner(System.in);
		try {
			type = PasswordType.valueOf(sc.next());
		} catch (Exception e) {
			throw new ExceptionPassword("wrong input");
		}

		switch (type) {
		case low:
			System.out.print(GeneratePassword.createPassword(type, 3, 9) + "\n");
			System.out.println("Successfully your new password is generated... ");
			break;
		case midium:
			System.out.print(GeneratePassword.createPassword(type, 3, 9) + "\n");
			System.out.println("Successfully your new password is generated...");
			break;
		case high:
			System.out.print(GeneratePassword.createPassword(type, 3, 9) + "\n");
			System.out.println("Successfully your new password is generated... ");
			break;
		default:
			System.out.println("MEDIUM,high,low");

		}

	}

}
