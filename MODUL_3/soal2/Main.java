package soal2;

import java.util.HashMap;
import java.util.LinkedList; 
import java.util.Map;
import java.util.Scanner;


public class Main {

    private static Map<Integer, String> buatHashMapBulan() {
        Map<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");
        return bulanMap;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();
        Map<Integer, String> bulanMap = buatHashMapBulan();

        System.out.println("--- Input Data Negara ---");

        int jumlahNegara;
        try {
            System.out.print("Masukkan banyaknya negara (N): ");
            jumlahNegara = Integer.parseInt(scanner.nextLine());
            if (jumlahNegara <= 0) {
                System.out.println("Jumlah negara harus lebih dari nol. Program dihentikan.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan angka bulat untuk jumlah negara. Program dihentikan.");
            return;
        }

        for (int i = 0; i < jumlahNegara; i++) {
            System.out.println("\n--- Data Negara ke-" + (i + 1) + " ---");
            
            System.out.print("Nama Negara: ");
            String nama = scanner.nextLine();

            System.out.print("Jenis Kepemimpinan (presiden/monarki/perdana menteri): ");
            String jenisKepemimpinan = scanner.nextLine().toLowerCase();
            
            System.out.print("Nama Pemimpin: ");
            String namaPemimpin = scanner.nextLine();
            
            String tanggalKemerdekaan = " ";
            String bulanKemerdekaanStr = " ";
            String tahunKemerdekaan = " ";

            if (!jenisKepemimpinan.equals("monarki")) {
                try {
                    System.out.print("Tanggal Kemerdekaan: ");
                    tanggalKemerdekaan = scanner.nextLine();

                    System.out.print("Bulan Kemerdekaan (Angka 1-12): ");
                    int bulanAngka = Integer.parseInt(scanner.nextLine());
                    
                    if (bulanMap.containsKey(bulanAngka)) {
                        bulanKemerdekaanStr = bulanMap.get(bulanAngka);
                    } else {
                        System.out.println("Peringatan: Angka bulan tidak valid, akan diisi dengan tanda tanya.");
                        bulanKemerdekaanStr = "?";
                    }

                    System.out.print("Tahun Kemerdekaan: ");
                    tahunKemerdekaan = scanner.nextLine();

                } catch (NumberFormatException e) {
                    System.out.println("Error: Input tanggal/bulan/tahun harus berupa angka. Program dihentikan.");
                    return;
                }
            }

            Negara negaraBaru = new Negara(nama, jenisKepemimpinan, namaPemimpin, 
                                            tanggalKemerdekaan, bulanKemerdekaanStr, tahunKemerdekaan);
            daftarNegara.add(negaraBaru);
        }

        System.out.println("\n==============================================");
        System.out.println("                  O U T P U T                 ");
        System.out.println("==============================================");

        for (Negara negara : daftarNegara) {
            if (negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Negara " + negara.getNama() + " mempunyai Raja bernama " + negara.getNamaPemimpin());
            } else if (negara.getJenisKepemimpinan().equals("presiden")) {
                System.out.println("Negara " + negara.getNama() + " mempunyai Presiden bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + negara.getBulanKemerdekaan() + " " + negara.getTahunKemerdekaan());
            } else if (negara.getJenisKepemimpinan().equals("perdana menteri")) {
                System.out.println("Negara " + negara.getNama() + " mempunyai Perdana Menteri bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + negara.getBulanKemerdekaan() + " " + negara.getTahunKemerdekaan());
            } else {
                 System.out.println("Negara " + negara.getNama() + " mempunyai Pemimpin (" + negara.getJenisKepemimpinan() + ") bernama " + negara.getNamaPemimpin());
                 if (!negara.getTanggalKemerdekaan().trim().isEmpty()) {
                      System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " + negara.getBulanKemerdekaan() + " " + negara.getTahunKemerdekaan());
                 }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}