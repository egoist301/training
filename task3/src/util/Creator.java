package util;

import entity.Matrix;

import java.util.Random;

public class Creator {
    private static final int DEFAULT_BORDER = 100;
    private static final double DEFAULT_ROUNDING = 100.0;

    public static void initialize(Matrix matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.getCountRows(); i++) {
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                double temp = random.nextDouble() + random.nextInt(DEFAULT_BORDER );
                matrix.setElement(i, j, Math.round(temp * DEFAULT_ROUNDING) / DEFAULT_ROUNDING);
            }
        }
    }
}
