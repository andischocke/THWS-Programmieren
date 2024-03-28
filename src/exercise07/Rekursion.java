package exercise07;

import java.util.Scanner;

public class Rekursion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basis: ");
        double base = scanner.nextDouble();
        System.out.print("Exponent: ");
        int exponent = scanner.nextInt();
        scanner.close();

        System.out.printf("Potenz: %f\n", pow(base, exponent));
    }

    public static double pow(double base, int exponent)
    {
        return (exponent == 0) ? 1 : base * pow(base, (exponent - 1));
    }
}