public class Sort 
{
    static int count0 = 0;
    public void count(int[] a) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == 0) 
            {
                count0++;
            }
        }
    }
    public void arrange(int a[]) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            if (i < count0) 
            {
                a[i] = 0;
            } 
            else 
            {
                a[i] = 1;
            }
        }
    }
    public static void main(String[] args) 
    {
        int a[] = { 1, 0, 1, 0, 1, 0, 1 };
        Sort s = new Sort();
        System.out.println("Elements of array are");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(" " + a[i] + " ");
        }
        System.out.println("");
        s.count(a);
        s.arrange(a);
        System.out.println("Elements of segregated array are");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(" " + a[i] + " ");
        }
    }
}