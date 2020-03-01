class Super_class {
public void disp() {
	System.out.println("This is the method of superclass");
}
}
public class Sub_Class extends Super_class{
	public void disp() {
		System.out.println("This is the method of subclass");
	}
	public void My_method() {
		disp();
		
	}
	public static void main(String args[]) {
		Sub_Class obj=new Sub_Class();
		obj.My_method();
		
	}
}