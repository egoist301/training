package maintask2.task3;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        char symbol;
        symbol = readChar();
        System.out.println(CheckVowel.check1(symbol));
        System.out.println(CheckVowel.check2(symbol));
        System.out.println(CheckVowel.check3(symbol));
        System.out.println(CheckVowel.check4(symbol));

    }
}
