/*
Author: Jacob Almeida
Date: 10-04-2018
*/
class ProgrammingExercise5_33 {
	public static void main(String[] args) {
		
		final int max = 10000;
		boolean isPerfect = false;
		int i;
		for (i = 2; i < max; i++) {
			isPerfect = isNumPerfect(i);
			if (isPerfect) {
				System.out.println(i + " is a perfect number");
			}
		}	
	}
	public static boolean isNumPerfect(int i) {
		boolean isPerfect = false;
		int sum = 1;
		int n;
		for(n = 2; n <= (i / 2); n++) {
			if (i % n == 0) {
				sum += n;
				}
			}
			if(sum == i) {
				isPerfect = true;
			}
			return isPerfect;
	}
}