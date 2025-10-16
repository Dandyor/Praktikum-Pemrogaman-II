package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>(); // Collection ArrayList (Ketentuan e)
    private static Scanner scanner = new Scanner(System.in);

    private static void tampilkanMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
        System.out.println("3. Cari Mahasiswa berdasarkan NIM");
        System.out.println("4. Tampilkan Daftar Mahasiswa");
        System.out.println("0. Keluar");
    }
    private static void tambahMahasiswa() {
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
        String nim = scanner.nextLine();
        
        if (cariMahasiswaByNim(nim) != null) {
            System.out.println("Error: Mahasiswa dengan NIM " + nim + " sudah terdaftar.");
            return;
        }

        Mahasiswa mhsBaru = new Mahasiswa(nama, nim);
        daftarMahasiswa.add(mhsBaru);
        System.out.println("Mahasiswa " + nama + " ditambahkan.");
    }
    private static void hapusMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Daftar Mahasiswa kosong. Tidak ada yang bisa dihapus.");
            return;
        }
        
        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
        String nimHapus = scanner.nextLine();
        
        Mahasiswa mhsDitemukan = cariMahasiswaByNim(nimHapus);
        
        if (mhsDitemukan != null) {
            daftarMahasiswa.remove(mhsDitemukan);
            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
        } else {
            System.out.println("Error: Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
        }
    }
    private static void cariMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Daftar Mahasiswa kosong. Tidak ada yang bisa dicari.");
            return;
        }
        
        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
        String nimCari = scanner.nextLine();
        
        Mahasiswa mhsDitemukan = cariMahasiswaByNim(nimCari);
        
        if (mhsDitemukan != null) {
            System.out.println("Mahasiswa Ditemukan:");
            System.out.println("NIM: " + mhsDitemukan.getNim() + ", Nama: " + mhsDitemukan.getNama());
        } else {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }
    private static Mahasiswa cariMahasiswaByNim(String nim) {
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;
    }
    private static void tampilkanSemuaMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Daftar Mahasiswa kosong.");
            return;
        }
        
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
        }
    }

    public static void main(String[] args) {
        int pilihan = -1;

        while (pilihan != 0) {
            tampilkanMenu();
            System.out.print("Pilihan: ");
            
            try {

                String inputPilihan = scanner.nextLine(); 
                pilihan = Integer.parseInt(inputPilihan);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka pilihan (0-4).");
                continue;
            }

            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    hapusMahasiswa();
                    break;
                case 3:
                    cariMahasiswa();
                    break;
                case 4:
                    tampilkanSemuaMahasiswa();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak ada. Silakan coba lagi.");
            }
            System.out.println();
        }

        scanner.close();
    }
}