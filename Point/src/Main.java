public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2, 2);
        Point point2 = new Point(5, -2);
        Line line = new Line(point1, point2);
        System.out.println(line.getLength());
        System.out.println(line);
    }
}
