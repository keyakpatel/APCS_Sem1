package pkg;
import java.util.*;

public class ShoppingCartItem {
    
String itemName; 
double itemCost;
int quantity;

public ShoppingCartItem(){
    itemName = "nothing";
    itemCost = 0.0;
    quantity = 0;
}
public ShoppingCartItem(String in, double ic, int q){
    itemName = in;
    itemCost = ic;
    quantity = q; 
}

public void cartToString(){
    System.out.println("You have " + quantity + " of " + itemName + " for $" + itemCost + " each");
    return;
}

public String getItemName(){
    return itemName;
}

public int getQuantity(){
    return quantity;
}

public double getTotalCost(){
    return (quantity * itemCost);
}

public double getTotalWithTax(){
    return ((quantity * itemCost) * 0.12) + (quantity * itemCost);
}

public double quantityToCostCalculator(int amount){
    return (amount * itemCost);
}

public boolean compareItemCost(ShoppingCartItem x){
    if (this.itemCost < x.getTotalCost()){
        return true;
    }
    else {
        return false;
    }
}
}
