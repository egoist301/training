package task2;

public class Calculate {
    //the second
    public static boolean isPalindrom(int number) {
        int copy = number;
        int temp = 0;
        while (number > 0) {
            temp = temp * 10 + number % 10;
            number /= 10;
        }
        return temp == copy;
    }

    //the fifth
    public static int nod(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    public static int nok(int a, int b) {
        return a * b / nod(a, b);
    }

    //the third
    public static boolean isPrime(int number) {
        boolean prime = true;
        for (int divider = 2; divider <= number / 2; divider++) {
            if (number % divider == 0) {
                prime = false;
            }
        }
        return prime;
    }

    //the first
    public static int maxDigitOfNumber(int number) {
        int max = number % 10;
        while ((number /= 10) % 10 != 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
        }
        return max;
    }

    //the fourth
    public static void findPrimeDividers(int number) {
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0 && isPrime(i)) {
                System.out.print("" + i + ", ");
            }
        }
    }

    //the sixth
    public static int countOfDifferentDigits(int number) {
        int count = 0;
        int temp;
        while (number > 0) {
            temp = number % 10;
            int copy = number / 10;
            while (copy > 0) {
                if (temp == copy % 10) {
                    count--;
                    break;
                }
                copy /= 10;
            }
            number /= 10;
            count++;
        }
        return count;
    }
}
