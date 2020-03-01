import java.util.Scanner;
class Pattern1
{
public static void main(String[] args) 
{
int a,i,j,k;
System.out.println("Enter the no. of rows:");
Scanner s1= new Scanner (System.in);
a= s1.nextInt();
for(i=1; i<=a; i++)
{
for(j=a-1; j>=i; j--)
{
System.out.print(" ");
}
for(k=1; k<=(2*i-1); k++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
