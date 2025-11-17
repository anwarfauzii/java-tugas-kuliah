package smt4.disc_5_aktiv_12;

public class contoh_method {

    // 1. Membuat Method dengan Pengembalian Nilai (Tipe data pengembalian: double)
    // Method ini menerima dua parameter: harga (double) dan diskonPersen (double).
    public static double hitungHargaAkhir(double hargaAwal, double diskonPersen) {
        
        // Proses: Menghitung jumlah diskon (Menggunakan Operator Aritmatika)
        double jumlahDiskon = hargaAwal * (diskonPersen / 100);
        
        // Proses: Menghitung harga akhir
        double hargaAkhir = hargaAwal - jumlahDiskon;
        
        // 2. Mengembalikan Nilai Proses Method (Return)
        // Nilai 'hargaAkhir' dikembalikan ke kode yang memanggil method ini.
        return hargaAkhir;
    }

    public static void main(String[] args) {
        
        System.out.println("\n=== 2. Implementasi Method dengan Pengembalian Nilai ===");

        double hargaProduk = 500000.0;
        double diskon = 15.0;
        
        System.out.println("Harga Awal Produk: Rp. " + hargaProduk);
        System.out.println("Persentase Diskon: " + diskon + "%");
        
        // 3. Memanggil Method dan Menyimpan Nilai yang Dikembalikan
        // Variabel 'hasilAkhir' menangkap nilai (double) yang di-return dari method.
        double hasilAkhir = hitungHargaAkhir(hargaProduk, diskon);
        
        // Menampilkan hasil
        System.out.println("-------------------------------------------------");
        System.out.printf("Harga Akhir setelah diskon: Rp. %.2f\n", hasilAkhir);
        
    }    
}
