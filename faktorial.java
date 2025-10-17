//12S25008Rafli-Batubara
//12S25051-Winni Sitinjak
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bilangan, faktorial, i;

        System.out.println("masukkan bilangan");
        bilangan = Integer.parseInt(input.nextLine());
        faktorial = 1;
        i = 1;
        while (i <= bilangan) {
            faktorial = faktorial * i;
            i = i + 1;
        }
        System.out.println("Bilangan faktorial=" + faktorial);
    }
}
