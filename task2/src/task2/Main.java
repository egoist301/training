package task2;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input number:");
        int number = readInt();
        System.out.println("Your number: " + number + " is palindrom " + Calculate.isPalindrom(number));
        System.out.println("Your number: " + number + " is prime " + Calculate.isPrime(number));
        System.out.println("Your number: " + number + " have prime dividers:");
        Calculate.findPrimeDividers(number);
        System.out.println("\nYour number: " + number + " have different digits: "
                + Calculate.countOfDifferentDigits(number));
        System.out.println("Max digit of your number: " + Calculate.max(number));
        System.out.println("Input a and b:");
        int a = readInt();
        int b = readInt();
        System.out.println("Nod a and b = " + Calculate.nod(a, b) + "\nNok a and b = " + Calculate.nok(a, b));
    }
}
