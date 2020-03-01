package pack;
import java.util.Scanner;
public class Rect {

	public static void main(String[] args) {
		int i,l,b;
		System.out.println("Enter the length and breadth of rectanle:");
		Scanner sc=new Scanner (System.in);
		l=sc.nextInt();
		b=sc.nextInt();
		for(i=0;i<l;i++)
		{
			System.out.print(".");
			
		}
		System.out.print("\n");
		for(i=0;i<b;i++)
		{
			System.out.print(".");
			for(i=0;i<l;i++)
			{
				System.out.print("\t");
				System.out.print(".");
				System.out.print("\n");
				
			}
			
		}
		for(i=0;i<l;i++)
		{
			System.out.print(".");
			
		}
	
	}

}
