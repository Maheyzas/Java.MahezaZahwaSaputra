import java.util.Scanner;

public class Pendakian {
    public static void main(String[] args) {
        String map[][] = {
                { "P", "X", "X", "X", "X", "X", "X", "X", "X", "G", "G", "G" },
                { "G", "X", "G", "G", "G", "X", "X", "P3", "X", "G", "X", "G" },
                { "G", "X", "X", "X", "G", "P4", "G", "G", "G", "G", "X", "G" },
                { "G", "TC", "G", "G", "G", "X", "G", "G", "X", "X", "X", "G" },
                { "G", "G", "X", "G", "G", "X", "P2", "X", "X", "X", "X", "G" },
                { "P5", "G", "X", "RK", "G", "X", "G", "G", "G", "G", "G", "P1" },
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Tenaga : ");
        int energy = input.nextInt();

        input.nextLine();

        System.out.print("Jalur : ");
        String track = input.nextLine();

        int row = 5;
        int colom = 11;

        input.close();

        for (int i = 0; i < track.length(); i++) {
            char movement = track.charAt(i);
            energy--;

            /* L=LEFT R=RIGHT U=UP D=DOWN S=SIT */

            if (movement == 'L' && colom > 0) {
                colom--;
            } else if (movement == 'R' && colom < map[0].length - 1) {
                colom++;
            } else if (movement == 'U' && row > 0) {
                row--;
            } else if (movement == 'D' && row < map.length - 1) {
                row++;
            } else if (movement == 'S') {

                String post = map[row][colom];
                if (post.equals("P2") ||
                        post.equals("P3") ||
                        post.equals("P4") ||
                        post.equals("P5") ||
                        post.equals("RK") ||
                        post.equals("TC")) {
                    energy += 10;
                } else {
                    System.out.println("Anda tidak dapat istirahat di sini, istirahat lah di pos yg tersedia");
                    return;
                }
            } else {
                System.out.println("INPUT YG ANDA MASUKAN SALAH, YG BENAR ADALAH L, R, U, D, S.");
                return;
            }

            if (energy <= 0) {
                System.out.println(
                        "Jalu anda sudah tepat tetapi anda kehabisan tenaga, mengapa tidak coba istirahat di pos yg tersedia");
                return;
            } else if (map[row][colom].equals("X")) {
                System.out.println("ANDA SALAH JALUR!! ANDA AKAN MASUK KE JURANG");
                return;
            } else if (map[row][colom].equals("P")) {
                System.out.println(
                        "SELAMATT ANDA SUDAH SAMPAI DI TUJUAN YAITU PUNCAK MAHAMERU, DAN SISA TENAGA ANDA " + energy);
                return;
            }
        }
    }
}
