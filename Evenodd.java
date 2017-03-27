package assignment1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Evenodd
{
	
	   public static void main(String[] args) {
		   System.out.println("enter value");
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt(); 
	      scan.close();
	      String ans="";
	          
	      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
	      if(n%2==1)
	      {
	         ans = "Weird";
	      }
	      
	      else if(n>2)
	    	  {
	    	  if(n<5)
	    	  {
	    		  ans="not wierd";
	    	  }
	    	  else if(n<20)
	    	  {
	    		 ans="wierd";
	    	  }
	    	  
	    	  else
	    	  {
	    		  ans="not wierd";
	    	  }
	    	 
	    	  }
	      
	         // Complete the code 
	      
	      System.out.println(ans);
	   
	



	   }
}
