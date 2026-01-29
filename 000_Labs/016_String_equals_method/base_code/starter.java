/*
 *	Author:  Keya Patel
 *  Date: 09/23/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
		String answer = sc.nextLine();
		
		if ((answer.equals("Wizard")) || (answer.equals("wizard"))){
			System.out.println("You've chosen Wizard! Amazing!");
		}
		
		else if ((answer.equals("Warrior")) || (answer.equals("warrior"))){
			System.out.println("You've chosen Warrior! Incredible!");
		}
		
		else if ((answer.equals("Rogue")) || (answer.equals("rogue"))){
			System.out.println("You've chosen Rogue! Brilliant!");
		}
		else{
			System.out.println("You have not chosen a character, please reread the options and try again.");
		}
	}
}
