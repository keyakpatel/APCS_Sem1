/*
 *	Author: Keya Patel
 *  Date: 09/17/25
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random = ((int)(Math.random()*3+1));
		
		
	if (random == 1){
			System.out.println("The goal of this game is to guess a word with two hints!");
			System.out.println();
			System.out.println("It's a US State!");
			System.out.println("What is your guess? ");
		}
		String ans1 = sc.nextLine();
		System.out.println();
			if (ans1.equals("Delaware")){
				System.out.println("You got it right! Woo!");
			}
			if(!ans1.equals("Delaware")) {
				System.out.println("You sadly did not guess correctly, here's another hint!");
				System.out.println("It starts with the letter D");
			}
		String ans2 = sc.nextLine();
			if (ans2.equals("Delaware")){
				System.out.println();
				System.out.println("You got it right! Woo!");
			}
			else {
				System.out.println();
				System.out.println("You sadly did not guess right, better luck next time!");
			}
			
			
	if (random == 2){
			System.out.println("The goal of this game is to guess a word with two hints!");
			System.out.println();
			System.out.println("It is a fruit!");
			System.out.println("What is your guess? ");
			String ans3 = sc.nextLine();
		}
			String ans3 = sc.nextLine();
			System.out.println();
			if (ans3.equals("banana")) {
				System.out.println("You got it right! Woo!");
			}
			if (!ans3.equals("banana")){
				System.out.println("You sadly did not guess correctly, here's another hint!");
				System.out.println("It's a yellow fruit");
			}
			String ans4 = sc.nextLine();
			System.out.println();
			if (ans4.equals("banana")){
				System.out.println("You got it right! Woo!");
			}
			else {
				System.out.println("You sadly did not guess it right, better luck next time!");
			}
			
			
	if (random == 3){
			System.out.println("The goal of this game is to guess a word with two hints!");
			System.out.println();
			System.out.println("It is a dessert!");
			System.out.println("What is your guess? ");
			}
			String ans5 = sc.nextLine();
			System.out.println();
			if (ans5.equals("ice cream")) {
				System.out.println("You got it right! Woo!");
			}
			if (!ans5.equals("ice cream")){
				System.out.println("You sadly did not guess correctly, here's another hint!");
				System.out.println("It's cold and creamy");
			}
			String ans6 = sc.nextLine();
			System.out.println();
			if (ans6.equals("ice cream")){
				System.out.println("You got it right! Woo!");
			}
			else {
				System.out.println("You sadly did not guess it right, better luck next time!");
			}
	}
}
