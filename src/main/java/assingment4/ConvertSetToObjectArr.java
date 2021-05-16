package assingment4;

import java.util.HashSet;
import java.util.Set;

public class ConvertSetToObjectArr {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>();
	      hs.add(20);
	      hs.add(21);
	      hs.add(30);
	      hs.add(31);
	      hs.add(40);
	      hs.add(41);
	      hs.add(50);
	      hs.add(51);
	      
	      System.out.println("Elements in hashset = " + hs);
	      System.out.println("Copying all elements from hashset to object array...");
	      
	      Object[] obArr = hs.toArray();
	      for (Object ob : obArr)
	      System.out.println(ob);
	}
}
