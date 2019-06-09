package epam.model.entity;

public class Matrix {
    private static final int DEFAULT_SIZE = 5;
    private int[][] array;
    private int rows;
    private int columns;

    public Matrix() {
        array = new int[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    public Matrix(int rows, int columns) {
        if (rows > 0 && columns > 0) {
            array = new int[rows][columns];
            this.rows = rows;
            this.columns = columns;
        }
    }

    public Matrix(int size) {
        this(size, size);
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getElement(int i, int j) {
        return array[i][j];
    }

    public void setElement(int i, int j, int element) {
        array[i][j] = element;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                builder.append(array[i][j]).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}