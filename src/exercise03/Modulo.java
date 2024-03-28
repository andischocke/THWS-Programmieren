package exercise03;

import java.util.Scanner;

public class Modulo
{
    public static void main(String[] args)
    {
        int divisibleBy = 7;

        Scanner scanner = new Scanner(System.in);
        int number = getNumberFromUser(scanner);

        if (isDivisible(number, divisibleBy))
        {
            System.out.printf("%d is divisible by %d.\n", number, divisibleBy);
        } else
        {
            System.out.printf("%d is not divisible by %d.\n", number, divisibleBy);
        }

        scanner.close();
    }

    private static int getNumberFromUser(Scanner scanner)
    {
        int number;
        while (true)
        {
            try
            {
                System.out.print("Number to check: ");
                number = scanner.nextInt();
                break; // If input is valid, exit loop
            } catch (Exception e)
            {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
        return number;
    }

    private static boolean isDivisible(int number, int divisibleBy)
    {
        return number % divisibleBy == 0;
    }
}