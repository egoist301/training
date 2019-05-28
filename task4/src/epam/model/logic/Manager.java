package epam.model.logic;

import epam.model.Necklace;
import epam.model.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    public static double calculateCost(Necklace necklace) { //TODO add sort
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

}
