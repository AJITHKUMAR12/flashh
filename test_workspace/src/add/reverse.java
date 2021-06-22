package add;

public class reverse {
	public static void reversearray(int arr[], int start,int end) {
		int temp = 0;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
			
		}
	}
		static void printArray(int arr[], int size) {
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
				
			}
			System.out.println();
			
		}
		public static void main(String [] args) {
			int arr[] = {1,2,4,5,6,7};
			printArray(arr,6);
			reversearray(arr,0,5);
			
			System.out.println("reversedarray is \n");
			printArray(arr,6);
			}   
	}


