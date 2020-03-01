import java.util.Scanner;
class Pattern4 
{
public static void main(String[] args) 
{
 int a,i, j;
 System.out.println("Enter the no. of rows:");
 Scanner s1= new Scanner (System.in);
 a= s1.nextInt();
 for(i=a;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}