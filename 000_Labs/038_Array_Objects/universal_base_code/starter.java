/*
 *	Author:  Keya Patel
 *  Date: 11/20/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] warrior = new Warrior[100];
		for (int i = 0; i < 100; i++){
			warrior [i] = new Warrior();
		}
		Wizard[] wizard = new Wizard[100];
		for (int i = 0; i < 100; i++){
			wizard [i] = new Wizard();
		}
		
	int i = 0;
	while (true){
		System.out.println(wizard[i].attack(warrior[i]));
		i++;
		if (i > 99){
			break;
		}
	}
		
		
	}
}
