package maintask1.task4;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input number:");
        int n;
        n = readInt();
        System.out.println("This sequence is increasing " + SequenceOfNumber.checksForIncreasing(n));
    }
}
