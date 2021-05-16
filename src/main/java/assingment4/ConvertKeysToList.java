package assingment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertKeysToList {

	public static void main(String[] args) {
		Map<Integer, String> langMap = new HashMap<Integer, String>();
		
		langMap.put(1, "Java");
		langMap.put(2, "JavaScript");
		langMap.put(3, "Python");
		langMap.put(4, "C#");
		langMap.put(5, "Scala");
		
		ArrayList<Integer> keysList = new ArrayList<Integer>(langMap.keySet());
		System.out.println("List of keys: " + keysList);

	}

}
