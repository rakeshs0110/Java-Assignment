package Assignment2;

public class Program4 {
	
	static int findSum(int number)  
	{     
	//variable that stores the sum      
	int sum = 0;  
	//executes until the condition becomes false  
	while (number != 0)  
	{  
	//finds the last digit from the number and add it to the variable sum      
	sum = sum + number % 10;  
	//removes the last digit  
	number = number/10;  
	}  
	//returns the sum  
	return sum;  
	}  

	public static void main(String[] args) {
		int number = 1234;  
		
		System.out.println("The sum of digits: "+findSum(number)); 

	}

}
