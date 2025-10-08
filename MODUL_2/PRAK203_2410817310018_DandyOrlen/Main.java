package PRAK203_2410817310018_DandyOrlen;

public class Main {
	public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        
        // Kesalahan 5: Method getName() tidak ditemukan. Method yang benar adalah getNama() 
        // yang didefinisikan di class Pegawai.
        // System.out.println("Nama Pegawai: " + p1.getName());
        
        System.out.println("Nama: " + p1.getNama());

        System.out.println("Asal: " + p1.getAsal());
        
        // Kesalahan 6: Output yang diminta ("Jabatan: Assasin") tidak menggunakan method getter 
        // melainkan hanya mengakses atribut, sehingga tidak konsisten dengan pola getName()
        // dan getAsal(). Namun, untuk menyesuaikan output yang diminta, asumsikan 
        // format output untuk Jabatan diubah agar konsisten dengan output final.
        // Tetapi, karena di class Pegawai sudah ada atribut public String jabatan, 
        // maka pemanggilan p1.jabatan sudah benar jika ingin mengakses langsung.
        // Namun, untuk mencapai output yang diminta: "Jabatan: Assasin", 
        // hanya perlu memastikan format string outputnya benar.
        // Output aslinya sudah benar secara pemanggilan: System.out.println("Jabatan: " + p1.jabatan);
        
        System.out.println("Jabatan: " + p1.jabatan);
        
        // Kesalahan 7: Output yang diminta adalah "Umur: 17 tahun", 
        // namun pada kode ini tidak ada inisialisasi untuk p1.umur. perlu menambahkan 
        // inisialisasi nilai p1.umur = 17 sebelum pemanggilan output.
        // Penempatan inisialisasi seharusnya ada di atas baris ini.
        
        p1.umur = 17; // Perbaikan 7: Menambahkan inisialisasi atribut umur.
        
        System.out.println("Umur: " + p1.umur + " tahun"); // Perbaikan 8: Menambahkan string " tahun"
    }
}