package add;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class List {
	public static void main(String [] args) {
		//ArrayList<Integer> values = new ArrayList<>();
		//Set<Integer> values = new HashSet<>();
		HashMap<Integer,String> values2 = new HashMap<>();
		values2.put(1, "Ajith");
		values2.put(2,"vijay");
		values2.put(3,"suriya");
		System.out.println(values2);
		System.out.println(values2.size());
		System.out.println(values2.isEmpty());
		
		
		
		//String [] values1 = {"ajith","vijay","suriya"};
		//ArrayList<String> values = new ArrayList<>(Arrays.asList(values1));
		//values.add("rajni");
		//values.add("kamal");
		//System.out.println("before adding elements"  + values.size());
		
		
		//values.add(23);
		//values.add(98);
		//values.add(76);
		//System.out.println("after adding elements"  + values.size());
		//values.remove(1);
		//System.out.println("after removing elements"  + values.size());
		
		
		/*for(Integer i : values) {
			System.out.println(i);
		}*/
		/*if(values.contains(23)) {
			System.out.println("yes");
			
		}
		else
		{
			System.out.println("no");
		}*/
	}

}
