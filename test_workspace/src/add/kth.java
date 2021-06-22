package add;

import java.util.Arrays;

public class kth {
	public static int kthsmall(Integer[] arr,int k) {
		Arrays.sort(arr);
		return arr[k-1];
		
		
		
	}
	public static void main(String [] args) {
		Integer arr[] = new Integer[] {1,2,3,9,5,6,7};
		int k = 3;
		System.out.println("kth smallest element is " + kthsmall(arr,k));
		
	}

}
