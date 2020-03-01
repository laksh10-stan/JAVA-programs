import java.util.Scanner;
public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two numbers to be compared:");
        Scanner s1= new Scanner (System.in);
        Scanner s2= new Scanner (System.in);
        int a= s1.nextInt();
        int b= s2.nextInt();
        int min=(a<b)?a:b;
        System.out.println("The Minimum of two Numbers is\t"+min);
        
        
	}

}
