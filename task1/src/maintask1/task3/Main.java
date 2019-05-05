package maintask1.task3;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        int r1;
        int r2;
        System.out.println("Input R1(R1>R2):");
        r1 = readInt();
        System.out.println("Input R2:");
        r2 = readInt();
        System.out.println("Ring area : " + RingArea.area(r1, r2));
    }
}
