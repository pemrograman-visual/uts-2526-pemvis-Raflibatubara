//12S25008Rafli-Batubara
//12S25051-Winni Sitinjak
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a, b, temp, i, jumlah;

        n = Integer.parseInt(input.nextLine());
        a = 1;
        b = 1;
        jumlah = 0;
        for (i = 1; i <= n; i++) {
            jumlah = jumlah + a;
            temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(jumlah);
    }
}
