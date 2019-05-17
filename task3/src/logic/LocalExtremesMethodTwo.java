package logic;

import entity.Matrix;

public class LocalExtremesMethodTwo {
    public static int[] FindMin(Matrix myArr) {
        double min = myArr.getElement(0, 0);
        int[] indexes = {-1, -1};
        for (int i = 0; i < myArr.getCountRows(); i++) {
            for (int j = 0; j < myArr.getCountColumns(); j++) {
                if (FindLocalMin(myArr, i, j)) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }

    private static boolean FindLocalMin(Matrix array, int i, int j) {
        double min = array.getElement(i, j);
        int iStart = ((i - 1) >= 0) ? (i - 1) : 0;
        int iEnd = ((i + 1) < array.getCountRows() - 1) ? (i + 1) : array.getCountRows() - 1;
        int jStart = ((j - 1) >= 0) ? (j - 1) : 0;
        int jEnd = ((j + 1) < array.getCountColumns() - 1) ? (j + 1) : array.getCountColumns() - 1;

        for (i = iStart; i <= iEnd; i++) {
            for (j = jStart; j <= jEnd; j++) {
                if (array.getElement(i, j) < min) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] FindMax(Matrix myArr) {
        double min = myArr.getElement(0, 0);
        int[] indexes = {-1, -1};
        for (int i = 0; i < myArr.getCountRows(); i++) {
            for (int j = 0; j < myArr.getCountColumns(); j++) {
                if (FindLocalMax(myArr, i, j)) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }

    private static boolean FindLocalMax(Matrix array, int i, int j) {
        double max = array.getElement(i, j);
        int iStart = ((i - 1) >= 0) ? (i - 1) : 0;
        int iEnd = ((i + 1) < array.getCountRows() - 1) ? (i + 1) : array.getCountRows() - 1;
        int jStart = ((j - 1) >= 0) ? (j - 1) : 0;
        int jEnd = ((j + 1) < array.getCountColumns() - 1) ? (j + 1) : array.getCountColumns() - 1;

        for (i = iStart; i <= iEnd; i++) {
            for (j = jStart; j <= jEnd; j++) {
                if (array.getElement(i, j) > max) {
                    return false;
                }
            }
        }
        return true;
    }
}
