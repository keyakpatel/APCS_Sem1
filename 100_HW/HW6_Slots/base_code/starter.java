/*
 *	Author: Keya Patel
 *  Date: 10/01/25
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1-10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose money.");
		System.out.println("------------------------------------------------------------");
		
		int random1 = (int)(Math.random()*10 +1);
		int random2 = (int)(Math.random()*10 +1);
		int random3 = (int)(Math.random()*10 +1);
		int bet = 100;
		int left = 100;
		
		while (true){ 
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
			String ans = sc.nextLine();
			if (ans.equals("No") || ans.equals("no") || ans.equals("N") || ans.equals("n")){
				System.out.println("Sad to see you go! You still have $" + left + " left. Come again soon! Thanks!");
				break;
			}
			while (ans.equals("Yes") || ans.equals("yes") || ans.equals("Y") || ans.equals("y")){
				
			System.out.print("You have $" + left + ". How much would you like to wager? ");
			bet = sc.nextInt();
			sc.nextLine();
			System.out.println();
			left= left - bet;
			System.out.println("Great!! Let's play!");
			System.out.println("Your rolls are: ");
			System.out.println("_______________________");
			System.out.println("| " + random1 + " | " + random2 + " | " + random3 + " | " );
			System.out.println("_______________________");
			if ((random1 != random2 && random1 != random3) && (random2 != random3)){
				System.out.println("Didn't win this time! Better luck next time!");
				System.out.println("You now have $" + left);
				System.out.println("----------------------------------------------------");
			}
			if (random1 == random2 || random1 == random3 || random2 == random3){
				System.out.println("You won! Your wager has now been doubled!!");
				System.out.println("You now have $" + ((bet*2) +left));
				left = (bet*2) + left;
				System.out.println("----------------------------------------------------");
			}
			if (random1 == random2 && random1==random3){
				System.out.println("JACKPOT! Your wager has now been tripled!!!");
				System.out.println("You now have $" + ((bet *3)+ left));
				left = (bet*3) + left;
				System.out.println("----------------------------------------------------");
			}
			if (left == 0){
				System.out.println("You've run out of money! Thanks for playing! Come back soon!");
				break;
			}
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
			ans = sc.nextLine();
		}}
	}
}
