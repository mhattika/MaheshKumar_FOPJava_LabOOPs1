package org.greatlearning.driver;

import java.util.Scanner;

import org.greatlearning.credentialservice.CredentialService;
import org.greatlearning.model.Employee;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee("Maheshumar", "Hattikal");
		CredentialService credentialService = new CredentialService();

		Scanner in = new Scanner(System.in);
		int option;

		do {

			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");

			option = in.nextInt();

			switch (option) {

			case 1: {
				String email = credentialService.generateEmailAddress(emp.getFirstName(), emp.getLastName(),
						"Technical");
				char[] password = credentialService.generatePassword();
				credentialService.showCredentials(emp, email, password);
			}
				break;
			case 2: {

				String email = credentialService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "Admin");
				char[] password = credentialService.generatePassword();
				credentialService.showCredentials(emp, email, password);
			}
				break;
			case 3: {

				String email = credentialService.generateEmailAddress(emp.getFirstName(), emp.getLastName(),
						"HumanResource");
				char[] password = credentialService.generatePassword();
				credentialService.showCredentials(emp, email, password);

			}
				break;
			case 4: {

				String email = credentialService.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "Legal");
				char[] password = credentialService.generatePassword();
				credentialService.showCredentials(emp, email, password);

			}
				break;

			default:
				System.out.println("Invalid Option entered, only 1 to 4 allowed");
				throw new IllegalArgumentException("Unexpected value: " + option);
			}

		} while (option <= 4 && option > 0);

	}

}
