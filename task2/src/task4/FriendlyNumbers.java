package task4;

public class FriendlyNumbers {
    public static int sumDividers(int n) {
        int sum = 0;
        for (int dividers = 1; dividers <= n / 2; dividers++) {
            if (n % dividers == 0) {
                sum += dividers;
            }
        }
        return sum;
    }

    public static int countFriendlyNumbers(int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
            int temp = sumDividers(i);
            if (temp < b && sumDividers(temp) == i && temp != i) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}
