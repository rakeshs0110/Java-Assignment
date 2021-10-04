package Assignment2;

public class Program1 {

	public static void main(String[] args) 
	{
		  int[] arr = {1,2,3,4,5};
	        int total = 0;

	        for(int i=0; i<arr.length; i++)
	        {
	        	total = total + arr[i];
	        }
	        int average = total / arr.length;
	        
	      
	        System.out.format("The average is: "+average);
	}

}
