package Abstract;
public class Overloading {
	public static void main(String[] args) {
		System.out.println(sum(2.1,5.3));
		System.out.println(sum(2,5,9));
		System.out.println(sum("Hello"," World"));
		}
	public static double sum(double a, double b) {
		return(a+b);
	}
	public static  int sum(int a, int b,int c) {
		return(a+b+c);
	}
	public static String sum(String a, String b) {
		return(a+b);
	}
}
//Sub_Class sub=new Sub_Class();
		//sub.disp();
		//Super_class super=new Super_class();
		//super.disp();
		//System.out.println("Value of the variable num in sub_class:"+sub.num);
		//System.out.println("Value of the variable num in super_class:"+super.num);

