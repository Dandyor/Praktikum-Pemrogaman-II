package MODUL_1;
import java.util.Scanner;

public class PRAK102_2410817310018_DandyOrlen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int awal = input.nextInt();

        int count = 0;
        int angka = awal;

        while (count < 10) {
            if (angka % 5 == 0) {
                System.out.print((angka / 5 - 1));
            } else {
                System.out.print(angka);
            }

            if (count < 9) {
                System.out.print(",");
            }

            angka++;
            count++;
        }

        input.close();
    }
}