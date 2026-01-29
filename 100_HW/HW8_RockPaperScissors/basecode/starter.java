/*
 *	Author: Keya Patel
 *  Date: 10/19/25
 *	Collaborator(s):
*/

import java.util.Random;
import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int playTimes = 0;
        String ans = "hi";
        String playType = "bye";
        
        while (true){
            System.out.println("Would you like to play the computer? (yes/no/done)");
            ans = sc.nextLine();
            System.out.println();
            
            if (ans.equals("yes")){
                System.out.println("--------------------------------------------");
                System.out.println("Please enter rock/paper/scissors: ");
                playType = sc.nextLine();
                if (playType.equals(getObject())){
                    System.out.println("You tied!");
                }
                if ((playType.equals("scissors") && getObject().equals("rock")) || (playType.equals("rock") && getObject().equals("paper")) || (playType.equals("paper") && getObject().equals("scissors"))){
                    System.out.println("You lost!");
                }
                if ((playType.equals("scissors") && getObject().equals("paper")) || (playType.equals("rock") && getObject().equals("scissors")) || (playType.equals("paper") && getObject().equals("rock"))){
                    System.out.println("You won!");
                }
                System.out.println();
                System.out.println("--------------------------------------------");
            }
            
            
            if (ans.equals("no")){
                System.out.println("--------------------------------------------");
                System.out.println("How many times would you like the computer to play itself?");
                playTimes = sc.nextInt();
                System.out.println("Player 1 wins: " + compare2());
                System.out.println("Player 2 wins: " + compare2());
                System.out.println("Ties: " + compare2());
                System.out.println();
                System.out.println("--------------------------------------------");
            }
            
            if (ans.equals("done")){
                System.out.println("Thanks for playing!");
                break;
            }
            
        }

    }
    
    public static String getObject(){
        String getObject = "bleh";
        int object = (int)(Math.random()*3 + 1);
        if (object == 1){
            getObject = "rock";
        }
        if (object == 2){
            getObject = "paper";
        }
        if (object == 3){
            getObject = "scissors";
        }
        
        return getObject;
    }
    
    public static int compare2(int playTimes){
        int a = 0;
        while (a < playTimes){
            a += 1;
        }
        return;
    }
}
