public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 6);
        Line line = new Line(point1, point2);
        System.out.println(line.getLength());
        System.out.println(line);
    }
}
