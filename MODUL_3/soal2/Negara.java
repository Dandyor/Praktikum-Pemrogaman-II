package soal2;

public class Negara {

    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private String tanggalKemerdekaan; 
    private String bulanKemerdekaan;
    private String tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, String tanggal, String bulan, String tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggal;
        this.bulanKemerdekaan = bulan;
        this.tahunKemerdekaan = tahun;
    }
    
    public String getNama() {
        return nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public String getTanggalKemerdekaan() {
        return tanggalKemerdekaan;
    }

    public String getBulanKemerdekaan() {
        return bulanKemerdekaan;
    }

    public String getTahunKemerdekaan() {
        return tahunKemerdekaan;
    }
}