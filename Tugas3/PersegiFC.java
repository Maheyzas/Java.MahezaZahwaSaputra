import java.util.Scanner;

public class PersegiFC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor punggung anda: ");
        int nomorPunggung = input.nextInt();

    if (nomorPunggung % 2 == 0) {

    if (nomorPunggung >= 50 && nomorPunggung <= 100) {
        System.out.println("Nomor punggung " + nomorPunggung +" Posisi anda 'Target attacker' dan anda cocok menjadi 'Captain team'.");
    }
     else {
        System.out.println("Nomor punggung " + nomorPunggung + " Posisi anda  'Target attacker' .");
    }
} 
    else if (nomorPunggung % 2 == 1) {
        System.out.println("Nomor punggung " + nomorPunggung + " Posisi anda adalah 'Defender'.");
    if (nomorPunggung > 90) {
        System.out.println("Nomor punggung " + nomorPunggung + " Posisi anda adalah 'Playmaker' .");
    }
    else if (nomorPunggung % 3 == 0 && nomorPunggung % 5 == 0) {
        System.out.println("Nomor punggung " + nomorPunggung + " Posisi anda adalah 'Kiper' .");
    }
} 
    else {
        System.out.println("Salah tim bang.");
}

        input.close();
    }
}