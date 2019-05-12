package task3;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input number:");
        int n = readInt();

        System.out.println("Your number is perfect - " + PerfectNumber.isPerfect(n));

    }
}
