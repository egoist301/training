package epam.model.comparator;

import epam.model.entity.Stone;

import java.util.Comparator;

public class ComparatorOfName implements Comparator<Stone> {
    @Override
    public int compare(Stone o1, Stone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
