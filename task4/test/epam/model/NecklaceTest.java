package epam.model;

import epam.model.entity.Gemstone;
import epam.model.entity.OrganicStone;
import epam.model.entity.Stone;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NecklaceTest {

    @Test
    public void add() {
        Necklace necklace = new Necklace();

        necklace.addStone(new OrganicStone());
        necklace.addStone(new Gemstone());

        assertEquals(2, necklace.getStonesCount());
    }

    @Test
    public void addAll() {
        Necklace necklace = new Necklace();
        List<Stone> list = new ArrayList<>();

        list.add(new OrganicStone());
        list.add(new Gemstone());
        list.add(new Stone());

        necklace.addAll(list);
        assertEquals(3, necklace.getStonesCount());
    }

    @Test
    public void removeAll() {
        Necklace necklace = new Necklace();
        List<Stone> list = new ArrayList<>();

        list.add(new OrganicStone());
        list.add(new Gemstone());
        list.add(new Stone());

        necklace.addAll(list);
        necklace.removeAll();

        assertEquals(0, necklace.getStonesCount());
    }

    @Test
    public void remove() {
        Necklace necklace = new Necklace();

        necklace.addStone(new OrganicStone());
        necklace.addStone(new Gemstone());
        necklace.removeStone(1);

        assertEquals(1, necklace.getStonesCount());

    }

    @Test
    public void remove1() {
        Necklace necklace = new Necklace();

        necklace.addStone(new OrganicStone());
        necklace.addStone(new Gemstone());
        necklace.removeStone(new Gemstone());

        assertEquals(1, necklace.getStonesCount());

    }

    @Test
    public void size() {
        Necklace necklace = new Necklace();

        necklace.addStone(new OrganicStone());
        necklace.addStone(new Gemstone());
        assertEquals(2, necklace.getStonesCount());

    }

    @Test
    public void size1() {
        Necklace necklace = new Necklace();
        assertEquals(0, necklace.getStonesCount());
    }

    @Test
    public void get() {
        Necklace necklace = new Necklace();

        necklace.addStone(new OrganicStone());
        necklace.addStone(new Gemstone());
        assertEquals(new Gemstone(), necklace.getStone(1));

    }

    @Test
    public void set() {
        Necklace necklace = new Necklace();
        necklace.addStone(new OrganicStone());
        necklace.addStone(new OrganicStone());
        necklace.addStone(new OrganicStone());
        necklace.setStone(new Gemstone(), 2);
        assertEquals(new Gemstone(), necklace.getStone(2));
    }
}