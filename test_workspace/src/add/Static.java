package add;
class emp{
	
		int id;
		int salary;
		static String ceo;
		
		
		public void show() {
			System.out.println(id  + " " + salary + " " + ceo);
			
		}
		
	
	
}

public class Static {

	public static void main(String[] args) {
		emp ajith = new emp();
		ajith.id= 69;
		ajith.salary= 2000;
		emp.ceo = "mahesh "; //we dont need object for static values .so we can use class name;
		
		//ajith.show();
		
		
		
		
		
		emp kumar = new emp();
		kumar.id= 6;
		kumar.salary = 3000;
		emp.ceo="mahesh";
		
		kumar.ceo = "Ak";
		ajith.show();
		kumar.show();

	}

}
