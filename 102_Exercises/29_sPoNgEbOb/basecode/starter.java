/*
	Author: Keya Patel
	Date: 01/12/26
*/
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word/phrase:");
		String phrase = sc.nextLine();
		
		
		while(phrase.indexOf(" ") != -1){
			int space = phrase.indexOf(" ");
			String word = phrase.substring(0, space);
			spongeWord(word);
			phrase = word.substring(space+1);
		}
	
	}
	
	public static String spongeWord(String word){
		String ans = "";
		for (int i = 0; i < word.length(); i++){
			String letter = word.substring(i, i+1);
			if (i % 2 == 0){
				letter = letter.toLowerCase();
				//System.out.print(letter);
			}
			else if (i % 2 == 1){
				letter = letter.toUpperCase();
				//System.out.print(letter);
			}
			ans = ans + letter;
		}
		return ans;
		
	}
}
