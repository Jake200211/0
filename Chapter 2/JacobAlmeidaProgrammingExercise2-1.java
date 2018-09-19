/*
Name: Jacob Almeida
Date: 09-07-2018
*/
import java.util.Scanner; // Scanner is in the java.util package

class Untitled {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input =
		 new Scanner(System.in);
		
		//Prompt the user to enter Celsius
		System.out.print("Enter a number for Celsius: ");
		double celsius = input.nextDouble();
		
		//Compute Fahrenheit
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		
		//Display Results
		System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
		
	}
}