package task4;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input a and b:");
        int a = readInt();
        int b = readInt();
        System.out.println("Friendly numbers:");
        System.out.println("Count friendly numbers = " + FriendlyNumbers.countFriendlyNumbers(a, b));
    }
}
