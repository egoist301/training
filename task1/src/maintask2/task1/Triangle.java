package maintask2.task1;

public class Triangle {
    public static String check(Point point1, Point point2, Point point3) {
        String line;
        double a = calculateHypotenuse(point1, point2);
        double b = calculateHypotenuse(point2, point3);
        double c = calculateHypotenuse(point1, point3);
        if (a + b > c && a + c > b && c + b > a) {
            line = "triangle";
            if (a * a + b * b == c * c
                    || c * c + b * b == a * a
                    || a * a + c * c == b * b){
                line = "right triangle";
            }
        }
        else{
            line = "not a triangle";
        }
        return line;
    }

    private static double calculateHypotenuse(Point point1, Point point2) {
        return Math.pow(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2), 0.5);
    }
}
