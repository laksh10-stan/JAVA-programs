import java.util.Scanner;
class Diamond 
{
public static void main(String[] args) 
{
int a,i, j, k;
System.out.println("Enter the no. of rows:");
Scanner s1= new Scanner (System.in);
a= s1.nextInt();
for(i=1;i<=a;i++)
{
for(j=i;j<a;j++)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
for(i=a-1;i>=1;i--)
{
for(j=a;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
}
}