package Assignment4;


import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class Program4
{
 public static void main(String args[])
 {
	      Map<Integer, String> myMap = new HashMap<>();
	      myMap.put(1, "Java1");
	      myMap.put(2, "Java2");
	      myMap.put(3, "Java3");
	      myMap.put(4, "Java4");

	      ArrayList<Integer> k1 = new ArrayList<Integer>(myMap.keySet());
	      

	      System.out.println("list of keys in the hashmap is ::"+k1);

	   }
	}


