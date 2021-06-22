package add;
class outer{
	int i;
	public void show () {
		
	}
	class Inner{
		public void display() {
		System.out.println("display");
		}
		
	}
}

public class InnerDemo {

	public static void main(String[] args) {
		
		outer obj = new outer();
		obj.show();

	
	outer. Inner obj1 = obj. new Inner();
	obj1.display();
	}

}
