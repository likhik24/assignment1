package assignment1;

public class ECC_27_getFactorial
{

	public static void main(String[] arg) {
		int num = 3;
		System.out.println(getFactorial(num));
	}

	public static int getFactorial(int num)
	{
		
		if(num > 0)
			return num*getFactorial(num-1);
		else if(num<0)
			return -1;
		else if(num == 0)
			return -2;
		
		// ADD YOUR CODE HERE
		return num;
		
	}
}