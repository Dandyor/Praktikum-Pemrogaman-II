package PRAK201_2410817310018_DandyOrlen;

public class Buah {
		private String namaBuah;
	    private double beratSatuan;
	    private double hargaSatuan;
	    private double jumlahBeli;  
	    private final double DISKON_PERCENT = 0.02; 
	    private final double DISKON_PER_BERAT = 4.0; 

	    public Buah(String namaBuah, double beratSatuan, double hargaSatuan, double jumlahBeli) {
	        this.namaBuah = namaBuah;
	        this.beratSatuan = beratSatuan;
	        this.hargaSatuan = hargaSatuan;
	        this.jumlahBeli = jumlahBeli;
	    }

	    public double hitungHargaSebelumDiskon() {
	        double hargaPerKg = hargaSatuan / beratSatuan;
	        return hargaPerKg * jumlahBeli;
	    }

	    public double hitungTotalDiskon() {
	        int kelipatanDiskon = (int) (jumlahBeli / DISKON_PER_BERAT);

	        double totalDiskonPercent = kelipatanDiskon * DISKON_PERCENT;
	        double hargaSebelumDiskon = hitungHargaSebelumDiskon();
	        return hargaSebelumDiskon * totalDiskonPercent;
	    }

	    public double hitungHargaSetelahDiskon() {
	        double hargaSebelum = hitungHargaSebelumDiskon();
	        double totalDiskon = hitungTotalDiskon();
	        return hargaSebelum - totalDiskon;
	    }

	    public void tampilkanOutput() {
	        double hargaSebelumDiskon = hitungHargaSebelumDiskon();
	        double totalDiskon = hitungTotalDiskon();
	        double hargaSetelahDiskon = hitungHargaSetelahDiskon();

	        System.out.println("Nama Buah: " + namaBuah);
	        System.out.println("Berat: " + beratSatuan); 
	        System.out.println("Harga: " + hargaSatuan); 
	        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
	        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hargaSebelumDiskon));
	        System.out.println("Total Diskon: Rp" + String.format("%.2f", totalDiskon));
	        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hargaSetelahDiskon));
	        System.out.println();
	    }
	}
