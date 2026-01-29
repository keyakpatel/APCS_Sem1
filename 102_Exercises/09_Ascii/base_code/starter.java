/*
 *	Author: Keya Patel
 *  Date: 09/29/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter bird, heart, or face: ");
		String make = sc.nextLine();
		
		if (!((make.equals("bird")) || (make.equals("heart")) || (make.equals("face")))){
			System.out.println("Try again and please enter one of the options above: ");
			make = sc.nextLine();
		}
		if (make.equals("bird")){
			System.out.println("         X XX");       
			System.out.println("        X    X");    
			System.out.println("      X        X");     
			System.out.println("     X           X X");  
			System.out.println("     X              X");
            System.out.println("      X         X XX");  
            System.out.println("       X        X");     
            System.out.println("      X         X");     
            System.out.println("      X         X");    
            System.out.println("      X        X");      
            System.out.println("      X X X X X");      
            System.out.println("       X  X");         
            System.out.println("       X  X");
		}
		else if (make.equals("heart")){
			System.out.println("        XXXXX    XXXXX");  
			System.out.println("       X     X  X     X"); 
			System.out.println("      X       X        X");
			System.out.println("      X                X");
			System.out.println("       X              X"); 
			System.out.println("        X            X");  
    		System.out.println("          X         X");   
    		System.out.println("           X       X");    
    		System.out.println("            X    X");     
        	System.out.println("              X X      ");
		}
		else if (make.equals("face")){
			System.out.println("X  X  X  X  X  X  X");
			System.out.println("X                 X");
    		System.out.println("X     XX     XX   X");     
			System.out.println("X     XX     XX    X");
            System.out.println("X   X          X   X");
    		System.out.println(    " X        X");     
			System.out.println("X     X X X X     X");
			System.out.println("X                 X");
			System.out.println("X  X  X  X  X  X  X");
		}
	}
}
