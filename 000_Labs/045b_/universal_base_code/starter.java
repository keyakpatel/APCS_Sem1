/*
 *	Author: Keya Patel
 *  Date: 01/20/26
*/

import java.util.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
		
		System.out.println("Please enter a word you'd like to hide in a crossword puzzle:");
		String word = sc.nextLine();
		word = word.toUpperCase();
		int length = word.length() + 5;
		String [][] arr = new String [length][length];
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		int direction = (int)(Math.random()*3);
		String w = " ";
		int same = (int)(Math.random()*arr.length);
				
			if (direction == 0){ 
				// direction is horizontal
				for (int n = 0; n < word.length(); n++){
					int count = 0;
					String col = word.substring(n,n+1); 
					arr[same][count] = col;
					count++;
					
				}
					
			}
			
			if (direction == 1){
				// direction is vertical
				for (int n = 0; n < word.length(); n++){
					int count = 0;
					String row = word.substring(n,n+1); 
					arr[count][same] = row;
					count++;
				}	
			}
			
			int rand = (int)(Math.random());
			if (direction == 2){
				// direction is diagonal
				for (int n = 0; n < word.length(); n++){
					int count1 = 0; 
					int count2 = word.length();
					String let = word.substring(n, n+1);
					if (rand == 0){
						arr[count1][count2] = let;
					}
					
					if (rand == 1){
						arr[count2][count1] = let;
					}
					count1++;
					count2--;
				}
					
			}
		
		
		System.out.println("-----Crossword Puzzle-----");
		for (int r = 0; r < arr.length; r++){
			for (int c = 0; c < arr[0].length; c++){
					System.out.print(arr[r][c] = letters[(int)(Math.random()*letters.length)] + " ");
			}
		  System.out.println();
		}
		
	}
}
