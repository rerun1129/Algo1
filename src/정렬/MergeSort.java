package 정렬;

public class MergeSort {


    public static void main(String[] args) {


        int[] arr = {5, 2, 4, 7, 1, 3, 2, 6};


        mergeSort(arr, 0, 7);

        for (int j : arr) {

            System.out.print(j + " ");
        }

    }


    public static void mergeSort(int[] data, int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(data, p, q);
            mergeSort(data, q + 1, r);
            merge(data, p, q, r);

        }
    }


    static void merge(int[] data, int p, int q, int r) {
        int i = p, j = q + 1, k = p;

        int[] tmp = new int[data.length];
        while (i <= q && j <= r) {
            if (data[i] <= data[j]) {
                tmp[k++] = data[i++];
            } else {
                tmp[k++] = data[j++];
            }
        }
        while (i <= q) {
            tmp[k++] = data[i++];
        }
        while (j <= r) {
            tmp[k++] = data[j++];
        }
        for (i = p; i <= r; i++) {
            data[i] = tmp[i];
        }
    }
}
