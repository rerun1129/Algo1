package 정렬;

public class SelectionSort {

    public static void main(String[] args) {
        int[] A = new int[5];

        A[0] = 29;
        A[1] = 10;
        A[2] = 14;
        A[3] = 37;
        A[4] = 13;


        SS(A, A.length);

        for (int j : A) {
            System.out.print(j + " ");
        }
    }

    public static void SS(int[] A, int n) {

        int tmp = 0;
        int k = 0;

        for (int i = 0; i < n - 1; i++) {
            if (A[i] > A[i + 1]) {
                tmp = A[i];
                k = i;
            } else {
                tmp = A[i + 1];
                k = i + 1;
            }
            A[k] = A[n - 1];
            A[n - 1] = tmp;
            SS(A, n - 1);
        }
    }
}


