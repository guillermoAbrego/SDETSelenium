package assingment4;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> brandsList = new ArrayList<String>(); 
		
		brandsList.add("Toyota");
		brandsList.add("Nissan");
		brandsList.add("KIA");
		brandsList.add("Subaru");
		brandsList.add("Renault");
		
		//Print arrayList before reverse
		System.out.println("Before reverse: " + brandsList);
		
		//Reversing arrayList
		Collections.reverse(brandsList);
		
		//Print arrayList after reverse
		System.out.println("After reverse: " + brandsList);

	}

}
