import java.util.Scanner;

public class Palindrome {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan kata: ");
        String input = scanner.nextLine();
        scanner.close();

        String kata = input.replaceAll("\\s", "");
        String kataTerbalik = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            kataTerbalik += kata.charAt(i);
        }

        if (kata.equalsIgnoreCase(kataTerbalik)) {
            System.out.println(input + " adalah kata palindrome.");
        } else {
            System.out.println(input + " bukan kata palindrome.");
        }
    }
}
