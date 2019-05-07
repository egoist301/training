package maintask1.task4;

public class SequenceOfNumber {

    public static boolean checksForIncreasing(int n) {
        boolean result = false;
        if (n / 1000 > 0) {
            result = n / 1000 < n / 100 % 10 && n / 100 % 10 < n / 10 % 10 && n / 10 % 10 < n % 10;
        }
        return result;
    }
}
