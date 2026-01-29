/*
	Author: Keya Patel
	Date: 10/27/25
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman tobey = new spiderman("Tobey McGuire", 48, "Green Goblin");
		tobey.printSpiderman();
		
		Spiderman andrew = new spiderman("Andrew Garfield", 40, "Electro");
		andrew.printSpiderman();
		
		Spiderman tom = new spiderman("Tom Holland", 27, "The Vulture");
		tom.printSpiderman();

		
	}
}
