package logic;

import entity.Matrix;

public class LocalExtremes {
    private static boolean isLocalMinimum(Matrix array, int x, int y) {
        boolean min = false;
        if (x > 0 && x < array.getCountRows() - 1 && y > 0 && y < array.getCountColumns() - 1) {
            min = upperLeftAngleToMinimum(array, x, y) && lowerLeftAngleToMinimum(array, x, y)
                    && lowerRightAngleToMinimum(array, x, y) && upperRightAngleToMinimum(array, x, y);
        }
        if (x == 0 && y == 0) {
            min = upperLeftAngleToMinimum(array, x, y);
        }
        if (x == array.getCountRows() - 1 && y == 0) {
            min = lowerLeftAngleToMinimum(array, x, y);
        }
        if (x == array.getCountRows() - 1 && y == array.getCountColumns() - 1) {
            min = lowerRightAngleToMinimum(array, x, y);
        }
        if (x == 0 && y == array.getCountColumns() - 1) {
            min = upperRightAngleToMinimum(array, x, y);
        }
        if (x == 0 && y > 0 && y < array.getCountColumns() - 1) {
            min = upperLeftAngleToMinimum(array, x, y) && upperRightAngleToMinimum(array, x, y);
        }
        if (y == 0 && x > 0 && x < array.getCountRows() - 1) {
            min = upperLeftAngleToMinimum(array, x, y) && lowerLeftAngleToMinimum(array, x, y);
        }
        if (x == array.getCountRows() - 1 && y > 0 && y < array.getCountColumns() - 1) {
            min = lowerLeftAngleToMinimum(array, x, y) && lowerRightAngleToMinimum(array, x, y);
        }
        if (y == array.getCountColumns() - 1 && x > 0 && x < array.getCountRows() - 1) {
            min = lowerRightAngleToMinimum(array, x, y) && upperRightAngleToMinimum(array, x, y);
        }
        return min;
    }

    private static boolean upperLeftAngleToMinimum(Matrix array, int x, int y) {
        boolean min = false;
        if (array.getElement(x, y) < array.getElement(x + 1, y)
                && array.getElement(x, y) < array.getElement(x + 1, y + 1)
                && array.getElement(x, y) < array.getElement(x, y + 1)) {
            min = true;
        }
        return min;
    }

    private static boolean lowerLeftAngleToMinimum(Matrix array, int x, int y) {
        boolean min = false;
        if (array.getElement(x, y) < array.getElement(x - 1, y)
                && array.getElement(x, y) < array.getElement(x - 1, y + 1)
                && array.getElement(x, y) < array.getElement(x, y + 1)) {
            min = true;
        }
        return min;
    }

    private static boolean lowerRightAngleToMinimum(Matrix array, int x, int y) {
        boolean min = false;
        if (array.getElement(x, y) < array.getElement(x - 1, y)
                && array.getElement(x, y) < array.getElement(x - 1, y - 1)
                && array.getElement(x, y) < array.getElement(x, y - 1)) {
            min = true;
        }
        return min;
    }

    private static boolean upperRightAngleToMinimum(Matrix array, int x, int y) {
        boolean min = false;
        if (array.getElement(x, y) < array.getElement(x + 1, y)
                && array.getElement(x, y) < array.getElement(x + 1, y - 1)
                && array.getElement(x, y) < array.getElement(x, y - 1)) {
            min = true;
        }
        return min;
    }

    public static int[] findLocalMinimum(Matrix matrix) {
        int[] indexes = {-1, -1};
        for (int i = 0; i < matrix.getCountRows(); i++) {
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                if (isLocalMinimum(matrix, i, j)) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }
    private static boolean isLocalMaximum(Matrix array, int x, int y) {
        boolean max = false;
        if (x > 0 && x < array.getCountRows() - 1 && y > 0 && y < array.getCountColumns() - 1) {
            max = upperLeftAngleToMaximum(array, x, y) && lowerLeftAngleToMaximum(array, x, y)
                    && lowerRightAngleToMaximum(array, x, y) && upperRightAngleToMaximum(array, x, y);
        }
        if (x == 0 && y == 0) {
            max = upperLeftAngleToMaximum(array, x, y);
        }
        if (x == array.getCountRows() - 1 && y == 0) {
            max = lowerLeftAngleToMaximum(array, x, y);
        }
        if (x == array.getCountRows() - 1 && y == array.getCountColumns() - 1) {
            max = lowerRightAngleToMaximum(array, x, y);
        }
        if (x == 0 && y == array.getCountColumns() - 1) {
            max = upperRightAngleToMaximum(array, x, y);
        }
        if (x == 0 && y > 0 && y < array.getCountColumns() - 1) {
            max = upperLeftAngleToMaximum(array, x, y) && upperRightAngleToMaximum(array, x, y);
        }
        if (y == 0 && x > 0 && x < array.getCountRows() - 1) {
            max = upperLeftAngleToMaximum(array, x, y) && lowerLeftAngleToMaximum(array, x, y);
        }
        if (x == array.getCountRows() - 1 && y > 0 && y < array.getCountColumns() - 1) {
            max = lowerLeftAngleToMaximum(array, x, y) && lowerRightAngleToMaximum(array, x, y);
        }
        if (y == array.getCountColumns() - 1 && x > 0 && x < array.getCountRows() - 1) {
            max = lowerRightAngleToMaximum(array, x, y) && upperRightAngleToMaximum(array, x, y);
        }
        return max;
    }

    private static boolean upperLeftAngleToMaximum(Matrix array, int x, int y) {
        boolean max = false;
        if (array.getElement(x, y) > array.getElement(x + 1, y)
                && array.getElement(x, y) > array.getElement(x + 1, y + 1)
                && array.getElement(x, y) > array.getElement(x, y + 1)) {
            max = true;
        }
        return max;
    }

    private static boolean lowerLeftAngleToMaximum(Matrix array, int x, int y) {
        boolean max = false;
        if (array.getElement(x, y) > array.getElement(x - 1, y)
                && array.getElement(x, y) > array.getElement(x - 1, y + 1)
                && array.getElement(x, y) > array.getElement(x, y + 1)) {
            max = true;
        }
        return max;
    }

    private static boolean lowerRightAngleToMaximum(Matrix array, int x, int y) {
        boolean max = false;
        if (array.getElement(x, y) > array.getElement(x - 1, y)
                && array.getElement(x, y) > array.getElement(x - 1, y - 1)
                && array.getElement(x, y) > array.getElement(x, y - 1)) {
            max = true;
        }
        return max;
    }

    private static boolean upperRightAngleToMaximum(Matrix array, int x, int y) {
        boolean max = false;
        if (array.getElement(x, y) > array.getElement(x + 1, y)
                && array.getElement(x, y) > array.getElement(x + 1, y - 1)
                && array.getElement(x, y) > array.getElement(x, y - 1)) {
            max = true;
        }
        return max;
    }

    public static int[] findLocalMaximum(Matrix matrix) {
        int[] indexes = {-1, -1};
        for (int i = 0; i < matrix.getCountRows(); i++) {
            for (int j = 0; j < matrix.getCountColumns(); j++) {
                if (isLocalMaximum(matrix, i, j)) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }
}
