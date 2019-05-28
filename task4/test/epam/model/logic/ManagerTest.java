package epam.model.logic;

import epam.model.Necklace;
import epam.model.entity.*;
import org.junit.Test;

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
}