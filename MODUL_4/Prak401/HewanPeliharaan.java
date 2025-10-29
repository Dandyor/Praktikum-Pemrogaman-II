package Prak401;

public class HewanPeliharaan {
	private String nama;
	private String ras;
		
	public HewanPeliharaan(String n, String r) {
		this.nama = n;
		this.ras = r;
	}
	public String getNama(){
		return nama;
	}
	public void setNama(String Nama) {
		this.nama = Nama;
	}
	
	public String getRas(){
		return ras;
	}
	public void setRas(String Ras) {
		this.ras = Ras;
	}
	public void display() {
			System.out.println("Detail Hewan Peliharaan:");
			System.out.println("Nama hewan peliharaanku adalah: "+this.nama);
			System.out.println("Dengan ras: "+this.ras);
	}
		
	}

