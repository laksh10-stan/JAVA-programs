
public class Cons {

		private int var;
		
public Cons() {
	var=10;
}
public Cons(int a) {
	var=a;
}
int getVar() {
	return var;
}
	public static void main(String []args)
	{
		Cons obj1=new Cons();
		Cons obj2=new Cons(20);
		System.out.println(obj1.getVar());
		System.out.println(obj2.getVar());
	}
	
}
