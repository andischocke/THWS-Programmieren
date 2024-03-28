package exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmetischesMittel
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Anzahl der Werte
        System.out.print("Anzahl der Einträge: ");
        int eintragsAnzahl = scanner.nextInt();

        // Überprüfung, ob die Anzahl der Einträge gültig ist
        if (eintragsAnzahl <= 0)
        {
            System.out.println("Fehler! Die Anzahl der Einträge muss größer als 0 sein.");
            System.exit(0);
        }

        // Eingabe der Werte
        double[] einträge = new double[eintragsAnzahl];
        for (int i = 0; i < eintragsAnzahl; i++)
        {
            System.out.printf("Eintrag %d: ", (i + 1));
            einträge[i] = scanner.nextDouble();
        }
        scanner.close();

        // Sortieren der Einträge
        Arrays.sort(einträge);

        // Ausgabe des kleinsten und größten Eintrags
        System.out.printf("Kleinster Eintrag: %.2f\n", einträge[0]);
        System.out.printf("Größter Eintrag: %.2f\n", einträge[eintragsAnzahl - 1]);

        // Berechnung und Ausgabe des arithmetischen Mittels
        double mittelwert = berechneMittelwert(einträge);
        System.out.printf("Arithmetisches Mittel: %.2f\n", mittelwert);

        // Berechnung und Ausgabe der Standardabweichung
        double standardabweichung = berechneStandardabweichung(einträge, mittelwert);
        System.out.printf("Standardabweichung: %.2f\n", standardabweichung);
    }

    // Methode zur Berechnung des arithmetischen Mittels
    public static double berechneMittelwert(double[] array)
    {
        double summe = 0;
        for (double eintrag : array)
        {
            summe += eintrag;
        }
        return summe / array.length;
    }

    // Methode zur Berechnung der Standardabweichung
    public static double berechneStandardabweichung(double[] array, double mittelwert)
    {
        double summeQuadAbweichungen = 0;
        for (double eintrag : array)
        {
            double abweichung = eintrag - mittelwert;
            summeQuadAbweichungen += abweichung * abweichung;
        }
        double mittlereQuadAbweichung = summeQuadAbweichungen / array.length;
        return Math.sqrt(mittlereQuadAbweichung);
    }
}