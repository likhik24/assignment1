package assignment1;

public class ECC_18_ReverseOrder {

	public static void main(String[] arg) {
		int start_val = 20;
		int end_val = 39;
		System.out.println(getNumbersInRange(start_val, end_val));
	}

    public static String getNumbersInRange(int s_val, int e_val) {
    	if(s_val<0 && e_val<0)
    		return convert(-1);
	
    	else if(s_val == e_val)
    		return convert(-2);
    	else 
    	{
    		
    		if(s_val > e_val)
    			return convert(-3);
    		
    		while(e_val-s_val==1 || e_val-s_val== -1)
    		
    			return convert(-4);
    		
    	}
    		
    			for(int j=s_val+1;j<e_val;j++)
    			{
    				System.out.println( convert(j));
    		    }
    		
    		
    		  
    	return " ";
		
	}

	private static String convert(int i) {
		// TODO Auto-generated method stub
		String strI = Integer.toString(i);
		return strI;
	}
}
