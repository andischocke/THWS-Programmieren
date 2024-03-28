package exercise02;

import java.time.LocalTime;

public class Clock
{
    public static void main(String[] args)
    {
        LocalTime now = LocalTime.now();

        int secondsSinceMidnight = now.getHour() * 3600 + now.getMinute() * 60 + now.getSecond();
        int secondsUntilMidnight = 86400 - secondsSinceMidnight;
        double percentOfDay = 100.0 / 86400 * secondsSinceMidnight;

        System.out.printf("Seit Mitternacht sind %d Sekunden vergangen. Bis Mitternacht verbleiben noch %d Sekunden. %.2f Prozent des Tages ist vergangen.", secondsSinceMidnight, secondsUntilMidnight, percentOfDay);
    }
}