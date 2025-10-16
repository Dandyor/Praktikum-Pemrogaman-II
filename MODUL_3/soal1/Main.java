package soal1;
import java.util.LinkedList; 
import java.util.Scanner; 
import java.util.InputMismatchException;

public class Main { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();
        int totalNilaiDaduKeseluruhan = 0;

        System.out.println("--- Program Simulasi Pelemparan Dadu ---");
        System.out.print("Masukkan banyaknya jumlah dadu: ");

        int jumlahDadu;
        try {
            jumlahDadu = scanner.nextInt();
            if (jumlahDadu <= 0) {
                System.out.println("Jumlah dadu harus lebih dari nol. Program dihentikan.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan angka bulat. Program dihentikan.");
            return;
        }
        
        for (int i = 0; i < jumlahDadu; i++) {
            
            Dadu daduBaru = new Dadu();
            daftarDadu.add(daduBaru);

            int nilaiDaduSaatIni = daduBaru.getNilai();
            totalNilaiDaduKeseluruhan += nilaiDaduSaatIni;
            
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiDaduSaatIni);
        }
        
        System.out.println("----------------------------------------");
        System.out.println("Total nilai dadu keseluruhan " + totalNilaiDaduKeseluruhan);

        scanner.close();
    }
}