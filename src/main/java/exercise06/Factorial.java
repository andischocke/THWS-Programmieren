package exercise06;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fakultät von: ");
        int number = scanner.nextInt();
        System.out.printf("Fakultät: %d\n", factorial(number));
        scanner.close();
    }

    public static int factorial(int number)
    {
        int faculty = 1;
        for (int i = 1; i <= number; i++)
        {
            faculty *= i;
        }
        return faculty;
    }
}