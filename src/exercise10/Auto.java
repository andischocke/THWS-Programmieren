package exercise10;

public class Auto extends exercise09.Auto
{
    //region Attributes
    private static int producedCars = 0;
    //endregion

    //region Getter and Setter
    public static int getProducedCars()
    {
        return producedCars;
    }

    public static void setProducedCars(int producedCars)
    {
        Auto.producedCars = producedCars;
    }
    //endregion

    //region Constructors
    public Auto(String brand, int displacement, String color)
    {
        super(brand, displacement, color);
        producedCars++;
    }
    //endregion

    //region Methods
    public static int calculateRevenue(int averagePrice)
    {
        return producedCars * averagePrice;
    }
    //endregion
}