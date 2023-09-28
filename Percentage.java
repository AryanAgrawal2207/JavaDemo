import java.util.*;
class Percentage
{
public static void main(String args[])
{
float p,c,m,total;
float percent;
System.out.println("Enter physics,Chemistry and Maths marks out of 100:");
Scanner sc=new Scanner(System.in);
p=sc.nextFloat();
c=sc.nextFloat();
m=sc.nextFloat();
total=p+c+m;
System.out.println("Your total is:"+total);
percent=(float)((total/300.0)*100);
System.out.println("Your percentage is:"+percent);
if(percent>=85 && percent<=100)  
   System.out.println("Congratulations!You achieved Distinction");
else if(percent>=60 && percent<85)
   System.out.println("You passed with First Class");
else if(percent>=50 && percent<60)
   System.out.println("You obtainrd Second Class");
else if(percent>=0 && percent<50)
   System.out.println("Oops!You Failed");
else
   System.out.println("Please enter correct marks");
}
}