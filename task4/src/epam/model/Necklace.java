package epam.model;

import epam.model.entity.Stone;

import java.util.*;

public class Necklace implements Iterable<Stone> {
    private List<Stone> necklace;
    private int modCount;

    public Necklace() {
        necklace = new ArrayList<>();
    }

    public Necklace(List<Stone> necklace) {
        this.necklace = necklace;
    }

    public void addStone(Stone stone) {
        modCount++;
        necklace.add(stone);
    }

    public void addAll(Collection<? extends Stone> necklace) {
        modCount++;
        this.necklace.addAll(necklace);
    }

    public void removeAll() {
        necklace.clear();
    }

    public void removeStone(int index) {
        modCount++;
        necklace.remove(index);
    }

    public void removeStone(Stone stone) {
        modCount++;
        necklace.remove(stone);
    }

    public int getStonesCount() {
        return necklace.size();
    }

    public Stone getStone(int index) {
        return necklace.get(index);

    }

    public void setStone(Stone stone, int index) {
        necklace.set(index, stone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Necklace)) return false;
        Necklace necklace1 = (Necklace) o;
        boolean result = true;
        if (necklace1.getStonesCount() == getStonesCount()) {
            for (int i = 0; i < getStonesCount(); i++) {
                result &= necklace1.getStone(i).equals(necklace.get(i));
            }
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(necklace);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Stone stone : necklace) {
            builder.append(stone + "\n");
        }
        return builder.toString();
    }

    @Override
    public Iterator<Stone> iterator() {
        return new Iterator<Stone>() {
            int index;
            int expectedModCount = modCount;
            int lastRet = -1;

            @Override
            public boolean hasNext() {
                return index != getStonesCount();
            }

            @Override
            public Stone next() {
                checkForComodification();
                int i = index;
                if (i >= getStonesCount())
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
                    Necklace.this.removeStone(lastRet);
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
