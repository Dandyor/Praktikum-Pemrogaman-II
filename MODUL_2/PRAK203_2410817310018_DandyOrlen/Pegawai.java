package PRAK203_2410817310018_DandyOrlen;

public class Pegawai { // <-- Kesalahan 1: Nama class harusnya Pegawai, bukan Employee

    // Perbaikan 1: Nama class diubah dari Employee menjadi Pegawai, 
    // agar sesuai dengan instansiasi objek 'new Pegawai()' 
    // public class Employee {
        
    public String nama;
    
    // Kesalahan 2: Tipe data 'asal' diisi dengan String ("Kingdom of Orvel"), 
    // tetapi di sini dideklarasikan sebagai char. Harus diubah menjadi String.
    // public char asal; 
    
    public String asal; 
    
    public String jabatan;
    
    public int umur;

    public String getNama() {
        return nama;
    }

    // Kesalahan 3: Tipe data return pada getAsal() adalah String, namun atribut 'asal' 
    // pada kode lama dideklarasikan sebagai char, yang menyebabkan potensi error atau
    // hasil tidak sesuai. Perbaikan ini sudah ditangani pada Kesalahan 2.
    public String getAsal() {
        return asal;
    }

    // Kesalahan 4: Method setJabatan() tidak memiliki parameter input yang diperlukan. 
    // dipanggil dengan p1.setJabatan("Assassin"). Parameter 'j' harus ditambahkan.
    // public void setJabatan() {
    
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}