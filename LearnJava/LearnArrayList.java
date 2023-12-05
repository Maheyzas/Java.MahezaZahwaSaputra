package LearnJava;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LearnArrayList{
    public static void main(String[] args) {
        ArrayList<String> kota = new ArrayList<>();
        kota.add("Sukabumi");
        kota.add("Cianjur");
        kota.add("Bandung");
        kota.add("Garut");
        kota.add("Tasik");
        kota.add("Ciamis");
        kota.add("Banjar");

        HashMap<String, Integer> harga = new HashMap<>();
        harga.put("Sukabumi-Cianjur", 10000);
        harga.put("Cianjur-Bandung", 15000);
        harga.put("Bandung-Garut", 7500);
        harga.put("Garut-Tasik", 5000);
        harga.put("Tasik-Ciamis", 7500);
        harga.put("Ciamis-Banjar", 6000);

        try (Scanner input = new Scanner(System.in)){
            System.out.print("Masukkan kota keberangkatan: ");
            String kotaKeberangkatan = input.nextLine();

            System.out.print("Masukkan kota tujuan: ");
            String kotaTujuan = input.nextLine();

            if (!kota.contains(kotaKeberangkatan) || !kota.contains(kotaTujuan)) {
                System.out.println("Kota tidak valid!");
                return;
            }

            int indexKotaKeberangkatan = kota.indexOf(kotaKeberangkatan);
            int indexKotaTujuan = kota.indexOf(kotaTujuan);
            int totalHarga = 0;

            int step = indexKotaKeberangkatan < indexKotaTujuan ? 1 : -1;
            while (indexKotaKeberangkatan != indexKotaTujuan) {
                int indexNext = indexKotaKeberangkatan + step;
                String rute = kota.get(indexKotaKeberangkatan) + "-" + kota.get(indexNext);
                if (!harga.containsKey(rute)) {
                    rute = kota.get(indexNext) + "-" + kota.get(indexKotaKeberangkatan);
                }
                totalHarga += harga.get(rute);
                indexKotaKeberangkatan = indexNext;
            }

            System.out.print("Apakah penumpang TNI/POLRI? (ya/tidak): ");
            boolean isTniPolri = input.nextLine().equalsIgnoreCase("ya");

            if ((kotaKeberangkatan.equals("Sukabumi") && kotaTujuan.equals("Banjar")) || 
                (kotaKeberangkatan.equals("Banjar") && kotaTujuan.equals("Sukabumi"))) {
                totalHarga *= 0.95;
            }
            
            if (isTniPolri) {
                totalHarga *= 0.9; 
            }
            
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            System.out.println("Total tarif: Rp " + decimalFormat.format(totalHarga));

        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
}