package add;

public class Dim {
	public static void main(String args[]) {
		int a[][][] = new int [3][3][3];
		//int b[][][] = new int [3][3][3];
		for(int i=100;i>97;i--) {
			for(int j=0;j<i;j=i-1) {
				for(int k=0;k<i;k=i-1) {
					a[i][j][k] = i+j+k;
				}
			}
			
		}
		for(int i= 100;i>97;i--) {
			for(int j=0;j<i;j=i-1) {
				for(int k=0;k<i;k=k-1) {
					System.out.print(a[i][j][k]);
				}
			}
			
			
		}
		
	}

}
 