package exercise10;

public class AutoManager
{
    public static void main(String[] args)
    {
        Auto[] autos = new Auto[3];
        autos[0] = new Auto("VW", 230, "weiß");
        autos[1] = new Auto("BMW", 430, "blau");
        autos[2] = new Auto("Mercedes", 500, "grau");

        int averagePrice = Auto.calculateRevenue(20000);
        System.out.println("The total revenue is " + averagePrice + "€.");
    }
}
