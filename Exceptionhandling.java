import java.util.*;
class Exceptionhandling
{
public static void main(String args[])
   {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Numerator:");
      a=sc.nextInt();
      System.out.println("Enter Denominator:");
      b=sc.nextInt();
       try
       {
         c=a/b;
         System.out.println("The answer is: "+c);
       }
       catch(ArithmeticException e)
       { 
         System.out.println(e);
       }
    System.out.println("But the execution continues......");
   }
}

