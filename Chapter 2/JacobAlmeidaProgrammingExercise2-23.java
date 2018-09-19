/*
Name: Jacob Almeida
Date: 09-07-2018
*/
import java.util.Scanner; //Scanner is in the java.util package
class Untitled {
	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt user to enter the distance to drive
		//Prompt user to enter miles per gallon
		//Prompt user to enter cost per gallon
		System.out.print("Enter driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double miles = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();
		
		//Compute cost of driving
		double cost = (distance * price) / miles;
		
		//Display Results
		System.out.println("The cost of driving is $" + cost);
	}
}