import java.util.Scanner;

public class Condition {

	public static void main(String[] args)
	{
	System.out.println("Enter two numbers to be compared:");
    Scanner s1= new Scanner (System.in);
    Scanner s2= new Scanner (System.in);
    int a= s1.nextInt();
    int b= s2.nextInt();
    int min=(a<b)?a:b;
    System.out.println("The Minimum of two Numbers is\t"+min);
		

	}

}
