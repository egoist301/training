package epam.model.logic;

import epam.model.Necklace;
import epam.model.entity.*;

import java.util.ArrayList;
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

    public static List<Stone> searchByTransparency(Necklace necklace, double start, double end) {
        List<Stone> list = new ArrayList<>();
        for (Stone stone : necklace) {
            if (stone.getTransparency() >= start && stone.getTransparency() <= end) {
                list.add(stone);
            }
        }
        return list;
    }

    public static void quickSort(Necklace necklace){

        doSort(necklace, 0, necklace.size() - 1);
    }

    private static void doSort(Necklace necklace, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (necklace.get(i).getPrice() <= necklace.get(cur).getPrice())) {
                i++;
            }
            while (j > cur && (necklace.get(cur).getPrice() <= necklace.get(j).getPrice())) {
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
        doSort(necklace, start, cur);
        doSort(necklace, cur+1, end);
    }

}
