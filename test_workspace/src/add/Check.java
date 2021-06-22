package add;

import java.util.Arrays;

public class Check {
	public static void check(int arr[], int tocheckvalue) {
		boolean test = false;
		for(int element : arr) {
			if(element == tocheckvalue) {
				test = true;
				break;
			}
		}
		System.out.println("is " + tocheckvalue + " present in the array " + test);
	}
	public static void main(String []args) {
		int arr[] = {5,6,9,8,9,10};
		int tocheckvalue = 7;
		System.out.println("array: " + Arrays.toString(arr));
		check(arr,tocheckvalue);
	}

}
