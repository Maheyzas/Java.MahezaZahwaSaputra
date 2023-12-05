import java.util.Scanner;

public class Programmer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Masukan nilai coding anda (0-100):");
        int nilaiCoding = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukan nilai interview anda (A/B/C/D): ");
        String nilaiInterview = scanner.nextLine();

        String hasilCoding = "";

    if (nilaiCoding > 80 && nilaiCoding <= 100) {
        hasilCoding = "LOLOS";
    } else if (nilaiCoding >= 60 && nilaiCoding <= 80) {
        hasilCoding = "DIPERTIMBANGKAN";
    } else {
        hasilCoding = "GAGAL";
    }

    String hasilInterview = "";

    if (nilaiInterview.equalsIgnoreCase("A") || nilaiInterview.equalsIgnoreCase("B")) {
        hasilInterview = "LOLOS";
    } else {
        hasilInterview = "GAGAL";
    }

    if ((hasilCoding.equals("LOLOS") || hasilCoding.equals("DIPERTIMBANGKAN")) && hasilInterview.equals("LOLOS")) {
        System.out.println("Selamat Kamu Berhasil Menjadi Calon Programmer");
    } else {
        System.out.println("Maaf Kamu Belum Berhasil Menjadi Calon Programmer");
    }
        scanner.close();
    }
}
