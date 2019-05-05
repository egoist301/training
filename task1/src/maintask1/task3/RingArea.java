package maintask1.task3;

public class RingArea {
    private static boolean check(int r1, int r2) {
        return r1 > r2;
    }

    public static double area(int r1, int r2){
        double result = 0;
        if(check(r1, r2)){
            result = Math.PI * (Math.pow(r1,2) - Math.pow(r2, 2));
        }
        return result;
    }
}
