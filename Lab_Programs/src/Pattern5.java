import java.util.Scanner;
class Pattern5 
{
public static void main(String[] args) 
{
int a,i, j, k;
System.out.println("Enter the no. of rows:");
Scanner s1= new Scanner (System.in);
a= s1.nextInt();
for(i=a;i>=1;i--)
{
for(j=1;j<i;j++)
{
System.out.print(" ");
}
for(k=a;k>=i;k--)
{
System.out.print("*");
}
System.out.println();
}
}
}