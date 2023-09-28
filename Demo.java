import java.util.*;
class Employee
{
String empname;
int empid;
double basic,da,hra,cca,pf,pt;
double gross, net;
void process()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter name of employee :");
empname = sc.next();
System.out.println("Enter ID :");
empid = sc.nextInt();
System.out.println("Enter basic salary :");
basic = sc.nextDouble();
da = 0.7 * basic;
hra = 0.3 * basic;
cca = 240;
pf = 0.1 * basic;

pt = 100;
gross = basic + da + hra + cca + pf + pt;
net = gross - pf - pt;
System.out.println("Gross salary of "+ empname +" is "+ gross);
System.out.println("Net salary is : "+ net);
}
}
class Demo
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter no. of Empolyees : ");
int n = sc.nextInt();
Employee E[] = new Employee[n];
for(int i=0; i<n; i++)
{
E[i] = new Employee();
E[i].process();
}
}
}