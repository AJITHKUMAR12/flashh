package add;
class A{
	int n;
	int m;
	int result;

public A() {
	n = 5;
	m = 6;
	
	
}
public A(int k) {
	n=k;
	m=k;
	
}
public A(double d,int o) {
	m=(int)d;
	n = o;
}
}

public class ClassDemo {
	public static void main(String [] args) {
		A obj = new A(5);
		System.out.println(obj.n);
		System.out.println(obj.m);
	}

}
