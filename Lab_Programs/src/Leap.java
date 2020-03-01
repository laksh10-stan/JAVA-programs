import java.util.Scanner;
public class Leap {

	public static void main(String[] args) 
	{
		int i;
		Scanner s1= new Scanner (System.in);
		System.out.println("Enter lower limit year : ");
		int a= s1.nextInt();
		System.out.println("Enter upper limit year : ");
		int b= s1.nextInt();
		if(a<b)
		{   
			System.out.println("The leap years between "+a+" and "+b+" are as follows:");
			for(i=a;i<b;i++)
			{
			if ((i%4==0)&&((i%100!=0)||(i%400==0)))
			{
				System.out.println(i);
			}
			}
		}
		else 
		{
			System.out.println("The upper limit of year must be greater than lower limit of year");	
			System.out.println("Therefore, Please enter the correct data");
		}
		
	}

}
