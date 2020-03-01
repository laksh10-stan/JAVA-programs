
public class NewClass {
	static int i=10;
	public NewClass() {
		i++;
	}
	static void printstatic() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		NewClass.printstatic();
		 NewClass obj1=new NewClass();
		 System.out.println(obj1.i);
		 NewClass obj2=new NewClass();
		 System.out.println(obj2.i);
		 NewClass obj3=new NewClass();
		 System.out.println(obj3.i);
		 

	}

}
