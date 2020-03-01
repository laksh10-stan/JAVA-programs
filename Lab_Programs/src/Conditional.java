import java.util.Scanner;
class Conditional
{
public static void main(String args[])
{
int a,b,r;
System.out.println("Enter two numbers to be compared:");
Scanner in= new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
r=a>b?b:a;
System.out.println("The Smaller number is\t"+r);
}
}