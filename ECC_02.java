package assignment1;

public class ECC_02 {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(getDiffOfDigits(num));
    } 
    public static int getDiffOfDigits(int num) {
    	int difference=0;
    
	// ADD YOUR CODE HERE
    	if(10< num)
    	{
    		if(num< 99)
    		{
    			int temp=num;
    			difference=(temp/10)-difference;
    			temp=temp%10;
    			difference=difference-temp;
    			return difference;
    		}
    		
    		else
    		return -2;
    	}
    			
    	else if(num<0)
    		return -3;
    	else
    		return -1;
    }
}
