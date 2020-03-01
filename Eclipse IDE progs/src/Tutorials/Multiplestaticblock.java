package Tutorials;

public class Multiplestaticblock {
static int num;
static String mystr;
static {
	
	System.out.println("Static Block 1");
	num =76;
	mystr="Block 1";
}
static {
	
	System.out.println("Static Block 2");
	num =126;
	mystr="Block 2";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value of num:" +num);
		System.out.println("Value of string:" +mystr);
	}

}
