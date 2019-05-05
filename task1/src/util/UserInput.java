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
}
