package maintask1.task1;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("Input numbers (a, b, c):");
        a = readInt();
        b = readInt();
        c = readInt();

        System.out.println("This numbers is " + NumberTheSame.sameOrDifferent(a, b, c));
    }
}
