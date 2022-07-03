package org.exception;

public class TryCatch {

	public static void main(String[] args) {
		//System.out.println("Start");
		//System.out.println("1");
		try {
			String s = "Britto";
			System.out.println(s.charAt(8));
		}
		catch (ArithmeticException e) {
				System.out.println("Not Divisible by 0");
			}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Value not available");
		} finally {
			System.out.println("Thank you");
		}

	}

}
