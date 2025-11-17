package smt4.disc_5_aktiv_12;

public class contoh_array {

    public static void main(String[] args) {
        
        System.out.println("=== 1. Implementasi Array Berbagai Dimensi ===");
        
        // A. Array 1 Dimensi (Vektor)
        // Digunakan untuk menyimpan daftar elemen yang berurutan.
        int[] array1D = {10, 20, 30, 40, 50};
        System.out.println("\n[A] Array 1 Dimensi (array1D):");
        System.out.println("Elemen pada indeks ke-2: " + array1D[2]); // Output: 30
        
        // B. Array 2 Dimensi (Matriks)
        // Digunakan untuk merepresentasikan data dalam bentuk baris dan kolom.
        int[][] array2D = {
            {1, 2, 3}, // Baris 0
            {4, 5, 6}  // Baris 1
        };
        System.out.println("\n[B] Array 2 Dimensi (array2D):");
        // Mengakses elemen pada Baris 1, Kolom 0 (nilai 4)
        System.out.println("Elemen pada Baris 1, Kolom 0: " + array2D[1][0]); 
        
        // C. Array 3 Dimensi (Kubus/Kumpulan Matriks)
        // Digunakan untuk merepresentasikan data yang tersusun dalam lapisan/depth, baris, dan kolom.
        int[][][] array3D = {
            { // Lapisan 0
                {100, 101},
                {102, 103}
            },
            { // Lapisan 1
                {200, 201},
                {202, 203}
            }
        };
        System.out.println("\n[C] Array 3 Dimensi (array3D):");
        // Mengakses elemen pada Lapisan 1, Baris 0, Kolom 1 (nilai 201)
        System.out.println("Elemen pada Lapisan 1, Baris 0, Kolom 1: " + array3D[1][0][1]);
    }    
}
