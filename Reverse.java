import java.util.*;
/**
 * Reverse a String exercise
 */

public class Reverse {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String text = "";

        System.out.print("Please enter some text to reverse: ");

        try {
            text = read.nextLine();

        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.exit(0);

        }

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--)
            reverse += text.charAt(i);


        System.out.println("Backwards: " + reverse);

    }
}