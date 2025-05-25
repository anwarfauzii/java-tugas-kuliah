package tugas_2;

public class CountingSort {
    public static void countingSort(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }

        int[] count = new int[max + 1];
        for (int num : array) {
            count[num]++;
        }

        int index = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i]-- > 0) {
                array[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int nilai1 = 8;
        int nilai2 = 18;
        int nilai3 = 2;
        int nilai4 = 19;
        int nilai5 = 11;
        int nilai6 = 19;
        int[] data = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};

        countingSort(data);
        
        System.out.println("Hasil Counting Sort:");
        for (int num : data) System.out.print(num + " ");
    }
}

