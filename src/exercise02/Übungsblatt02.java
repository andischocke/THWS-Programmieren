package exercise02;

import java.time.LocalTime;

public class Übungsblatt02
{
    // Übungsblatt 2 Aufgabe 2
    public static void calculateRadius(double radius)
    {
        double circleArea = Math.PI * Math.pow(radius, 2);
        double circleCircumference = 2 * Math.PI * radius;
        double sphereVolume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Mit einem Radius von %.2f hat unser Kreis eine Fläche von %.2f und einen Umfang von %.2f. Wäre es eine Kugel, würde sie ein Volumen von %.2f haben.\n", radius, circleArea, circleCircumference, sphereVolume);
    }

    // Übungsblatt 2 Aufgabe 3
    public static void quadraticEquation(double p, double q)
    {
        double sqrt = Math.sqrt(Math.pow(p / 2, 2) - q);
        double x1 = (-p / 2) + sqrt;
        double x2 = (-p / 2) - sqrt;

        System.out.printf("Die Quadratische Gleichung mit p = %.2f und q = %.2f hat ein x1 = %.2f und ein x2 = %.2f.\n", p, q, x1, x2);
    }

    // Übungsblatt 2 Aufgabe 4
    public static void clock()
    {
        LocalTime now = LocalTime.now();

        int secondsSinceMidnight = now.getHour() * 3600 + now.getMinute() * 60 + now.getSecond();
        int secondsUntilMidnight = 86400 - secondsSinceMidnight;
        double percentOfDay = 100.0 / 86400 * secondsSinceMidnight;

        System.out.printf("Seit Mitternacht sind %d Sekunden vergangen. Bis Mitternacht verbleiben noch %d Sekunden. %.2f Prozent des Tages ist vergangen.", secondsSinceMidnight, secondsUntilMidnight, percentOfDay);
    }

    public static void main(String[] args)
    {
        calculateRadius(10);
        quadraticEquation(10, 10);
        clock();
    }
}