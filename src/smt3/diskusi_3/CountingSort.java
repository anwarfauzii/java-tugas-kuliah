package smt3.diskusi_3;

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
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                array[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 8, 1, 3};
        countingSort(data);
        System.out.println("Hasil Counting Sort:");
        for (int num : data) System.out.print(num + " ");
    }
}

