package exercise03;

import java.util.Scanner;

public class Einzelzeichen
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein Zeichen ein: ");
        char inputChar = scanner.nextLine().charAt(0);
        scanner.close();

        boolean identified = false;

        if (isCapitalLetter(inputChar))
        {
            System.out.println("Das eingegebene Zeichen ist ein Großbuchstabe.");
            identified = true;
        }
        if (isHexadecimalDigit(inputChar))
        {
            System.out.println("Das eingegebene Zeichen ist eine Hexadezimalziffer.");
            identified = true;
        }
        if (isBinaryDigit(inputChar))
        {
            System.out.println("Das eingegebene Zeichen ist eine Binärziffer.");
            identified = true;
        }
        if (isOctalDigit(inputChar))
        {
            System.out.println("Das eingegebene Zeichen ist eine Oktalziffer.");
            identified = true;
        }
        if (!identified)
        {
            System.out.println("Das eingegebene Zeichen konnte nicht identifiziert werden.");
        }
    }

    private static boolean isCapitalLetter(char c)
    {
        return (c >= 'A' && c <= 'Z');
    }

    private static boolean isHexadecimalDigit(char c)
    {
        return (c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f');
    }

    private static boolean isBinaryDigit(char c)
    {
        return (c == '0' || c == '1');
    }

    private static boolean isOctalDigit(char c)
    {
        return (c >= '0' && c <= '7');
    }
}