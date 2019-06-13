package epam.model.comparator;

import epam.model.entity.Stone;

import java.util.Comparator;

public class ComparatorOfWeight implements Comparator<Stone> {
    @Override
    public int compare(Stone o1, Stone o2) {
        return (int) (o1.getWeight() - o2.getWeight());
    }
}
