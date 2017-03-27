package assignment1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ecc_hackerrun {

    private static Scanner scan;

	public static void main(String[] args) {
      scan = new Scanner(System.in);
      
        
       
      
          // String str1= scan.nextLine();
           System.out.println("How many Inputs??");
           int numOfInputs = scan.nextInt();
           String[] dataStore = new String[numOfInputs];
           System.out.println("Input Strings");

           for (int i = 0; i < numOfInputs; i++) {
               dataStore[i] = scan.next();
             //  System.out.println("Input " + (i + 1) + " = " + dataStore[i]);

        char[] chars=dataStore[i].toCharArray();
        //char[] chars = {'P', 'R', 'O', 'G', 'R', 'A', 'M'}; 
       
        int length = chars.length;
        for (int i1 = 0; i1 < length; i1++) {
        	if(i1%2==0)
        	{
        		System.out.print(chars[i1]);
        	}
        	
        	}
        System.out.print(" ");
        for (int i2 = 0; i2 < length; i2++) {
        	
        	if(i2%2==1)
        	{
        		System.out.print(chars[i2]);
        	}
        }
       
        	
        
       
           }
        }
    }
      	
            
            
           
        
        //str
         //System.out.println(temp);
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
 
