import java.util.*;
import static java.lang.Math.*;
class Quadratic
{
    public void Roots(double a, double b, double c) 
    {
        final double d = (b * b) - (4.0 * a * c);
        if (d < 0.0) 
        {
            System.out.println("No real solutions.");
        } 
        else if (d == 0.0) 
        {
            System.out.println("Roots are equal which is " + ((-b) / 2.0 * a));
        } 
        else 
        {
            System.out.println("Roots are " + ((-b + sqrt(d)) / (2.0 * a)) + " and " + ((-b - sqrt(d)) / (2.0 * a)));
        }
    }
    public static void main(String[] args) 
    {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a,b and c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        Quadratic sol = new Quadratic();
        sol.Roots(a, b, c);
    }
}
