package epam.view.menu;

import epam.model.Necklace;
import epam.model.logic.Manager;
import epam.view.Printer;

public class NecklaceWeight extends MenuEntry {
    public NecklaceWeight(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        Printer.execute("Weight:");
        Printer.execute(Manager.calculateWeight(necklace));
    }
}
