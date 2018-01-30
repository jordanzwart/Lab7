import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Provide info about students in a class
 * Prompt the user to ask about a particular student
 * give proper responses according to user-submitted info
 * ask if user would like to learn about another student
 */
public class StudentClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
//we are creating out array of students with there assigned number in the program and there favorites.
		int[] studID = { 1, 2, 3, 4, 5 };
		String[] name = { "John Doe", "Mary Jane", "Peter Pan", "Bobby Joe",
				"Billy Jean" };
		String[] major = { "Math", "Psych", "Chem", "Gym", "History" };
		String[] color = { "Green", "Blue", "Yellow", "Orange", "Purple" };
		String[] food = { "Pizza", "Burritos", "Breakfast", "Bagels", "Popcorn" };
//prints an index to choose which student assigned with its number
		for (int i = 0; i < studID.length; i++) {
			System.out.print(studID[i] + "\t"); 
			System.out.println(name[i] + "\t");
		}
		
		while (cont.equalsIgnoreCase("y")) {
		System.out.println("Which student do you want to learn about? Enter a number 1-5");	
//the try statement will print what ever student and there interests depending on the number you chose.
			try {
				int number; 
				number = scan.nextInt()-1;
				System.out.println("Student " + studID[number] + " is " + name[number] + ". There favorite food is " + food[number] +
				", there favorite color is " + color[number] + ", and there major is " + major[number] + ".");

				
//catch statements will catch if its a number outside of 1-5, and if you input a letter instead of a number				
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid integer!");
				scan.nextLine();
				continue;
			}catch (IndexOutOfBoundsException e){
				System.out.println("Please enter a number 1-5!");
				continue;
			}catch (Exception e){
				System.out.println("Please enter a valid integer!");
				
		}
		System.out.println("Would you like to learn about another student? (enter y/n)");
		cont = scan.next();
	}
		System.out.println("No worries, goodbye");
}
}
