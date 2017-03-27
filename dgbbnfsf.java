package assignment1;


	import java.util.*;
	import java.io.*;
	public class dgbbnfsf {
	
	public static void main(String[] args) 
	{
	// int x=5;
	 //char[] chars = new char[x];
	 char[] chars={'P','R','O','G','R','A','M'};
	 for (int i = 0; i < chars.length; i++) {
	// chars[i] = 's';
	// chars[x - 1 - i] = 's';
	 for (int j = 0; j < chars.length; j++) 
	  {
		 
	    if (j == i || j == (chars.length - 1- i)) 
	      {
	    	System.out.print(chars[j]);
	      }
	    else {
            System.out.print(" ");
        }
//      chars[j] = ' ';
    }
    System.out.println();
}
}
}
	

