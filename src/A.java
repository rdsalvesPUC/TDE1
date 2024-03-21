public class A {
    public static void main(String args[])
    {
        System.out.println(f(256, 6));
        System.out.println(f(-60.8, -4));
    }
    private static double f(double x, int k)
    {
        if (k < 0) k = -k;
        for (int i = 0; i < k; i++)
        {
            if (i % 2 == 0)
                x = x / 2;
            else
                x = -x / 2;
        }
        return x;
    }
}