import java.util.*;
public class RecursiveMenu
{
    public int GcdLcm(int m, int n) 
    {
        if (n > m) 
        {
            return GcdLcm(n, m);
        } 
        else if (n == 0) 
        {
            return m;
        } 
        else  
        {
            return GcdLcm(n, m % n);
        }
    }
    public int Fibonacci(int y) 
    {
        if (y == 0)
            return 0;
        else if (y == 1 || y == 2)
            return 1;
        else
            return (Fibonacci(y - 1) + Fibonacci(y - 2));
    }
    public void Reverse(int n)
    {
        if (n < 10) 
        {
            System.out.println(n);
            return;
        }
        else 
        {
            System.out.print(n % 10);
            Reverse(n / 10);
        }
    }
    public int Summation(int n)
    {
        if (n == 0) 
        {
            return 0;
        } 
        else
        {
            return n + Summation(n - 1);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        RecursiveMenu r = new RecursiveMenu();
        int x;
        do 
        {
            System.out.print("\nMENU:\n1.GCD and LCM.\n2.To print n Fibonacci numbers.\n3.Do reverse of number.\n4.Summation till a number.\n5.EXIT\nEnter your choice : ");
            x = sc.nextInt();
            switch (x)
            {
                case 1: 
                {
                    System.out.print("Enter two numbers: ");
                    int m = sc.nextInt();
                    int n = sc.nextInt();
                    int ansGCD = r.GcdLcm(m, n);
                    int ansLCM = (m * n) / ansGCD;
                    System.out.print("GCD is " + ansGCD + " and LCM is " + ansLCM);
                    break;
                }
                case 2: 
                {
                    System.out.print("Enter the number: ");
                    int m = sc.nextInt();
                    System.out.println("Fibonacci series is:");
                    for (int i = 0; i < m; i++) 
                    {
                        int p = r.Fibonacci(i);
                        System.out.print(p + " ");
                    }
                    break;
                }
                case 3: 
                {
                    System.out.print("Enter the number to find reverse : ");
                    int n = sc.nextInt();
                    System.out.print("Reverse is ");
                    r.Reverse(n);
                    break;
                }
                case 4: 
                {
                    System.out.print("Enter number till which summation is required : ");
                    int n = sc.nextInt();
                    System.out.print("Summation is " + r.Summation(n));
                    break;
                }
                case 5:
                    break;
                default:
                    System.out.print("Invalid Entry");
            }
        } while (x != 5);
    }
}
