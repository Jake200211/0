/*
Name: Jacob Almeida
Date: 09-10-2018
*/
import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter triangle side lengths
		System.out.print("Enter side 1, side 2, and side 3: ");
		
		// Establish values
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		double perimeter = side1 + side2 + side3;
		if((side1 + side2) <= side3){
			System.out.println("Input is invalid.");
		}else if((side1 + side3) <= side2){
			System.out.println("Input is invalid.");
		}else if((side2 + side3) <= side1){
			System.out.println("Input is invalid.");
		}else System.out.println("The perimeter of the triangle is " + perimeter);
			
	}
}