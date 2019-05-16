package logic;

import entity.Matrix;

public class ArithmeticMeanAndGeometric {
    public static double calculateArithmeticMean(Matrix matrix) {
        double arithmeticMean = 0;
        if (matrix != null) {
            arithmeticMean = calculateSum(matrix) / (matrix.getCountColumns() * matrix.getCountRows());
        }
        return arithmeticMean;
    }

    private static double calculateSum(Matrix matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.getCountRows(); i++) {
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                sum += matrix.getElement(i, j);
            }
        }
        return sum;
    }

    public static double calculateGeometricMean(Matrix matrix){
        double geometricMean = 0;
        if (matrix!=null){
            double pow = 1.0 / (matrix.getCountColumns() * matrix.getCountRows());
            geometricMean = Math.pow(calculateMultiple(matrix), pow);
        }
        return geometricMean;
    }

    private static double calculateMultiple(Matrix matrix){
        double multiple = 1;
        for (int i = 0; i < matrix.getCountRows(); i++) {
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                multiple *= matrix.getElement(i, j);
            }
        }
        return multiple;
    }
}
