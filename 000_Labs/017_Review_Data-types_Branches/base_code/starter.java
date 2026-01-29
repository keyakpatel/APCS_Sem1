/*
 *	Author: Keya Patel 
 *  Date: 09/23/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("What is your title? (Ex: Slayer of Dragons) ");
		String title = sc.nextLine();
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
		
		System.out.println();
		System.out.println("You have 20 points to spend on the following abilities: Strength, Dexterity, Intelligence, and Charisma. Spend wisely.");
		System.out.println();
		
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		if ((strength > 10) || (strength < 1)){
			System.out.print("Please input a value between the range: ");
			strength = sc.nextInt();
		} 
		int pointsLeft = (20 - strength);
		System.out.println("You have " + pointsLeft + " points left to spend.");
		System.out.println();
		
		System.out.print("Dexterity (1-10): ");
		int dexterity = sc.nextInt();
		if ((dexterity > 10) || (dexterity < 1)){
			System.out.print("Please input a value between the range: ");
			dexterity = sc.nextInt();
		}
		if (dexterity > pointsLeft){
			System.out.print("Please enter a smaller amount, you do not have enough points: ");
			dexterity = sc.nextInt();
		}
		pointsLeft = (20 - (strength+dexterity));
		System.out.println("You have " + pointsLeft + " points left to spend.");
		System.out.println();
		
		System.out.print("Intelligence (1-10): ");
		int intelligence = sc.nextInt();
		if ((intelligence > 10) || (intelligence < 1)){
			System.out.print("Please input a value between the range: ");
			intelligence = sc.nextInt();
		}
		if (intelligence > pointsLeft){
			System.out.print("Please enter a smaller amount, you do not have enough points: ");
			intelligence = sc.nextInt();
		}
		pointsLeft = (20 - (strength+dexterity+intelligence));
		System.out.println("You have " + pointsLeft + " points left to spend.");
		System.out.println();
		
		System.out.print("Charisma (1-10): ");
		int charisma = sc.nextInt();
		if ((charisma > 10) || (charisma < 1)){
			System.out.print("Please input a value between the range: ");
			charisma = sc.nextInt();
		}
		if (charisma > pointsLeft){
			System.out.print("Please enter a smaller amount, you do not have enough points: ");
			charisma = sc.nextInt();
		}
		System.out.println();
		
		int total = (strength + dexterity + intelligence + charisma);
		System.out.println("You have " + (20-total) + " to spend for your next quest.");
		
		System.out.println("---------------------------------------------");
		System.out.println("You are " + name + ", " + "the " + title + " of CVHS.");
		System.out.println("You are the "+ answer + " of the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + dexterity);
		System.out.println("Intelligence - " + intelligence);
		System.out.println("Charisma - " + charisma);
		System.out.println("Good luck on your next quest, " + name + "!");
	}
}
