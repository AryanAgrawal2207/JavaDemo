import java.util.*;
public class Order
{
    public static void main(String[] args) 
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (b > a && c > b) 
        {
            System.out.print("Numbers are in increasing order.");
        } 
        else if (a > b && b > c) 
        {
            System.out.print("Numbers are in decreasing order.");
        } 
        else 
        {
            System.out.print("Numbers are neither in increasing nor decreasing order.");
        }
    }
}
