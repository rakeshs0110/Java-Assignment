package Assignment1;

public class Fibboncci {

	public static void main(String[] args) 
	{
		int a, b, c, i, n;
	      n = 10;
	      a = 0;
	     b = 1;
	      System.out.print(a+" "+b);
	      for(i = 2; i <= n-1; i++) {
	         c = a + b;
	         System.out.print(" ");
	         System.out.print(c);
	         a = b;
	         b = c;

	}

}
}