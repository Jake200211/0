/*
Name: Jacob Almeida
Date: 09-07-2018
*/

//Exercise compund value
//same $100 a month
//5% annual interest rate
import java.util.Scanner; import java.util.function.*;

// Scanner is in the java.util package
class Untitled {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter monthly saving amount
		System.out.print("Enter a monthly saving amount: ");
		double savings = input.nextDouble();
		
		double interest = 1.00417;
		
		// Compute Month 1
		double month1 = savings * interest;
		
		//Compute Month 2
		double month2 = (savings + month1) * interest;
		
		//Compute Month 3
		double month3 = (savings + month2) * interest;
		
		//Compute Month 4
		double month4 = (savings + month3) * interest;
		
		//Compute Month 5
		double month5 = (savings + month4) * interest;
		
		//Compute Month 6
		double month6 = (savings + month5) * interest;
		
		// Display results
		System.out.println("Your account balance after 6 months will be $" + month6);
	}
}