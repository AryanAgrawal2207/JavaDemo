import java.util.*;
class Area
{
double l ;
double b;
void setDim(double l, double b)
{
this.l=l;
this.b=b;
}
void getarea()
{
System.out.println("AREA OF RECTANGLE IS : "+(l*b));
}
}
class RectArea
{
public static void main(String args[])
{
Area R = new Area();
Scanner sc = new Scanner(System.in);
System.out.print("ENTER LENGTH AND BREADTH OF RECTANGLE : ");
double l = sc.nextInt();
double b = sc.nextInt();
R.setDim(l,b);
R.getarea();
}
}
