package maintask1.task5;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter six-digit number to find arithmetical mean and geometric mean:");
        int n;
        n = readInt();
        System.out.println(Calculate.arithmeticalMean(n));
        System.out.println(Calculate.geometricMean(n));
    }
}
