public class Pizzarechner {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(26, 11);
        Pizza pizza2 = new Pizza(24, 10);
        pizzaComparator(pizza1, pizza2);
    }

    private static void pizzaComparator(Pizza pizza1, Pizza pizza2) {
        double pizza1Ratio = pizza1.calculateAreaPriceRatio();
        double pizza2Ratio = pizza2.calculateAreaPriceRatio();

        System.out.printf("1. Pizza: %.2f cm²/€\n", pizza1Ratio);
        System.out.printf("2. Pizza: %.2f cm²/€\n", pizza2Ratio);

        if (pizza1Ratio > pizza2Ratio) {
            System.out.println("Pizza 1 hat ein besseres cm²/€ Verhältnis.");
        } else if (pizza1Ratio < pizza2Ratio) {
            System.out.println("Pizza 2 hat ein besseres cm²/€ Verhältnis.");
        } else {
            System.out.println("Pizza 1 und 2 haben das gleiche cm²/€ Verhältnis.");
        }
    }

    public static class Pizza {
        private double diameter;
        private double price;

        public Pizza(double diameter, double price) {
            this.diameter = diameter;
            this.price = price;
        }

        public double calculateArea() {
            return Math.PI * Math.pow(diameter / 2, 2);
        }

        public double calculateAreaPriceRatio() {
            return calculateArea() / price;
        }

        @Override
        public String toString() {
            return diameter + " cm " + price + " €";
        }
    }
}