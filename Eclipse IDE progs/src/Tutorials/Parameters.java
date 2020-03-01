package Tutorials;

public class Parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstMethod("Jon Snow");
		MyFirstMethod("Robb");
		MyFirstMethod("Bran");
		MyFirstMethod("Tywin");
		Add(100,201);
		Add(100,240);
		Add(13545,201);
		Add3(231,100,1);
		Add3(231,100,32);
		int sum=Return(1,2,3);
		System.out.println(sum);
		int res=sum*12;
		System.out.println(res);
	}
	public static void MyFirstMethod(String name) {
		System.out.println("Hello " +name);
	}
	public static void Add(int a,int b) {
		System.out.println(a+b);
	}
	public static void Add3(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static int Return(int a,int b,int c) {
		return (a+b+c);
	}

}
