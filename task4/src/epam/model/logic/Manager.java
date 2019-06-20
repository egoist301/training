package epam.model.logic;

import epam.model.Necklace;
import epam.model.entity.*;

import java.util.Comparator;

public class Manager {

    public Manager() {

    }

    public double calculateCost(Necklace necklace) {
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

    public double calculateWeight(Necklace necklace) {
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

    public Necklace searchByTransparency(Necklace necklace, double start, double end) {
        Necklace list = new Necklace();
        for (Stone stone : necklace) {
            if (stone.getTransparency() >= start && stone.getTransparency() <= end) {
                list.addStone(stone);
            }
        }
        return list;
    }

    public void quickSort(Necklace necklace, Comparator<Stone> comparator) {

        doSort(necklace, 0, necklace.getStonesCount() - 1, comparator);
    }

    private void doSort(Necklace necklace, int start, int end, Comparator<Stone> comparator) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (comparator.compare(necklace.getStone(i), necklace.getStone(cur)) <= 0)) {
                i++;
            }
            while (j > cur && (comparator.compare(necklace.getStone(cur), necklace.getStone(j)) <= 0)) {
                j--;
            }
            if (i < j) {
                Stone temp = necklace.getStone(i);
                necklace.setStone(necklace.getStone(j), i);
                necklace.setStone(temp, j);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(necklace, start, cur, comparator);
        doSort(necklace, cur + 1, end, comparator);
    }
}
