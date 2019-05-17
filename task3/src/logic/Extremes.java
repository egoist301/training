package logic;

import entity.Matrix;

public class Extremes {
    public static double findMinimum(Matrix matrix) {
        double minimum = -1;
        if (matrix != null) {
            minimum = matrix.getElement(0, 0);
            for (int i = 0; i < matrix.getCountRows(); i++) {
                for (int j = 0; j < matrix.getCountColumns(); j++) {
                    if (minimum > matrix.getElement(i, j)) {
                        minimum = matrix.getElement(i, j);
                    }
                }
            }
        }
        return minimum;
    }

    public static double findMaximum(Matrix matrix) {
        double maximum = -1;
        if (matrix != null) {
            for (int i = 0; i < matrix.getCountRows(); i++) {
                for (int j = 0; j < matrix.getCountColumns(); j++) {
                    if (maximum < matrix.getElement(i, j)) {
                        maximum = matrix.getElement(i, j);
                    }
                }
            }
        }
        return maximum;
    }
}
