package epam.model.logic;

import epam.model.Necklace;
import epam.model.entity.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void calculateCost() {
        Necklace necklace = new Necklace();
        necklace.add(new Amber(21, 21, 12));
        necklace.add(new Diamond(12, 12, 2));
        necklace.add(new Emerald(100, 100, 10));
        necklace.add(new Pearls(50,13,21));
        necklace.add(new Ruby(61,16,17));
        necklace.add(new Sapphire(70,80,17));
        assertEquals(314,Manager.calculateCost(necklace), 0.1);
    }

    @Test
    public void calculateWeight() {
        Necklace necklace = new Necklace();
        necklace.add(new Amber(21, 21, 12));
        necklace.add(new Diamond(12, 12, 2));
        necklace.add(new Emerald(100, 100, 10));
        necklace.add(new Pearls(50,13,21));
        necklace.add(new Ruby(61,16,17));
        necklace.add(new Sapphire(70,80,17));
        assertEquals(242,Manager.calculateWeight(necklace), 0.1);
    }

    @Test
    public void quickSort() {
        Necklace necklace = new Necklace();
        necklace.add(new Amber(21, 21, 12));
        necklace.add(new Diamond(12, 12, 2));
        necklace.add(new Emerald(100, 100, 10));
        necklace.add(new Pearls(50,13,21));
        necklace.add(new Ruby(61,16,17));
        necklace.add(new Sapphire(70,80,17));
        Necklace necklace1 = new Necklace();

        necklace1.add(new Diamond(12, 12, 2));
        necklace1.add(new Amber(21, 21, 12));

        necklace1.add(new Pearls(50,13,21));
        necklace1.add(new Ruby(61,16,17));
        necklace1.add(new Sapphire(70,80,17));
        necklace1.add(new Emerald(100, 100, 10));
        Manager.quickSort(necklace, Stone.stoneComparatorOfWeight);
        assertEquals(necklace1, necklace);
    }

    @Test
    public void searchByTransparency() {
        Necklace necklace = new Necklace();
        Stone amber = new Amber(21, 21, 12);
        Stone diamond = new Diamond(12, 12, 2);
        Stone emerald = new Emerald(100, 100, 10);
        Stone pearls = new Pearls(50,13,21);
        Stone ruby = new Ruby(61,16,17);
        Stone sapphire = new Sapphire(70,80,17);
        necklace.add(amber);
        necklace.add(diamond);
        necklace.add(emerald);
        necklace.add(pearls);
        necklace.add(ruby);
        necklace.add(sapphire);
        List<Stone> list = new ArrayList<>();
        list.add(amber);
        list.add(diamond);
        list.add(emerald);
        assertEquals(list, Manager.searchByTransparency(necklace, 1, 15));
    }
}