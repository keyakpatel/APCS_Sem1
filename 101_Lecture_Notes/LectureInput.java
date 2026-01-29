/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        double item1Price = 3.51;
        double item2Price = 4.29;
        double item3Price = 5.87;
        System.out.println("🍭 Welcome to Keya's Cafe! 🍭");
        System.out.println("Here is our menu:");
        System.out.println("1. 🧁 Cupcake - $" + item1Price);
        System.out.println("2. 🍩 Doughnut - $" + item2Price);
        System.out.println("3. 🥨 Pretzel - $" + item3Price);
        
        
        System.out.println();
        System.out.println("What's the name for the order?");
        String name = sc.nextLine();
        
        System.out.println();
        System.out.println("How many Cupcakes would you like?");
        int quant1 = sc.nextInt();
        System.out.println("How many Doughnuts would you like?");
        int quant2 = sc.nextInt();
        System.out.println("How many Pretzels would you like?");
        int quant3 = sc.nextInt();
        
        System.out.println();
        double total1 = item1Price * quant1;
        double total2 = item2Price * quant2;
        double total3 = item3Price * quant3;
        double total = total1 + total2 + total3;
        System.out.println("Your total currency is: $" + total);
        System.out.println("What percent would you like to tip?");
        double tipPercent = sc.nextDouble();
        
        double tip = total * (tipPercent/100);
        double grandTotal = tip + total;
        
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println(name + "'s Receipt 🧾");
        System.out.println(quant1 + " x Cupcake = $" + total1);
        System.out.println(quant2 + " x Doughnut = " + total2);
        System.out.println(quant3 + " x Pretzel = " + total3);
        System.out.println("Tip (" + tipPercent + ") = $" + tip);
        System.out.println("----------------------------------");
        System.out.println("Grand Total = $" + grandTotal);
        System.out.println("----------------------------------");
        System.out.println("Thanks for dining at Keya's Cafe!");
        
	}
}
