package Assignment1;

public class FactorialNumber {

	public static void main(String[] args) {
		int n=5;
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
System.out.println("factorial of number is :"+fact);
	}

}
