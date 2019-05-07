package util;

import java.util.Scanner;

public class UserInput {
    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        int input;
        if(scanner.hasNextInt()){
            input = scanner.nextInt();
        }
        else {
            System.out.println("This is not number!");
            scanner.next();
            input = readInt();
        }
        return input;
    }
    public static char readChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input char: ");
        String input = scanner.next();
        char ch = input.charAt(0);
        if (input.length() > 1) {
            System.err.println("This is string, not char. Try again!");
            ch = readChar();
        }
        return ch;
    }
}
