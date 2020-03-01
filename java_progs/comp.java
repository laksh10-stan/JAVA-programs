import java.util.Scanner;
class comp{
public static void main(String args[])
{
int a,b;
System.out.println("Enter the two numbers to be compared");
Scanner in= new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();

int t=a>b?b:a;
System.out.println("The Smaller number is\t"+t);
}



}