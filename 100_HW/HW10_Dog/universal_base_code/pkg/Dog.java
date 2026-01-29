package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	Scanner sc = new Scanner(System.in);
	String name; 
	String breed; 
	int age; 
	
	public Dog() { //  - Default name to "Clifford", default age to "3", default breed to "big red dog"
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	
	public DogName() { // Set the name to the input Default age to "1", default breed to "dog dog"
		name = sc.nextLine();
		age = 1;
		breed = "dog dog";
	}
	
	public DogBreed() { // Set the name and breed to inputs Default age to "1"
		name = sc.nextLine();
		breed = sc.nextLine();
		age = 1;
	}
	
	public DogAge() { //    - Set the name and age to inputs Default breed to "dog dog"
		name = sc.nextLine();
		age = sc.nextInt();
		breed = "dog dog";
	}
	
	public void setName(String n){
		name = n;
		return;
	}
	
	public void setAge(int a){
		age = a;
		return;
	}
	
	public void setBreed(String b){
		breed = b;
		return;
	}
	
	public String getname(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBreed(){
		return breed; 
	}
	
	public boolean isSleeping(){ // Use a random 50/50 chance to check if the dog is sleeping Returns a boolean if it's sleeping
		int x = (int)(Math.random()*2);
		if (x = 0){
			return false;
		}
		else if (x = 1){
			return true;
		}
		else {
			return false;
		}
		
	public void bark(){ //  Print out the dog name and that it barks! Returns nothing No Input
		System.out.println("Name of Dog" + name);
		System.out.println("This dog barks!");
		return;
	}
	}
