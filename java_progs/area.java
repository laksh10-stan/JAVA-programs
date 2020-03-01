import java.util.Scanner;
public class area
{
public static void main (String[] args)
{
float r;
double perimeter;
double pi=3.14,area;
Scanner s=new Scanner(System.in);
System.out.print("Enter Radius of the circle:");
r = s.nextFloat();
area=pi*r*r;
perimeter=2*pi*r;
System.out.println("Area of circle"+area);
System.out.println("Perimeter of Circle"+perimeter);
}
}