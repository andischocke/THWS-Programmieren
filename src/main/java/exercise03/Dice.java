package exercise03;

public class Dice
{
    public static void main(String[] args)
    {
        int index = (int) (Math.random() * 6);
        String[] dice = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs"};
        System.out.println("Der Würfel hat eine " + dice[index] + " gewürfelt.");
    }
}