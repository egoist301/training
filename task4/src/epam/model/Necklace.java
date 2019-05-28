package epam.model;

import epam.model.entity.NullStone;
import epam.model.entity.Stone;

import java.util.*;

public class Necklace implements Iterable<Stone> {
    private List<Stone> necklace;
    private int modCount;

    public Necklace() {
        necklace = new ArrayList<>();
    }

    public Necklace(List<Stone> necklace) {
        this.necklace = new ArrayList<>(necklace);
    }

    public Necklace(Necklace necklace) {
        this.necklace = new ArrayList<>(necklace.necklace);
    }

    public void add(Stone stone) {
        if (stone != null) {
            modCount++;
            necklace.add(stone);
        }
    }

    public void addAll(Collection<? extends Stone> necklace) {
        if (necklace != null) {
            modCount++;
            this.necklace.addAll(necklace);
        }
    }

    public void removeAll() {
        int size = size();
        for (int i = size - 1; i >= 0; i--) {
            remove(i);
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < necklace.size()) {
            modCount++;
            necklace.remove(index);
        }
    }

    public void remove(Stone stone) {
        if (stone != null) {
            modCount++;
            necklace.remove(stone);
        }
    }

    public int size() {
        return necklace.size();
    }

    public Stone get(int index) {
        if (index >= 0 && index < necklace.size()) {
            return necklace.get(index);
        } else {
            return new NullStone();
        }
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "necklace=" + necklace +
                '}';
    }

    @Override
    public Iterator<Stone> iterator() {
        return new Iterator<Stone>() {
            int index;
            int expectedModCount = modCount;
            int lastRet = -1;

            @Override
            public boolean hasNext() {
                return index != size();
            }

            @Override
            public Stone next() {
                checkForComodification();
                int i = index;
                if (i >= size())
                    throw new ConcurrentModificationException();
                index = i + 1;
                return necklace.get(lastRet = i);
            }

            @Override
            public void remove() {
                if (lastRet < 0)
                    throw new IllegalStateException();
                checkForComodification();

                try {
                    Necklace.this.remove(lastRet);
                    index = lastRet;
                    lastRet = -1;
                    expectedModCount = modCount;
                } catch (IndexOutOfBoundsException ex) {
                    throw new ConcurrentModificationException();
                }
            }

            final void checkForComodification() {
                if (modCount != expectedModCount)
                    throw new ConcurrentModificationException();
            }
        };
    }
}
