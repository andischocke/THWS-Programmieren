public class Tausch
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 7;

        // Vor dem Tausch
        System.out.println("Pre Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Tausch
        x = x + y;
        y = x - y;
        x = x - y;

        //Nach dem Tausch
        System.out.println("Post Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}