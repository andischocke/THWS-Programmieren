package exercise06;

import java.util.Scanner;

public class PiApproximation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Intervall: ");
        double interval = scanner.nextDouble();
        scanner.close();

        double pi = 0;
        double width = 1.0 / interval;
        for (int i = 0; i <= interval; i++)
        {
            double height = Math.sqrt(1 - Math.pow(i * width, 2));
            pi += height * width;
        }
        System.out.printf("Pi ≈ %.10f\n", 4 * pi);
    }
}