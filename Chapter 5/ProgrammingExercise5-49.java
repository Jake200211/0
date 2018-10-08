import java.util.Scanner;
class ProgrammingExercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < s.length(); i++) {
			char temp = Character.toUpperCase(s.charAt(i));
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
				vowels++;
			}
			else if (Character.isLetter(temp)) {
				consonants++;
			}
		}	//end for loop
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
	}
}