package epam.controller;

import epam.model.Necklace;
import epam.util.FileWorker;
import epam.view.Printer;
import epam.view.menu.*;

public class App {
    public static void main(String[] args) {
        Printer.execute("Necklace\n");
        Menu menu = new Menu();
        Necklace necklace = FileWorker.createNecklace("src\\resources\\stones.txt");

        menu.addEntry(new NecklaceToPrint("Print"));
        menu.addEntry(new NecklaceSort("Sort"));
        menu.addEntry(new NecklaceFindStone("Find of transparency"));
        menu.addEntry(new NecklaceCost("Necklace cost"));
        menu.addEntry(new NecklaceWeight("Necklace weight"));

        menu.run(necklace);
    }
}
