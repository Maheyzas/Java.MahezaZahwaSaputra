import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int input = scanner.nextInt();
        scanner.close();

        int angka = input + 1;
        while (true) {
            if (palindrome(angka)) {
                System.out.println("Angka palindrome terdekat : " + angka);
                break;
        } 
            angka++;
    }
}
    public static boolean palindrome(int num) {
        String angkaString = Integer.toString(num);
        String angkaTerbalik = new StringBuilder(angkaString).reverse().toString();
        return angkaString.equals(angkaTerbalik);
    }
}
   