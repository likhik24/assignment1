package assignment1;
import java.util.*;
import java.math.*;

public class HotelBill {



 

    public static void main(String[] args) {
    	System.out.println("enter values");
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
       double tip= (tipPercent *mealCost)/100;
       double tax=(taxPercent * mealCost)/100;
       double k= tip + tax + mealCost;
       
        // Write your calculation code here.
      
        System.out.println(k);
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(k);
      
        // Print your result
        
        System.out.println("the total meal cost is "+  totalCost);
    }
}
