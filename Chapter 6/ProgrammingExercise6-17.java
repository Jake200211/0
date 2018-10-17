/*
Author: Jacob Almeida
Date: 10-11-2018
*/
import java.util.Scanner;

class ProgrammingExercise6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
		
	}//end of main method
	public static void printMatrix(int n) {
		for (int i = 1; i <= n; i++) { // for loop for rows
			for (int j = 1; j <= n; j++) { // for loop for columns
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}