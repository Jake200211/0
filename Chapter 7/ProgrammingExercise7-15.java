/*
Author: Jacob Almeida
Date: 11-01-2018
*/
import java.util.Scanner;

class ProgrammingExercise7_15 {
	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers with spaces between them: ");
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		int[] result2 = eliminateDuplicates(numbers);
		
		System.out.println("The unique numbers in the array are: " + result2.length);
		for (int i = 0; i < result2.length; i++){
			System.out.print(result2[i] + " ");
		}
	}
		
		public static int[] eliminateDuplicates(int[] list) {
			int[] temp = new int[list.length];
			int size = 0;
			for ( int i = 0; i < list.length; i++) {
				boolean isInArray = false;
				for (int j = 0; j < i && !isInArray; j++) {
					if(list[j] == list[i]) {
						isInArray = true;
					}
				}
			if (!isInArray) {
				temp[size] = list[i];
				size++;
			}
		}
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = temp[i];
		}
		return result;
		
	}
}