/*
Name: Jacob Almeida
Date: 09-10-2018
*/

import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter values for x and y.
		System.out.println("Enter the x value: ");
		double x = input.nextDouble();
		System.out.println("Enter the y value: ");
		double y = input.nextDouble();
		
		if (x >= 5) {
			System.out.println("Point (" + x + "," + y + ") is not in the rectangle.");
		}else if (x <= -5) {
			System.out.println("Point (" + x + "," + y + ") is not in the rectangle.");
		}else if (y >= 2.5) {
			System.out.println("Point (" + x + "," + y + ") is not in the rectangle.");
		}else if (y <= -2.5) {
			System.out.println("Point (" + x + "," + y + ") is not in the rectangle.");
		}else { System.out.println("Point (" + x + "," + y + ") is in the rectangle."); 
		}
	}
}