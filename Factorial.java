import java.util.*;
class Factorial
{
public static int fact(int n)
{
int factorial=1,i;
for(i=2;i<=n;i++)
factorial=factorial*i;
return factorial;
}
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
n=sc.nextInt();
System.out.println("Factorial of "+n+" is "+ fact(n));
}
}