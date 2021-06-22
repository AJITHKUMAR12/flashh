package add;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

public class List1 {
	


public static void main(String[] args) {
	
	/*HashMap<String,String> values = new HashMap<>();
	TreeMap<String,String> values = new TreeMap<>();
	values.put("name", "ajith");
	values.put("actor", "vijay");
	for(String key : values.keySet())
	{	
		System.out.println("key " + key +  "values: " + values.get(key));
	}*/
	
	
	/*ArrayList<String> values = new ArrayList<>();
	values.add("b sachin");
	values.add("z msd");
	values.add("a kholi");
	System.out.println("before sorting");
	
	for(String i : values) {
		System.out.println(i); 
	}
	System.out.println("After sorting");
 	
	Collections.sort(values,Collections.reverseOrder());
	for(String in : values) {
		System.out.println(in);
	}*/
	
	
	
	
	/*ArrayList<Integer> values = new ArrayList();
	values.add(98);
	values.add(97);
	values.add(12);
	//values.add(1,10);
	values.remove(0);
	
	Collections.reverse(values);
	
	//for(int i : values) {
		System.out.println(values);
	//}*/
	
	
	
	
	/*LinkedList <String> ll  = new LinkedList<>();
	ll.add("apple");
	ll.add("banana");
	ll.add("mango");
	//System.out.println(ll);
	ArrayList <String> lll = new ArrayList<>(ll);
	for(String i : lll)
	System.out.println(i);*/
	
	
	
	
	Set <String> str = new HashSet<>();
	str.add("mango");
	str.add("apple");
	str.add("orange");
	System.out.println(str);
	
	String[] array = new String[str.size()];
	str.toArray(array);
	for(String i : array ) {
		System.out.println(i);
	}
	}
}
	
