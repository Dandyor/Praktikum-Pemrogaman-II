package PRAK202_2410817310018_DandyOrlen;

public class Kopi {
	public String namaKopi;
    public String ukuran;
    public int harga; // Diasumsikan harga adalah bilangan bulat (int)
    
    // Variabel private untuk menyimpan nama pembeli
    private String namaPembeli;
    
    // Konstanta Pajak 11%
    private final double PAJAK = 0.11; 

    // Constructor default (dibiarkan kosong, karena Soal2Main menginisialisasi atribut secara langsung)
    public Kopi() {
        // Bisa dikosongkan atau diisi inisialisasi default jika diperlukan
    }

    // 2. Method info()
    // Dipanggil oleh kopi1.info()
    public void info() {
        System.out.println("Nama Kopi: " + this.namaKopi);
        System.out.println("Ukuran: " + this.ukuran);
        System.out.println("Harga: " + this.harga);
    }
    
    // 3. Method Setter: setPembeli(String nama)
    // Dipanggil oleh kopi1.setPembeli("Alice")
    public void setPembeli(String nama) {
        this.namaPembeli = nama;
    }
    
    // 4. Method Getter: getPembeli()
    // Dipanggil oleh System.out.println("Pembeli Kopi: " + kopi1.getPembeli());
    public String getPembeli() {
        return this.namaPembeli;
    }
    
    // 5. Method Getter: getPajak()
    // Dipanggil oleh System.out.println("Pajak Kopi: Rp" + kopi1.getPajak());
    public int getPajak() {
        // Hitung pajak: 11% dari harga
        // Menggunakan Math.round untuk memastikan hasil pajak berupa bilangan bulat (int)
        double totalPajak = this.harga * PAJAK;
        return (int) Math.round(totalPajak); 
    }
}