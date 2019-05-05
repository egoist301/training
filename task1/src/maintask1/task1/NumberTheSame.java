package maintask1.task1;

public class NumberTheSame {
    private static boolean same(int a, int b, int c) {
        boolean result = false;
        if (a == b && a == c) {
            result = true;
        }
        return result;
    }

    public static String sameOrDifferent(int a, int b, int c) {
        String line;
        if (NumberTheSame.same(a, b, c)) {
            line = "same";
        } else if (a == b) {
            line = "a = b";
        } else if (a == c) {
            line = "a = c";
        } else if (b == c) {
            line = "b = c";
        } else {
            line = "different";
        }
        return line;
    }
}
