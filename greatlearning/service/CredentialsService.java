package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.EmployeeDetails;

public class CredentialsService {
	
	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@#$%&^*_-+=/.?<>)";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
	
		//Using random method
		Random random = new Random ();
		
		char [] password = new char [8];
		
		for (int i = 0; i<8; i++) {
			//Use of charAT() method : to get character value
			//Use of nextInt() as it is scanning the value as int
			password [i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(EmployeeDetails employee, String email, char[] generatedPassword ) {
		System.out.println("Dear "+employee.getfirstName()+" your generated credentials are as follws: ");
		System.out.println("Email: "+ email);
		System.out.println("Password: 1" + "");
		System.out.println(generatedPassword);
	}

}
