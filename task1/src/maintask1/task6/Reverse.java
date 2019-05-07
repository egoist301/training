package maintask1.task6;

public class Reverse {
    public static int reverse(int n) {
        int result = 0;
        if (n / 1000000 > 0) {
            result = n % 10 * 1000000 + n / 10 % 10 * 100000 + n / 100 % 10 * 10000
                    + n / 1000 % 10 * 1000 + n / 10000 % 10 * 100 + n / 100000 % 10 * 10 + n / 1000000;
        }
        return result;
    }
}
