package maintask1.task1;

public class NumberTheSame {

    public static String sameOrDifferent(int a, int b, int c) {
        String line;
        if (a == b && a == c) {
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
