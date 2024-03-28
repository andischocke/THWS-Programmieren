package exercise02;

public class QuadraticEquation
{
    public static void main(String[] args)
    {
        double p = 6;
        double q = 2;

        double sqrt = Math.sqrt(Math.pow(p / 2, 2) - q);
        double x1 = (-p / 2) + sqrt;
        double x2 = (-p / 2) - sqrt;

        System.out.printf("Die Quadratische Gleichung mit p = %.2f und q = %.2f hat ein x1 = %.2f und ein x2 = %.2f.\n", p, q, x1, x2);
    }
}