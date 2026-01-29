package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		int r = row;
		int c = column;
		generateTreasure();
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureX = (int)(Math.random()*map.length);
		treasureX = (int)(Math.random()*map[0].length);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		if(m == 1){
			posY++;
		}
		else if(m == 2){
			posY--;
		}
		else if(m == 3){
			posX--;
		}
		else if (m == 4){
			posX++;
		}
		else if (m == 5){
			posY++;
			posX--;
		}
		else if (m == 6){
			posY++;
			posX++;
		}
		else if (m == 7){
			posY--;
			posX--;
		}
		else if (m == 8){
			posY--;
			posX++;
		}
		if (m < map.length){
			return true;
		}
		else {
			return false;
		}
		// Dummy value to make work
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		if (row < map.length && col < map[0].length){
			return true;
		}
		else {
			return false;
		}
			// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if (map[posX][posY] == map[treasureX][treasureY]){
			map[posX][posY] = 5;
			return true;
		}
		else {
		map[posX][posY] = 2;
		return false;
		} // Dummy value to make work
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		printMap();
		System.out.print(map[treasureX][treasureY]);
	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		for (int r = 0; r < map.length; r++){
			for(int c = 0; c < map[0].length; c++){
				int loc = map[r][c] = 0;
				System.out.print(loc);
			}
			System.out.println();
		}

	}

}
