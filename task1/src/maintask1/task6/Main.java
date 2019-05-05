package maintask1.task6;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input seven-digit number:");
        int n;
        n = readInt();
        System.out.println("Your number: " + n);
        System.out.println("Reverse number: " + Reverse.reverse(n));
    }
}
