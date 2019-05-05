package maintask1.task7;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Input number:");
        a = readInt();
        b = readInt();
        System.out.printf("a = %d  b = %d\n", a, b);
        a += b;
        b = a - b;
        a = a - b;
        System.out.printf("a = %d  b = %d\n", a, b);
    }
}
