package add;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> values = new TreeSet<>();// no duplicate values,not give in sequencs;
		System.out.println(values.add(9));// it is also allows boolean values;
		System.out.println(values.add(7));
		System.out.println(values.add(9));
		values.add(234);
		values.add(623);
		values.add(123);
		values.add(2);
		for(int i : values) {
			System.out.println(i);
		}
	}

}
