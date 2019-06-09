package epam.util;

import epam.model.entity.Matrix;

import java.util.Random;

public class Creator {
    private static final int DEFAULT_BORDER = 50;

    private Creator(){}

    public static void initialize(Matrix matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                int temp = random.nextInt(DEFAULT_BORDER);
                matrix.setElement(i, j, temp);
            }
        }
    }
}

