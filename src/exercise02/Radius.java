package exercise02;

public class Radius
{
    public static void main(String[] args)
    {
        double radius = 10;

        double circleArea = Math.PI * Math.pow(radius, 2);
        double circleCircumference = 2 * Math.PI * radius;
        double sphereVolume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Mit einem Radius von %.2f hat unser Kreis eine Fläche von %.2f und einen Umfang von %.2f. Wäre es eine Kugel, würde sie ein Volumen von %.2f haben.\n", radius, circleArea, circleCircumference, sphereVolume);
    }
}