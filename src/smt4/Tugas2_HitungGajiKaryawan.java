package smt4;
import java.util.Scanner;

public class Tugas2_HitungGajiKaryawan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Deklarasi Variabel
        String golongan;
        int jamLembur;
        double gajiPokok = 0.0;
        double persenLembur = 0.0;
        double gajiLembur;
        double totalPenghasilan;

        // --- INPUT DATA ---
        System.out.println("=== Program Hitung Gaji Karyawan ===");
        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = scanner.nextLine().toUpperCase();
        
        System.out.print("Masukkan Jumlah Jam Lembur (Jam): ");
        jamLembur = scanner.nextInt();
        
        scanner.close(); // Menutup objek Scanner
        
        // --- PROSES 1: Menentukan Gaji Pokok (Menggunakan Statement IF Bersarang) ---
        
        // Menggunakan IF-ELSE IF untuk menentukan Gaji Pokok berdasarkan Golongan
        if (golongan.equals("A")) {
            gajiPokok = 5000000.0;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000.0;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000.0;
        } else {
            System.out.println("\n[ERROR] Golongan karyawan tidak valid. Program dihentikan.");
            return; // Menghentikan eksekusi jika input golongan salah
        }

        // --- PROSES 2: Menentukan Persentase Lembur (Menggunakan Statement IF Bersarang) ---

        // Menggunakan IF-ELSE IF untuk menentukan Persentase Lembur berdasarkan Jam Lembur
        if (jamLembur == 1) {
            persenLembur = 0.30; // 30%
        } else if (jamLembur == 2) {
            persenLembur = 0.32; // 32%
        } else if (jamLembur == 3) {
            persenLembur = 0.34; // 34%
        } else if (jamLembur == 4) {
            persenLembur = 0.36; // 36%
        } else if (jamLembur >= 5) {
            persenLembur = 0.38; // 38%
        } else {
            // Jika jam lembur 0 atau nilai negatif, persen lembur tetap 0.0
            persenLembur = 0.0; 
        }

        // --- PROSES 3: Perhitungan Gaji Total (Menggunakan Operator Aritmatika) ---
        
        // Operator Aritmatika (*) digunakan
        gajiLembur = gajiPokok * persenLembur; 
        
        // Operator Aritmatika (+) digunakan
        totalPenghasilan = gajiPokok + gajiLembur;

        // --- OUTPUT HASIL ---
        System.out.println("\n=====================================");
        System.out.println("Golongan Karyawan    : " + golongan);
        System.out.println("Gaji Pokok           : Rp. " + gajiPokok);
        System.out.println("Jam Lembur           : " + jamLembur + " Jam");
        System.out.println("Persentase Lembur    : " + (persenLembur * 100) + "%");
        System.out.println("-------------------------------------");
        System.out.printf("Total Gaji Lembur    : Rp. %.2f\n", gajiLembur);
        System.out.printf("TOTAL PENGHASILAN    : Rp. %.2f\n", totalPenghasilan);
        System.out.println("=====================================");
    }
}