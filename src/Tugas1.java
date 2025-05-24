import java.util.Arrays;
import java.util.LinkedList;

public class Tugas1 {
    public static void main(String[] args) throws Exception {
        // Soal 1. Deklarasi Variable integer
        int jumlahBaris;

        // Soal 2. Deklarasi Variable string
        String kalimatBaru = "Deklarasi tipe data String";
        System.out.println("Soal 2: " + kalimatBaru);
        System.out.println();

        // Soal 3. Deklarasi Dimensi dengan tipe data integer
        int[] empatAngka = { 07, 10, 20, 23 };
        System.out.println("Soal 3: " + Arrays.toString(empatAngka));
        System.out.println();

        // Soal 4. Deklarasi 2 Dimensi tipe data String
        String[][] alfabet = {
                { "p", "s", "n" },
                { "w", "l", "b" },
                { "f", "r", "e" },
        };
        System.out.println("Soal 4: ");
        for (int i = 0; i < alfabet.length; i++) {
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.print(alfabet[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Soal 5. Deklarasi Linked List
        LinkedList<String> listAngka = new LinkedList<>();
        listAngka.add("26");
        listAngka.add("08");
        listAngka.add("23");
        listAngka.add("24");
        listAngka.add("16");
        System.out.println("Soal 5: " + listAngka);
        
    }
}
