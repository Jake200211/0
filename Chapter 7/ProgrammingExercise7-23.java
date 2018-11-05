/*
Author: Jacob Almeida
Date: 11-05-2018
*/

class ProgrammingExercise7_23 {
	public static void main(String[] args) {
		
		boolean[] lockers = new boolean[100];
		
		for (int i = 0; i < 100; i++) {
			lockers[i] = false;
		}
		
		for(int i = 1; i < 100; i++) {
			for(int j = i - 1; j < 100; j += i) {
				lockers[j] = !lockers[j];
			}	
		}
		for(int i = 0; i < lockers.length; i++) {
			if(lockers[i] == true){
				System.out.print(i + " ");
			}
		}
	}
}