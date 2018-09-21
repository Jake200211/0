/*
Author: Jacob Almeida
Date: 09-21-2002
*/
import java.util.Scanner;
class ProgrammingExercise4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Promt user to enter name hours pay federal tax and state tax
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		System.out.println("Enter hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double pay = input.nextDouble();
		System.out.println("Enter federal tax rate: ");
		double fedtaxrate = input.nextDouble();
		System.out.println("Enter state tax rate: ");
		double statetaxrate = input.nextDouble();
		
		//Calculate
		double grossPay = hours * pay;
		double fedtaxdeduction = grossPay * fedtaxrate;
		double statetaxdeduction = grossPay * statetaxrate;
		double fedwithholding = fedtaxrate * 100;
		double statewithholding = statetaxrate * 100;
		double totaldeduction = fedtaxdeduction + statetaxdeduction;
		double netPay = grossPay - fedtaxdeduction - statetaxdeduction;
		
		//Display Results
		System.out.println("Employee Name: " + name); 
		System.out.println("Hours Worked: " + hours); 
		System.out.println("Pay Rate:  $" + pay);
		System.out.println("Gross Pay:  $" + grossPay);
		System.out.println("Deductions:");
		System.out.println(" 		Federal Withholding (" + fedwithholding + "%): 	$" + fedtaxdeduction);
		System.out.println(" 		State Withholding (" + statewithholding + "%):  $" + fedtaxdeduction);
		System.out.println(" 		Total Deduction:  $" + totaldeduction);
		System.out.println("Net Pay:  $" + netPay);	
		
	}
}