package epam.view.menu;

import epam.model.Necklace;
import epam.model.logic.Manager;
import epam.view.Printer;

public class NecklaceCost extends MenuEntry {
    public NecklaceCost(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        Printer.execute("Cost of necklace:");
        Printer.execute(Manager.calculateCost(necklace));
    }
}
