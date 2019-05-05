package maintask1.task5;

public class Calculate {
    private Calculate() {
    }

    private static boolean checkThatTheSixDigit(int n) {
        return n / Math.pow(10, 5) > 0;
    }

    public static double arithmeticalMean(int n) {
        double result = 0;
        if (checkThatTheSixDigit(n)) {
            result = (n / 100000 + n / 10000 % 10 + n / 1000 % 10 + n / 100 % 10 + n / 10 % 10 + n % 10) / 6.0;
        }
        return result;
    }

    public static double geometricMean(int n) {
        double result = 0;
        double power = 1 / 6.0;

        if (checkThatTheSixDigit(n)) {
            result = Math.pow(((n / 100000) * (n / 10000 % 10) * (n / 1000 % 10) * (n / 100 % 10)
                    * (n / 10 % 10) * (n % 10)), power);

        }
        return result;
    }
}
