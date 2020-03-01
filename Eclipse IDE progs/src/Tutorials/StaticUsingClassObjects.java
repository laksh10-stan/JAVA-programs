package Tutorials;

public class StaticUsingClassObjects {
static int var1=177;
 String var2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticUsingClassObjects ob1=new StaticUsingClassObjects();
		StaticUsingClassObjects ob2=new StaticUsingClassObjects();
		ob1.var1=88;
		ob1.var2="I'm Object 1";
		ob2.var1=881;
		ob2.var2="I'm Object 2";
		System.out.println("ob1 integer:"+ob1.var1);
		System.out.println("ob1 String:"+ob1.var2);
		System.out.println("ob2 integer:"+ob2.var1);
		System.out.println("ob2 String:"+ob2.var2);
	}

}
