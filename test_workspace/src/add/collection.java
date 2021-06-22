package add;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class collection {
	public static void main(String []args) throws Exception
	{
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(763);
		values.add(960);
		values.add(530);
		
		// remove(5)  here 5 is value
		// remove(1) here 1 is location
		values.remove(0);
		values.add(0,521);
		Collections.sort(values,(o1,o2)->
		{
			return o1%10>o2%10?1:-1;
		});
		
		//Comparator <Integer>com = new Comparatort();
		//Collections.sort(values,com);
		//Collections.sort(values);
		//Collections.reverse(values);
		//values.forEach(System.out::println);
		//values.add("ajith");
		/*Iterator i = values.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		for(int i : values) {
			System.out.println(i);
		}
		
	}
}
