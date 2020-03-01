class A1{
	public void get()
	{
		System.out.println("Get A");
	}
	public void putA() {
		System.out.println("Put A");
	}
}
class B1 extends A1{
	public void get()
	{
		System.out.println("Get B");
	}
	public void putB() {
		System.out.println("Put B");
	}
}
public class Tryme {

	public static void main(String[] args) {
		
B1 ob=new B1();
ob.get();
ob.putA();
ob.putB();
	}

}
