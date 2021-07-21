package Practice;

public class Counting {

    private static final int n = 8;
    private static int[][] CCB = {
            {1, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 0, 0},
            {1, 1, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0, 0, 1},
            {0, 1, 1, 0, 0, 1, 1, 1}};

    private static final int bp = 0;
    private static final int ip = 1;
    private static final int cip = 2;
    private static int count;

    public static int blobCalc(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= n) {
            return 0;
        } else if (CCB[x][y] != ip) {
            return 0;
        } else {
            CCB[x][y] = cip;

            count += blobCalc(x, y + 1) + blobCalc(x - 1, y + 1) + blobCalc(x - 1, y) + blobCalc(x - 1, y - 1) +
                    blobCalc(x, y - 1) + blobCalc(x + 1, y - 1) + blobCalc(x + 1, y) + blobCalc(x + 1, y + 1);
            return 1;
        }
    }


    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(CCB[i][j] + "  ");
            }
        }
        System.out.println();
        blobCalc(0, 0);
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(CCB[i][j] + "  ");
            }
        }
        System.out.println(count);
    }
}


