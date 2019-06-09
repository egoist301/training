package epam.controller;

import epam.model.Necklace;
import epam.util.FileWorker;
import epam.view.Printer;
import epam.view.menu.*;
import org.apache.log4j.Logger;

public class App {
    private static final Logger LOG = Logger.getLogger(App.class);
    public static void main(String[] args) {
        Printer.execute("Necklace\n");
        LOG.info("Start app.");
        Menu menu = new Menu();
        Necklace necklace = FileWorker.createNecklace("src\\resources\\stones.txt");

        menu.addEntry(new NecklaceToPrint("Print"));
        menu.addEntry(new FunctionMenu("Functional"));

        menu.run(necklace);
    }
}
