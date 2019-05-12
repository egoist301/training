package task3;

public class PerfectNumber {
    public static boolean isPerfect(int number) {
        boolean isPerfect = false;
        int sum = 0;

        for (int divider = 1; divider <= number / 2; divider++) {
            if (number % divider == 0) {
                sum += divider;
            }
        }
        if (sum == number || number == 1) {
            isPerfect = true;
        }
        return isPerfect;
    }
}
