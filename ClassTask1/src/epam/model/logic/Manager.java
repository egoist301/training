package epam.model.logic;

import epam.model.entity.Matrix;

public class Manager {
    private Manager() {
    }

    public static int getCountElement(Matrix matrix) {
        int count = 0;
        for (int i = 1; i < matrix.getRows(); i += 2) {
            for (int j = 1; j < matrix.getColumns(); j += 2) {
                if (check(matrix, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean check(Matrix matrix, int i, int j) {//проверяет, что оба индекса нечётные, как и число
        return (i % 2 == 1)
                && (matrix.getElement(i, j) % 2 == 1)
                && (j % 2 == 1);
    }
}
