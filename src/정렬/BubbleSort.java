package 정렬;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {29, 10, 14, 37, 13};

        BS(arr, 5);

        for (int j : arr) System.out.print(j + " ");

    }


    public static void BS(int[] arr, int n) {
        int tmp = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
            BS(arr, n - 1);
        }
    }
}
