package maintask2.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input first point(x, y):");
        Point point1 = Initializer.execute();
        System.out.println("Input second point(x, y):");
        Point point2 = Initializer.execute();
        System.out.println("Input third point(x, y):");
        Point point3 = Initializer.execute();
        System.out.println(point1 + "\n" + point2 + "\n" + point3);
        System.out.println("This is a " + Triangle.check(point1, point2, point3));
    }
}
