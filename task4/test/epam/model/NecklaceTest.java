package epam.model;

import epam.model.entity.Gemstone;
import epam.model.entity.NullStone;
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

        necklace.add(new OrganicStone());
        necklace.add(new Gemstone());

        assertEquals(2, necklace.size());
    }

    @Test
    public void addAll() {
        Necklace necklace = new Necklace();
        List<Stone> list = new ArrayList<>();

        list.add(new OrganicStone());
        list.add(new Gemstone());
        list.add(new Stone());

        necklace.addAll(list);
        assertEquals(3, necklace.size());
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

        assertEquals(0, necklace.size());
    }

    @Test
    public void remove() {
        Necklace necklace = new Necklace();

        necklace.add(new OrganicStone());
        necklace.add(new Gemstone());
        necklace.remove(1);

        assertEquals(1, necklace.size());

    }

    @Test
    public void remove1() {
        Necklace necklace = new Necklace();

        necklace.add(new OrganicStone());
        necklace.add(new Gemstone());
        necklace.remove(new Gemstone());

        assertEquals(1, necklace.size());

    }

    @Test
    public void size() {
        Necklace necklace = new Necklace();

        necklace.add(new OrganicStone());
        necklace.add(new Gemstone());
        assertEquals(2, necklace.size());

    }

    @Test
    public void size1() {
        Necklace necklace = new Necklace();
        assertEquals(0, necklace.size());
    }

    @Test
    public void get() {
        Necklace necklace = new Necklace();

        necklace.add(new OrganicStone());
        necklace.add(new Gemstone());
        assertEquals(new Gemstone(), necklace.get(1));

    }

    @Test
    public void get1() {
        Necklace necklace = new Necklace();
        necklace.add(new OrganicStone());
        necklace.add(new Gemstone());
        assertEquals(new NullStone(), necklace.get(2));
    }

    @Test
    public void set() {
        Necklace necklace = new Necklace();
        necklace.add(new OrganicStone());
        necklace.add(new OrganicStone());
        necklace.add(new OrganicStone());
        necklace.set(new Gemstone(), 2);
        assertEquals(new Gemstone(), necklace.get(2));
    }
}