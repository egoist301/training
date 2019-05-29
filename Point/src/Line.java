public class Line extends Point {
    private double x2;
    private double y2;


    public Line(double x, double y, double x2, double y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(Point point, Point point2) {
        super(point);
        x2 = point2.getX();
        y2 = point2.getY();
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getLength() {
        return Math.pow(Math.pow(x2 - getX(), 2) + Math.pow(y2 - getY(), 2), 0.5);
    }

    @Override
    public String toString() {
        return "Line:\n" +
                "x1=" + getX() +
                ", y1=" + getY() +
                "\nx2=" + x2 +
                ", y2=" + y2 +
                "\nlength=" + getLength();
    }
}
