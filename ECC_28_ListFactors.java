package assignment1;

public class ECC_28_ListFactors {
    public static void main(String[] args) {
        int num = 285;
        System.out.println(getFactors(num));
    }
	public static String getFactors(int num) {
		if(num<0)
			return String(-1);
		else if(num == 0)
			return String(-2);
		else
		{
			
			int i=1;
			
			while(i<num)
			{
			
				if(num%i == 0)
				{
					System.out.println(String(i));
					
				}	
				
					i++ ;
			}
		}
		return " ";
	}
		
        
        
		
		
		// ADD CODE HERE
	
	private static String String(int i) {
		String strI =Integer.toString(i);
		return strI;
		// TODO Auto-generated method stub
		
	}
}