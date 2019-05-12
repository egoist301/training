package task3;

public class PerfectNumber {
    public static boolean isPerfect(int number) {
        boolean isPerfect = false;
        int sum = 0;
        if (number > 1) {

            for (int divider = 1; divider <= number / 2; divider++) {
                if (number % divider == 0) {
                    sum += divider;
                }
            }
        }
        if (sum == number) {
            isPerfect = true;
        }
        return isPerfect;
    }
}
