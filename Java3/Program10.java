package Assignment3;

public class Program10 {

	public static void main(String[] args) {
		try {
	         throw new Exception("throwing an exception");
	      } catch (Exception e) {
	         System.out.println(e.getMessage());
	      }
	}

}
