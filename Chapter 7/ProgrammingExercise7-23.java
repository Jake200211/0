/*
Author: Jacob Almeida
Date: 11-02-2018
*/

class ProgrammingExercise7_23 {
	public static void main(String[] args) {
		
		boolean[] lockers = new boolean[100];
		int n = 0;
		
		for (int i = 0; i < lockers.length; i++) {
			n = i;
			
		while (n < lockers.length) {
			lockers[n] = !lockers[n];
			n = n + i + 1;
		}
	}
		System.out.print("The open lockers are: ");
		
		for (int i = 1; i < lockers.length; i++) {
			if (lockers[i] == true) {
				System.out.print(i + " ");
			}
		}
	}
}