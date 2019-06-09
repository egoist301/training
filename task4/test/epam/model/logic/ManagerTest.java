package epam.model.logic;

import epam.model.Necklace;
import epam.model.entity.*;
import epam.util.FileWorker;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManagerTest {


    @Test
    public void calculateCost() {
        Necklace necklace = FileWorker.createNecklace("src\\resources\\stones.txt");

        assertEquals(327, Manager.calculateCost(necklace), 0.1);
    }

    @Test
    public void calculateWeight() {
        Necklace necklace = FileWorker.createNecklace("src\\resources\\stones.txt");
        assertEquals(255, Manager.calculateWeight(necklace), 0.1);
    }

    @Test
    public void quickSort() {
        Necklace necklace = new Necklace();
        necklace.add(new Gemstone("Diamond", 21, 21, 12, "Black", "Diamond"));
        necklace.add(new Stone("", 12, 12, 2, "Grey"));
        necklace.add(new OrganicStone("", 100, 100, 10, "Pink", 15));
        necklace.add(new Gemstone("Emerald", 50, 13, 21, "Green", "Beryl"));
        necklace.add(new Stone("", 61, 16, 17, "Yellow"));
        necklace.add(new OrganicStone("", 70, 80, 17, "Blue", 28));
        Necklace necklace1 = new Necklace();

        necklace1.add(new Stone("", 12, 12, 2, "Grey"));
        necklace1.add(new Gemstone("Diamond", 21, 21, 12, "Black", "Diamond"));
        necklace1.add(new Gemstone("Emerald", 50, 13, 21, "Green", "Beryl"));
        necklace1.add(new Stone("", 61, 16, 17, "Yellow"));
        necklace1.add(new OrganicStone("", 70, 80, 17, "Blue", 28));
        necklace1.add(new OrganicStone("", 100, 100, 10, "Pink", 15));

        Manager.quickSort(necklace, Stone.comparatorOfPrice.thenComparing(Stone.comparatorOfWeight));
        assertEquals(necklace1, necklace);
    }

    @Test
    public void searchByTransparency() {
        Necklace necklace = new Necklace();

        Gemstone diamond = new Gemstone("Diamond", 21, 21, 12, "Black", "Diamond");
        Stone amber = new Stone("", 12, 12, 2, "Grey");
        OrganicStone pearls = new OrganicStone("", 100, 100, 10, "Pink", 15);
        Gemstone emerald = new Gemstone("Emerald", 50, 13, 21, "Green", "Beryl");
        Stone sapphire = new Stone("", 61, 16, 17, "Yellow");
        Stone ruby = new OrganicStone("", 70, 80, 17, "Blue", 28);

        necklace.add(amber);
        necklace.add(diamond);
        necklace.add(emerald);
        necklace.add(pearls);
        necklace.add(ruby);
        necklace.add(sapphire);

        List<Stone> list = new ArrayList<>();

        list.add(amber);
        list.add(diamond);
        list.add(pearls);

        assertEquals(list, Manager.searchByTransparency(necklace, 1, 15));
    }
}