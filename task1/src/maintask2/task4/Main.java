package maintask2.task4;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        int day, year, month;
        day = readInt();
        month = readInt();
        year = readInt();
        Day day1 = new Day(day, month, year);
        System.out.println(NextDaySolver.solve(day1));
    }
}
