/*
Name: Jacob Almeida
Date: 09-20-2018
*/
import java.util.Scanner;
class ProgrammingExercise4_17 {
	public static void main(String[] args) {
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Define months
		int Jan = 31;
		int Feb = 28;
		int Mar = 31;
		int Apr = 30;
		int May = 31;
		int Jun = 30;
		int Jul = 31;
		int Aug = 31;
		int Sep = 30;
		int Oct = 31;
		int Nov = 30;
		int Dec = 31;
		
		//Prompt user to input a month and a year
		System.out.println("Enter a month (only enter the first 3 letters of the month, make sure to capitalize the first letter): ");
		String month = input.next();
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		if (month.equals("Feb") && year % 4 == 0 && year % 100 == 00 && year % 400 == 0){
			System.out.println(month + " " + year + " has 29 days");
		
		}else if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
			System.out.println(month + " " + year + " has 31 days");
		}else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
			System.out.println(month + " " + year + " has 30 days");
		}else {
			System.out.println("INVALID INPUT");
		}
	}
}