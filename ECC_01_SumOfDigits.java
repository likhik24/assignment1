package assignment1;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.*;

public class ECC_01_SumOfDigits {
    public static void main(String[] args) {
        int num;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter value");
        num=scan.nextInt();
        System.out.println(getSumOfDigits(num));
    }

   

	public static int getSumOfDigits(int num)	{
    	int sum = 0;
    	if(num<0)
    		return -3;
    	while(num>0)
    		{
    		if(num>99) 
    		
    		return -2;
    	else if(num<=9)
    	 return -1;
    	else
    	{
    		while(num>0)
    		{
    			    		sum=sum+num%10;
    	                    num=num/10;
    		}
    		}
    		}
    	return sum;
 
    }
}
