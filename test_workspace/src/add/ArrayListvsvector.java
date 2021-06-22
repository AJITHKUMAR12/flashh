package add;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListvsvector {
	public static void main(String[] args) throws Exception
	{
		ArrayList <Integer> a= new ArrayList<Integer>();// it is 50% 2.not thread safe 3.fast 4.it is only use when compared to vector
		Vector<Integer> v = new Vector<Integer>();// it will increase the capacity by 100% and it waste memory  2.Thread safe 3.slow 4.it is not to use when compared to that.
		v.add(5);
		v.add(7);
		System.out.println(v.capacity());
		for (int i : v) {
			System.out.println(i);
			
		}
		
	}
}
