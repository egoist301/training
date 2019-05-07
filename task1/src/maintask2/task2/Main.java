package maintask2.task2;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter dragon age:");
        int age;
        age = readInt();
        Dragon dragon = new Dragon(age);
        System.out.printf("Dragon heads %d, dragon eyes %d", dragon.dragonHeads(), dragon.dragonEyes());
    }
}
