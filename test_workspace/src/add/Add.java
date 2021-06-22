package add;

public class Add {
	public static void main(String [] args) {
		int a[][][] = new int [3][3][3];
 		int b[][][] = new int [3][3][3];
				
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					a[i][j][k] =100 - (i+j+k);
					b[i][j][k] =a[i][j][k];
				}
				
			}
			
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					System.out.println("b["+i+"]["+j+"]["+k+"] " +b[i][j][k]);
				}
			}
		}
		
		
				
	}

}
