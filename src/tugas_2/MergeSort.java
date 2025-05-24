package tugas_2;
public class MergeSort {
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1; //3
        int n2 = right - mid; // 2

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = array[left + i];
        for (int j = 0; j < n2; ++j) R[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            array[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }

    public static void main(String[] args) {
        int nilai1 = 5;
        int nilai2 = 2;
        int nilai3= 8;
        int nilai4 = 9;
        int nilai5 = -50;
        int nilai6 = 78;
        int[] data = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};
        
        mergeSort(data, 0, data.length - 1);
        
        System.out.println("Hasil Merge Sort:");
        for (int num : data) System.out.print(num + " ");
    }
}
