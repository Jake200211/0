/*
Name: Jacob Almeida
Date: 09-19-2018
*/
import java.util.Scanner;
class Untitled {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the length of one of the sides
		System.out.println("Enter a length from the center to the vertex: ");
		double r = input.nextDouble();
		
		//Establish values of pi s and area
		double pi = 3.14159;
		double s = ((2 * r) * (java.lang.Math.sin(pi / 5)));
		double area = ((5 * (s * s) / (4 * java.lang.Math.tan(pi / 5))));
		double arearounded = Math.round(area);
		
		//Output area of the pentagon
		System.out.println("The area of the pentagon is " + (String.format("%.2f", area)));
		
	}
}