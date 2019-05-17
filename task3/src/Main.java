import entity.Matrix;
import logic.*;
import util.Creator;

import static util.UserInput.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input count rows(N) and count columns(M):");
        int n = readInt();
        int m = readInt();
        if (n > 0 && m > 0) {
            Matrix matrix = new Matrix(n, m);
            Creator.initialize(matrix);
            System.out.println("Generated matrix(N*M):");
            System.out.println(matrix);
            System.out.println("Arithmetic mean = " + ArithmeticMeanAndGeometric.calculateArithmeticMean(matrix));
            System.out.println("Geometric mean = " + ArithmeticMeanAndGeometric.calculateGeometricMean(matrix));
            System.out.println("Minimum = " + Extremes.findMinimum(matrix));
            System.out.println("Maximum = " + Extremes.findMaximum(matrix));
            System.out.println("Local minimum indexes:");
            int[] mas = LocalExtremes.findLocalMinimum(matrix);
            execute(mas);
            mas = LocalExtremes.findLocalMaximum(matrix);
            System.out.println("Local maximum indexes:");
            execute(mas);
            System.out.println("Transpose matrix:");
            TransposeMatrix.transpose(matrix);
            System.out.println(matrix);
        }
    }

    private static void execute(int[] array) {
        System.out.println(array[0] + " " + array[1]);
    }
}
