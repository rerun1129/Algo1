package Practice;


public class Code01 {
    public static void main(String[] args) {

        int [] data1 = new int[3];
        data1[0] = 5;
        data1[1] = 4;
        data1[2] = 3;
        System.out.println(func(3,data1));
    }

    public static int func(int n, int [] data) {
        if(n == 0)
            return 0;
        else {

            return func(n-1,data) + data[n-1];
        }
    }
}
