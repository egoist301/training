package epam.model.logic;

import epam.model.Necklace;
import epam.model.entity.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager {
    public static double calculateCost(Necklace necklace) {
        if (necklace != null) {
            double sum = 0;
            for (Stone stone : necklace) {
                sum += stone.getPrice();
            }
            return sum;
        } else {
            return -1;
        }
    }

    public static double calculateWeight(Necklace necklace) {
        if (necklace != null) {
            double sum = 0;
            for (Stone stone : necklace) {
                sum += stone.getWeight();
            }
            return sum;
        } else {
            return -1;
        }
    }

    public static Necklace searchByTransparency(Necklace necklace, double start, double end) {
        Necklace list = new Necklace();
        for (Stone stone : necklace) {
            if (stone.getTransparency() >= start && stone.getTransparency() <= end) {
                list.add(stone);
            }
        }
        return list;
    }

    public static void quickSort(Necklace necklace, Comparator<Stone> comparator){

        doSort(necklace, 0, necklace.size() - 1, comparator);
    }

    private static void doSort(Necklace necklace, int start, int end, Comparator<Stone> comparator) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (comparator.compare(necklace.get(i),necklace.get(cur)) <= 0)) {
                i++;
            }
            while (j > cur && (comparator.compare(necklace.get(cur), necklace.get(j)) <= 0)) {
                j--;
            }
            if (i < j) {
                Stone temp = necklace.get(i);
                necklace.set(necklace.get(j), i);
                necklace.set(temp, j);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(necklace, start, cur, comparator);
        doSort(necklace, cur+1, end, comparator);
    }

}
