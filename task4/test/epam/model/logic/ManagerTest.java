package epam.model.logic;

import epam.model.Necklace;
import epam.model.comparator.ComparatorOfPrice;
import epam.model.comparator.ComparatorOfWeight;
import epam.model.entity.*;
import epam.util.FileWorker;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void calculateCost() {
        Manager manager = new Manager();
        Necklace necklace = FileWorker.createNecklaceFromFile("src\\resources\\stones.txt");

        assertEquals(327, manager.calculateCost(necklace), 0.1);
    }

    @Test
    public void calculateWeight() {
        Manager manager = new Manager();
        Necklace necklace = FileWorker.createNecklaceFromFile("src\\resources\\stones.txt");
        assertEquals(255, manager.calculateWeight(necklace), 0.1);
    }

    @Test
    public void quickSort() {
        Manager manager = new Manager();

        Necklace necklace = new Necklace();
        necklace.addStone(new Gemstone("Diamond", 21, 21, 12, "Black", "Diamond"));
        necklace.addStone(new Stone("", 12, 12, 2, "Grey"));
        necklace.addStone(new OrganicStone("", 100, 100, 10, "Pink", 15));
        necklace.addStone(new Gemstone("Emerald", 50, 13, 21, "Green", "Beryl"));
        necklace.addStone(new Stone("", 61, 16, 17, "Yellow"));
        necklace.addStone(new OrganicStone("", 70, 80, 17, "Blue", 28));
        Necklace necklace1 = new Necklace();

        necklace1.addStone(new Stone("", 12, 12, 2, "Grey"));
        necklace1.addStone(new Gemstone("Diamond", 21, 21, 12, "Black", "Diamond"));
        necklace1.addStone(new Gemstone("Emerald", 50, 13, 21, "Green", "Beryl"));
        necklace1.addStone(new Stone("", 61, 16, 17, "Yellow"));
        necklace1.addStone(new OrganicStone("", 70, 80, 17, "Blue", 28));
        necklace1.addStone(new OrganicStone("", 100, 100, 10, "Pink", 15));

        manager.quickSort(necklace, new ComparatorOfPrice().thenComparing(new ComparatorOfWeight()));
        assertEquals(necklace1, necklace);
    }

    @Test
    public void searchByTransparency() {
        Necklace necklace = new Necklace();
        Manager manager = new Manager();

        Gemstone diamond = new Gemstone("Diamond", 21, 21, 12, "Black", "Diamond");
        Stone amber = new Stone("", 12, 12, 2, "Grey");
        OrganicStone pearls = new OrganicStone("", 100, 100, 10, "Pink", 15);
        Gemstone emerald = new Gemstone("Emerald", 50, 13, 21, "Green", "Beryl");
        Stone sapphire = new Stone("", 61, 16, 17, "Yellow");
        Stone ruby = new OrganicStone("", 70, 80, 17, "Blue", 28);

        necklace.addStone(amber);
        necklace.addStone(diamond);
        necklace.addStone(emerald);
        necklace.addStone(pearls);
        necklace.addStone(ruby);
        necklace.addStone(sapphire);

        List<Stone> list = new ArrayList<>();

        list.add(amber);
        list.add(diamond);
        list.add(pearls);

        assertEquals(list, manager.searchByTransparency(necklace, 1, 15));
    }
}