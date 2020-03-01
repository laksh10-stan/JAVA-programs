package Tutorials;

public class Static {

	public static void main(String[] args) {
		
		Hello hello=new Hello();
		hello.age=10;
		Hello.dosomething("Message");
		hello.Dosomethingelse("Message");
		
		Hello hello1 =new Hello();
		Hello.age=20;
		System.out.println(hello1.age);

	}

}
