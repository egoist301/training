package logic;

import entity.Matrix;

public class TransposeMatrix {
    public static void transpose(Matrix matrix) {
        double temp;
        if (matrix.getCountColumns() == matrix.getCountRows()) {
            for (int i = 0; i < matrix.getCountRows(); i++) {
                for (int j = i; j < matrix.getCountColumns(); j++) {
                    temp = matrix.getElement(i, j);
                    matrix.setElement(i, j, matrix.getElement(j, i));
                    matrix.setElement(j, i, temp);
                }
            }
        }
    }
}
