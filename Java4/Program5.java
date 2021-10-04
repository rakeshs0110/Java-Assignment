package Assignment4;
import java.util.*;

public class Program5 {
   public static void main(String args[]) 
   {
	      Set<Integer> hs = new HashSet<Integer>();
	      hs.add(1);
	      hs.add(2);
	      hs.add(3);
	      hs.add(4);
	      hs.add(5);
	    
	      System.out.println("elements in the hash set is"+hs);
	      System.out.println("Copying all elements...");
	      Object[] obArr = hs.toArray();
	      for (Object ob : obArr)
	      System.out.println(ob);
	   }
	}
	

