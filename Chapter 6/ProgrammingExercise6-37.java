/*
Author: Jacob Almeida
Date: 10-12-2018
*/
import java.util.Scanner;

class ProgrammingExercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.print("Enter a width: ");
		int width = input.nextInt();
		System.out.println("The formatted number is " + format(number, width));
		
	}
	public static String format(int number, int width) {
		String result = number + " ";
		
		for (int i = 0; i < width - len(number) ; i++) {				//return a number possibly with addition 0's
			result = "0" + result;
		}
		return result;
	}
	public static int len(int number) {
		int size = 0;
		while (number > 0) {							//return the number of digits
			size += 1;
			number = number / 10;
		}
		return size;
	}
}