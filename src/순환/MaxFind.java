package 순환;

public class MaxFind {

    public static void main(String[] args) {

        MaxFind p = new MaxFind();

        int[]data = new int[5];
        data[0]= 5;
        data[1]= 6;
        data[2]= 11;
        data[3]= 18;
        data[4]= 3;

        System.out.println(p.findMax(data, 0, 4));
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
