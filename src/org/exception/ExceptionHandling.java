package org.exception;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws UserDefinedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the acc number");
		int acc = sc.nextInt();
		try {
		
			System.out.println("you have entered valid acc");
		
			throw new UserDefinedException("Not Valid");
		
		}catch (Exception e) {
			System.out.println("Not valid one");
		}

	}

}
