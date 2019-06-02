package epam.view.menu;

import epam.model.Necklace;
import epam.view.Printer;

public class NecklaceToPrint extends MenuEntry {
    public NecklaceToPrint(String title){
        super(title);
    }
    @Override
    public void run(Necklace necklace) {
        Printer.execute(necklace);
    }
}
