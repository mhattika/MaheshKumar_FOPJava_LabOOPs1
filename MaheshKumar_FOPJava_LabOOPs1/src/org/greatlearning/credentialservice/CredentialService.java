package org.greatlearning.credentialservice;

import java.util.Random;

import org.greatlearning.model.Employee;

public class CredentialService {

	public String generateEmailAddress(String firstName, String lastName, String department) {

		return firstName + lastName + "@" + department + ".greatlerning.com";
	}

	public char[] generatePassword() {

		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvxyz";
		String numbers = "0123456789";
		String specialCharectors = "!@#$%^&*()+=-<>?";
		String values = capitalLetters + smallLetters + numbers + specialCharectors;
		Random random = new Random();
		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {

			password[i] = values.charAt(random.nextInt(values.length()));
		}

		return password;

	}

	public void showCredentials(Employee e, String email, char[] generatedPassword) {

		System.out.println("Dear " + e.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ---> " + email);
		System.out.println("Password ---> " + generatedPassword);
		System.out.println("\n");

	}

}
