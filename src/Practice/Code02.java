package Practice;


public class Code02 {


    public static void main(String[] args) {
        Code02 p = new Code02();
        int[] data = new int[3];
        data[0] = 5;
        data[1] = 6;
        data[2] = 11;

        System.out.println(p.findMax(data, 0, 2));

    }

    int findMax(int[] data, int begin, int end) {
        if (begin == end)
            return data[begin];
        else {
            int middle = (begin + end) / 2;
            int max1 = findMax(data, begin, middle);
            int max2 = findMax(data, middle + 1, end);
            return Math.max(max1, max2);
        }
    }
}
