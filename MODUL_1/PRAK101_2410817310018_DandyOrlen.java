package MODUL_1;
	import java.util.Scanner;
public class PRAK101_2410817310018_DandyOrlen {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempat = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        String beratStr = input.next();
        beratStr = beratStr.replace(",", "."); 
        double berat = Double.parseDouble(beratStr);

        String[] namaBulan = {
            "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.println();
        System.out.println("Output:");
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempat +
                " pada Tanggal " + tanggal + " " + namaBulan[bulan] + " " + tahun);
        System.out.printf("Tinggi Badan %d cm dan Berat Badan %.2f kilogram%n", tinggi, berat);

        input.close();
    }
}

