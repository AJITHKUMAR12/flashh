package add;
class add1{
	int i;
	int j;
	String op;
	public add1() {
		 i = 0;
		 j = 0;
		 op = "nothing";
		 
	}
	public add1(int a) {
		i = a;
		j = 0;
		op = "nothing";
	}
	public add1(int a, int b) {
		i = a;
		j = b;
		op = "nothing";
	}
	public add1(int a,int b, String c)
	{
		i = a;
		j = b;
		op = c;
	}
	
	
	
	
	
	
	
	
	
	/*public void add1 (int i,int j) {
		System.out.println(i+j);//method overloading
	}
	public void add1 (int i,int j,int k) {
		System.out.println(i+j+k);
	}
	public void add1(double i,int j,int k) {
		System.out.println(i+j+k);
	}*/
}


public class MethodOverloading {
	public static void main(String [] args) {
		add1 obj= new add1();
		/*obj.add1(4,5);
		obj.add1(9, 8,7);
		obj.add1(9.5,6,5);*/
	}

}
