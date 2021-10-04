package Assignment4;
import java.util.TreeSet;

public class Program6 {
	
	
	   public static void main(String[] args) 
	   {
	      TreeSet<Integer> treeSet = new TreeSet<Integer>();
	      treeSet.add(1098);
	      treeSet.add(20001);
	      treeSet.add(15);
	      treeSet.add(200);
	      treeSet.add(450);
	      treeSet.add(50);
	      treeSet.add(4000);
	 
	      System.out.println("TreeSet Lowest value = " + treeSet.first());
	      System.out.println("TreeSet Highest value = " + treeSet.last());
	   }
	}

	

