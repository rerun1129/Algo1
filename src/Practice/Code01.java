package Practice;

public class Code01 {
    public static void main(String[] args) {

        int result = func(4);
        System.out.println(result);
    }

    public static int func(int n) {
        if (n == 0)
            return 0;
        else {
           return n + func(n - 1);
        }
    }
}
