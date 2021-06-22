package add;

import java.util.Arrays;
import java.util.Scanner;

public class key {
	public static void main(String args[]) {
		int m,n,loc = 0,k = 0,j = 0,valb = 0,valc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many numbers");
		n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("enter the numbers");
		
		for(int i=0;i<n;i++) {
			
			a[i] = sc.nextInt();
			System.out.println(a[i]);
		}
		//System.out.println(a[i]);
		System.out.println("enter how it split");
		
		loc = sc.nextInt();
		int b[] = new int[loc];
		for(int i=0;i<loc;i++) {
			b[k] = a[i];
			k++;
			
		}
		int c[] = new int[loc];
		for(int i=loc;i<n;i++ ) {
			c[j] = a[i];
			j++;
		}
		
		System.out.println("" + Arrays.toString(b));
		
		System.out.println("" + Arrays.toString(c) );
		m = sc.nextInt();
		/*for(int a1=0;a1<loc;a1++) 
		{
			
		if(b[a1] % m == 0 ) 
		{
			
		
			for(int b1=0;b1<loc;b1++) 
			{
				if(c[b1] % m == 0);
			}
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		}*/
		
		for(int i=0;i<loc;i++) {
			if(b[i] % m == 0) {
				
				valb ++;
			}
			if(c[i] % m == 0) {
				valc++;
			}
		}
		
		if(valb >=1) {
			System.out.println("yes");
		}
		else if (valc >= 1) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		}
	}
 


