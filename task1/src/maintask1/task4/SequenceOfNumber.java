package maintask1.task4;

public class SequenceOfNumber {
    private static boolean check(int n) {
        return n / 1000 > 0;
    }

    public static boolean checksForIncreasing(int n) {
        boolean result = false;
        if (check(n)) {
            result = n / 1000 < n / 100 % 10 && n / 100 % 10 < n / 10 % 10 && n / 10 % 10 < n % 10;
        }
        return result;
    }
}
