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
        Printer printer = Printer.getPrinter();
        printer.execute("Weight:");
        printer.execute(new Manager().calculateWeight(necklace));
    }
}
