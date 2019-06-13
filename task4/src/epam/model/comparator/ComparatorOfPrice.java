package epam.model.comparator;

import epam.model.entity.Stone;

import java.util.Comparator;

public class ComparatorOfPrice implements Comparator<Stone> {
    @Override
    public int compare(Stone o1, Stone o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
