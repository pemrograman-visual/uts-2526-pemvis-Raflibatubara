//12S25008Rafli-Batubara
//12S25051-Winni Sitinjak
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, mahasiswa;
        double[] nmahasiswa = new double[4];
        double max, min, nrata, total;

        total = 0;
        mahasiswa = Integer.parseInt(input.nextLine());
        for (i = 0; i <= 3; i++) {
            System.out.println("Masukkan nilai ke-" + i + 1 + ":");
            nmahasiswa[i] = Double.parseDouble(input.nextLine());
            total = total + nmahasiswa[i];
        }
        nrata = total / 4;
        max = nmahasiswa[0];
        for (i = 1; i <= 3; i++) {
            if (nmahasiswa[i] > max) {
                max = nmahasiswa[i];
            }
        }
        min = nmahasiswa[0];
        for (i = 1; i <= 3; i++) {
            if (nmahasiswa[i] < min) {
                min = nmahasiswa[i];
            }
        }
        System.out.println("rata-rata:" + nrata);
        System.out.println("Tertinggi=" + max);
        System.out.println("Terendah=" + min);
    }
}
