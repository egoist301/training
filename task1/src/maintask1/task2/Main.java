package maintask1.task2;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input weight(kg):");
        int m;
        m = readInt();
        int gram = m * 1000;
        double ton = m/1000.0;
        int miligram = m * (int)Math.pow(10, 6);
        System.out.println("Gram = " + gram);
        System.out.println("Ton = " + ton);
        System.out.println("Miligram = " + miligram);
    }
}
