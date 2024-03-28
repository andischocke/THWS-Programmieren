import java.util.Scanner;

public class Potenz
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basis: ");
        double basis = scanner.nextDouble();
        System.out.print("Exponent: ");
        int exponent = scanner.nextInt();
        scanner.close();

        System.out.printf("Potenz: %.2f\n", calculatePower(basis, exponent));
    }

    public static double calculatePower(double basis, int exponent)
    {
        double power = 1;
        if (exponent != 0)
        {
            for (int i = 0; i < Math.abs(exponent); i++)
            {
                power *= basis;
            }
            if (exponent < 0)
            {
                power = 1.0 / power;
            }
        }
        return power;
    }
}