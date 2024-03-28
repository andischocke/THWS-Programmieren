public class Einmaleins
{
    public static void main(String[] args)
    {
        for (int a = 1; a <= 10; a++)
        {
            for (int b = 1; b <= 10; b++)
            {
                System.out.printf("%2d x %2d = %3d\n", a, b, a * b);
            }
        }
    }
}
