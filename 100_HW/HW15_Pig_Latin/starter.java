/*
   * Author: Keya Patel
   * Date: 12/12/25
   * Collaborator(s):
*/
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.println();
		System.out.println("Here is your sentence in Pig Latin!");
		
		String letter = "";
		String ans = "";
		while (sentence.indexOf(" ") != -1){
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			sentence = sentence.substring(space + 1);
			if (word.indexOf("a") == 0 || word.indexOf("e") == 0 || word.indexOf("i") == 0 || word.indexOf("o") == 0 || word.indexOf("u") == 0 ){
				System.out.print(word + "-ay" + " ");
			}
			else if (word.indexOf("a") == 2 || word.indexOf("e") == 2 || word.indexOf("i") == 2 || word.indexOf("i") == 2 || word.indexOf("o") == 2 || word.indexOf("u") == 2){
				letter = word.substring(0,2);
				ans = word.substring(2);
				System.out.print(ans + "-" + letter + "ay" + " ");
			}
			else {
				letter = word.substring(0,1);
				ans = word.substring(1);
				System.out.print(ans + "-" + letter + "ay" + " ");
			}
		}
		if (sentence.indexOf("a") == 0 || sentence.indexOf("e") == 0 || sentence.indexOf("i") == 0 || sentence.indexOf("o") == 0 || sentence.indexOf("u") == 0 ){
				System.out.print(sentence + "-ay");
			}
			else if (sentence.indexOf("a") == 2 || sentence.indexOf("e") == 2 || sentence.indexOf("i") == 2 || sentence.indexOf("i") == 2 || sentence.indexOf("o") == 2 || sentence.indexOf("u") == 2){
				letter = sentence.substring(0,2);
				ans = sentence.substring(2);
				System.out.print(ans + "-" + letter + "ay" + " ");
			}
			else {
				letter = sentence.substring(0,1);
				ans = sentence.substring(1);
				System.out.print(ans + "-" + letter + "ay" + " ");
	}
} }
