import java.util.Scanner;

public class Querprodukt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true)
        {
            System.out.print("Bitte geben Sie eine ganze Zahl zwischen 0 und 1.000.000 ein: ");
            number = readValidNumber(scanner);
            if (number >= 0 && number <= 1000000)
            {
                break;
            } else
            {
                System.out.println("Fehler - Ungültige Zahl.");
            }
        }
        System.out.printf("Das Querprodukt von %d ist %d\n", number, calculateQuerprodukt(number));
        scanner.close();
    }

    public static int readValidNumber(Scanner scanner)
    {
        while (!scanner.hasNextInt())
        {
            System.out.print("Fehler - Bitte geben Sie eine ganze Zahl ein: ");
            scanner.next(); // Verwirft die Eingabe
        }
        return scanner.nextInt();
    }

    public static int calculateQuerprodukt(int number)
    {
        int product = 1;
        while (number != 0)
        {
            product *= (number % 10);
            number /= 10;
        }
        return product;
    }
}