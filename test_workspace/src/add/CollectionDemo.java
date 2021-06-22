package add;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
	public static void main(String [] args) {
		//List<Integer> values = Arrays.asList(98,87,86);
		List<Integer> values = new ArrayList()
		{{
			add(32);
			add(36);
			add(90);
			
		}};
		for(int i : values) {
			System.out.println(i);
		}
		
	}

}
