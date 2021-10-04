package Assignment3;

public class Program7 {

	public static void main(String[] args) {
		try  
		{  
		   int c=30/0;  
		    try  
		    {  
		       int d=1*0;  
		       
		    }  
		    catch(ArithmeticException e)  
		    { 
		    	System.out.println(e);
		    }  
		}  
		catch(ArithmeticException e1)  
		
		{  
			System.out.println(e1);
		}  

	}

}
