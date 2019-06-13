package epam.model.comparator;

import epam.model.entity.Stone;

import java.util.Comparator;

public class ComparatorOfTransparency implements Comparator<Stone> {

    @Override
    public int compare(Stone o1, Stone o2) {
        return (int) (o1.getTransparency() - o2.getTransparency());
    }
}
