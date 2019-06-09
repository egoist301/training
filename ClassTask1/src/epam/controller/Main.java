package epam.controller;

import epam.model.entity.Matrix;
import epam.model.logic.Manager;
import epam.util.Creator;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(6, 6);
        Creator.initialize(matrix);
        System.out.println("Исходная матрица:");
        System.out.println(matrix);

        System.out.println("Число элементов массива, имеющих чётные порядковые номера и являющихся нечётными числами = "
                + Manager.getCountElement(matrix));
    }
}
