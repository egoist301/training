package maintask2.task4;

public class NextDaySolver {
    public static String solve(Day date) {
        int day = date.getDay();
        int month = date.getMonth();
        int year = date.getYear();
        String line;
        if (day > 0 && day <= 31 && month >= 1 && month <= 12 && year >= 0) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (month == 2) {
                    day = ++day % 30;
                } else if (month % 2 == 0) {
                    day = ++day % 31;
                } else {
                    day = ++day % 32;
                }
            } else {
                if (month == 2) {
                    day = ++day % 29;
                } else if (month % 2 == 0) {
                    day = ++day % 31;
                } else {
                    day = ++day % 32;
                }
            }

            day = (day == 0 ? ++day : day);

            if (day == 1) {
                month = ++month % 12;
                month = (month == 0 ? ++month : month);

                if (month == 1) {
                    year++;
                }
            }
            line = new Day(day, month, year).toString();
        } else {
            line = "Incorrect date";
        }
        return line;
    }
}
