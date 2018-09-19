/*
Name: Jacob Almeida
Date: 09-10-2018
*/

import java.util.Scanner;
class JacobAlmeidaProgrammingExercise3_3 {
	public static void main(String[] args) {
		
		// Create Scanner
		Scanner in = new Scanner(System.in);
		
		// Prompt user to enter values for a, b, c, d, e, and f.
		System.out.print("Enter a, b, c, d, e, and f: ");
		
		// Establish values
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		
		// If ad - bc = 0 display "The equation has no solution."
		if((a * d - b *c ) == 0){
			System.out.println("The equation has no solution.");
		}else{
			double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
			double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

			System.out.println("x is " + x + ", and y is " + y + ".");
		}

	}
}