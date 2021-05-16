package assingment4;

import java.util.HashMap;
import java.util.Map;

public class CheckIfKeyIsPresent {

	public static void main(String[] args) {
		Map<Integer, String> myMap = new HashMap<>();
		
		myMap.put(1, "Milk");
		myMap.put(2, "Eggs");
		myMap.put(3, "Cheese");
		
		//Change value of this variable to test negative
		int keyToSearch = 10;
		
		boolean isKeyPresent = myMap.containsKey(keyToSearch);
		
		String message = (isKeyPresent) ? "Key " + keyToSearch + " is present" : "Key " + keyToSearch + " is NOT present";
		System.out.println(message);
	}
}
