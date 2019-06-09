package epam.view.menu;

import epam.model.Necklace;

public class FunctionMenu extends MenuEntry {
    public FunctionMenu(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        Menu menu = new Menu();

        menu.addEntry(new NecklaceSort("Sort"));
        menu.addEntry(new NecklaceFindStone("Find of transparency"));
        menu.addEntry(new NecklaceCost("Necklace cost"));
        menu.addEntry(new NecklaceWeight("Necklace weight"));

        menu.run(necklace);
    }
}
