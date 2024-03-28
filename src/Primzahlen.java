import java.util.Scanner;

public class Primzahlen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isPrime(number))
        {
            System.out.println("Die eingegebene Zahl ist eine Primzahl.");
        } else
        {
            System.out.println("Die eingegebene Zahl ist keine Primzahl.");
        }
    }

    public static boolean isPrime(int number)
    {
        if (number < 2)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}