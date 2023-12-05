import java.util.Scanner;

public class Mafia {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nama anda : ");
        String nama =                          
         scanner.nextLine();
    System.out.print("Umur anda: ");
        int umur = scanner.nextInt();
        scanner.nextLine();
    System.out.print("Jenis kelamin (L/P): ");
        scanner.nextLine();
    System.out.print("Tempat tinggal anda: ");
        String tempatTinggal =                 
         scanner.nextLine();
    System.out.print("Uang tabungan anda dalam dollar: ");
        double uangTabungan =                  
         scanner.nextDouble();

   String pangkat = "";
    
    if (umur > 40 && (tempatTinggal.equalsIgnoreCase("Nevada") || tempatTinggal.equalsIgnoreCase("New York") || tempatTinggal.equalsIgnoreCase("Havana")) && uangTabungan > 10000000) {
            pangkat = "Don";
    } 
    else if (umur >= 25 && umur <= 40 && (tempatTinggal.equalsIgnoreCase("New Jersey") || tempatTinggal.equalsIgnoreCase("Manhattan") || tempatTinggal.equalsIgnoreCase("Nevada")) && uangTabungan >= 1000000 && uangTabungan <= 2000000) {
            pangkat = "Underboss";
    } 
    else if (umur >= 18 && umur <= 24 && (tempatTinggal.equalsIgnoreCase("California") || tempatTinggal.equalsIgnoreCase("Detroit") || tempatTinggal.equalsIgnoreCase("Boston")) && uangTabungan < 1000000) {
            pangkat = "Capo";
    }

    if (!pangkat.isEmpty()) {
            System.out.println(nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + pangkat + ".");
        } else {
            System.out.println(nama + " tidak mencurigakan.");
        }

        scanner.close();
    }
}

