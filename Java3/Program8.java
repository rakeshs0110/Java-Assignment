package Assignment3;

public class Program8 {

	public static void main(String[] args) {
		String name = null;

		 

        try {
            name.equals("Joe"); // causes NullPointerException
        } 
        catch (NullPointerException e) {
           throw e;
        }


	}

}
