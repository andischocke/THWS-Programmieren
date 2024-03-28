package exercise09;

import java.util.ArrayList;

public class Speisekarte
{
    public static void main(String[] args)
    {
        Pizza[] pizzas = new Pizza[10];
        pizzas[0] = new Pizza(33, "Pizza Ananas");
        pizzas[0].addVariation(26, 4.00);
        pizzas[0].addVariation(32, 5.50);
        pizzas[0].addVariation(50, 10.00);

        pizzas[1] = new Pizza(34, "Pizza Sucuk");
        pizzas[1].addVariation(26, 4.00);
        pizzas[1].addVariation(32, 5.50);
        pizzas[1].addVariation(50, 10.00);

        pizzas[2] = new Pizza(35, "Pizza Spaghetti");
        pizzas[2].addVariation(26, 4.00);
        pizzas[2].addVariation(32, 5.50);
        pizzas[2].addVariation(50, 10.00);

        pizzas[3] = new Pizza(46, "Pizza Pollo");
        pizzas[3].addVariation(26, 4.00);
        pizzas[3].addVariation(32, 5.50);
        pizzas[3].addVariation(50, 10.00);

        pizzas[4] = new Pizza(47, "Pizza Sardelle");
        pizzas[4].addVariation(26, 4.00);
        pizzas[4].addVariation(32, 5.00);
        pizzas[4].addVariation(50, 10.00);

        pizzas[5] = new Pizza(48, "Pizza Scampi");
        pizzas[5].addVariation(26, 5.00);
        pizzas[5].addVariation(32, 7.00);
        pizzas[5].addVariation(50, 12.00);

        pizzas[6] = new Pizza(49, "Pizza Spinaci");
        pizzas[6].addVariation(26, 4.00);
        pizzas[6].addVariation(32, 5.00);
        pizzas[6].addVariation(50, 10.00);

        pizzas[7] = new Pizza(50, "Margherita");
        pizzas[7].addVariation(26, 3.00);
        pizzas[7].addVariation(32, 4.00);
        pizzas[7].addVariation(50, 10.00);

        pizzas[8] = new Pizza(51, "Pizza Cipolla");
        pizzas[8].addVariation(26, 3.50);
        pizzas[8].addVariation(32, 4.50);
        pizzas[8].addVariation(50, 10.00);

        pizzas[9] = new Pizza(52, "Pizza Schinken");
        pizzas[9].addVariation(26, 3.50);
        pizzas[9].addVariation(32, 4.50);
        pizzas[9].addVariation(50, 10.00);

        for (Pizza pizza : pizzas)
        {
            System.out.println(pizza);
        }
    }

    public static class Pizza
    {
        private final int number;
        private final String name;
        private final ArrayList<PizzaVariation> variations = new ArrayList<>();

        public Pizza(int number, String name)
        {
            this.number = number;
            this.name = name;
        }

        public void addVariation(double diameter, double price)
        {
            variations.add(new PizzaVariation(diameter, price));
        }

        @Override
        public String toString()
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Pizza #").append(number).append(": ").append(name).append("\n");
            for (PizzaVariation variation : variations)
            {
                sb.append(String.format("\t%f cm: %.2f EUR\n", variation.getDiameter(), variation.getPrice()));
            }
            return sb.toString();
        }

    }

    public static class PizzaVariation
    {
        private final double diameter;
        private final double price;

        public PizzaVariation(double diameter, double price)
        {
            this.diameter = diameter;
            this.price = price;
        }

        public double getDiameter()
        {
            return diameter;
        }

        public double getPrice()
        {
            return price;
        }
    }
}