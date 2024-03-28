package exercise04;

import java.util.Scanner;

public class FreierFall
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Dauer des freien Falls in Sekunden ein: ");
        int duration = scanner.nextInt();
        System.out.print("Bitte geben Sie das Intervall für die Ausgabe in Sekunden ein: ");
        int interval = scanner.nextInt();
        scanner.close();

        System.out.println("Zeit\t\t\tZurückgelegte Strecke");
        for (int i = 1; i <= duration; i++)
        {
            if (i % interval == 1 || interval == 1)
            {
                double distance = calculateDistance(i);
                System.out.printf("%6d s\t\t%12.2f m\n", i, distance);
            }
        }
    }

    private static double calculateDistance(int time)
    {
        return 0.5 * 9.80665 * Math.pow(time, 2);
    }
}