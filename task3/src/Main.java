import entity.Matrix;
import logic.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        Creator.initialize(matrix);
        System.out.println("Generated matrix:");
        System.out.println(matrix);
        int[] mas = LocalExtremes.findLocalMaximum(matrix);
        execute(mas);
        TransposeMatrix.transpose(matrix);
        System.out.println(matrix);
    }
    private static void execute(int[] array){
        System.out.println(array[0] + " " + array[1]);
    }
}
