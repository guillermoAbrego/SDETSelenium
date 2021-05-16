package assingment4;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListAlphabetically {

	public static void main(String[] args) {
		ArrayList<String> myArrList = new ArrayList<>();
		
		myArrList.add("Orange");
		myArrList.add("Pear");
		myArrList.add("Apple");
		myArrList.add("Kiwi");
		myArrList.add("Grapes");
		
		System.out.println("Before sorting arrayList: " + myArrList);
		
		Collections.sort(myArrList);
		System.out.println("Sorted arrayList: " + myArrList);

	}

}
