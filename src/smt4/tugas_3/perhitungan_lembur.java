package smt4.tugas_3;
import java.util.Scanner;

public class perhitungan_lembur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Deklarasi dan Inisialisasi Array Gaji Pokok (sesuai urutan A, B, C)
        // Indeks 0 = Golongan A (5.000.000)
        // Indeks 1 = Golongan B (6.500.000)
        // Indeks 2 = Golongan C (9.500.000)
        double[] gajiPokokArray = {5000000.0, 6500000.0, 9500000.0};
        
        // 2. Deklarasi dan Inisialisasi Array Persen Lembur (dalam bentuk desimal)
        // Indeks 0 = 30% (untuk 1 Jam Lembur)
        // Indeks 1 = 32% (untuk 2 Jam Lembur)
        // Indeks 2 = 34% (untuk 3 Jam Lembur)
        // Indeks 3 = 36% (untuk 4 Jam Lembur)
        // Indeks 4 = 38% (untuk >= 5 Jam Lembur)
        double[] persenLemburArray = {0.30, 0.32, 0.34, 0.36, 0.38};

        // Deklarasi Variabel untuk Input dan Hasil
        String golongan;
        int jamLembur;
        double gajiPokok;
        double persenLembur;
        double gajiLembur;
        double totalPenghasilan;
        int indeksGolongan = -1; // Default index

        // --- INPUT DATA ---
        System.out.println("=== Program Hitung Gaji Karyawan (dengan Array) ===");
        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        golongan = scanner.nextLine().toUpperCase();
        
        System.out.print("Masukkan Jumlah Jam Lembur (Jam): ");
        jamLembur = scanner.nextInt();
        
        scanner.close(); 
        
        // --- PROSES 1: Menentukan Indeks Golongan dan Gaji Pokok (Menggunakan IF-ELSE IF) ---
        
        if (golongan.equals("A")) {
            indeksGolongan = 0;
        } else if (golongan.equals("B")) {
            indeksGolongan = 1;
        } else if (golongan.equals("C")) {
            indeksGolongan = 2;
        } else {
            System.out.println("\n[ERROR] Golongan karyawan tidak valid. Program dihentikan.");
            return;
        }

        // Ambil Gaji Pokok dari Array
        gajiPokok = gajiPokokArray[indeksGolongan];

        // --- PROSES 2: Menentukan Persentase Lembur dari Array ---

        // Menggunakan IF-ELSE IF dan Operator Pembanding untuk menentukan indeks Array Lembur
        if (jamLembur == 1) {
            persenLembur = persenLemburArray[0]; // 30%
        } else if (jamLembur == 2) {
            persenLembur = persenLemburArray[1]; // 32%
        } else if (jamLembur == 3) {
            persenLembur = persenLemburArray[2]; // 34%
        } else if (jamLembur == 4) {
            persenLembur = persenLemburArray[3]; // 36%
        } else if (jamLembur >= 5) { // Menggunakan Operator Relasional (>=)
            persenLembur = persenLemburArray[4]; // 38%
        } else { // Jika jam lembur 0 atau nilai negatif
            persenLembur = 0.0;
        }

        // --- PROSES 3: Perhitungan Gaji Total (Menggunakan Operator Aritmatika) ---
        
        // Operator Aritmatika (*)
        gajiLembur = gajiPokok * persenLembur; 
        
        // Operator Aritmatika (+)
        totalPenghasilan = gajiPokok + gajiLembur;

        // --- OUTPUT HASIL ---
        System.out.println("\n=====================================");
        System.out.println("Golongan Karyawan    : " + golongan);
        System.out.printf("Gaji Pokok           : Rp. %.2f\n", gajiPokok);
        System.out.println("Jam Lembur           : " + jamLembur + " Jam");
        System.out.println("Persentase Lembur    : " + (persenLembur * 100) + "%");
        System.out.println("-------------------------------------");
        System.out.printf("Total Gaji Lembur    : Rp. %.2f\n", gajiLembur);
        System.out.printf("TOTAL PENGHASILAN    : Rp. %.2f\n", totalPenghasilan);
        System.out.println("=====================================");
    }    
}


