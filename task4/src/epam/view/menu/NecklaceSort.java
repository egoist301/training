package epam.view.menu;

import epam.model.Necklace;
import epam.model.comparator.ComparatorOfName;
import epam.model.entity.Stone;
import epam.model.logic.Manager;

public class NecklaceSort extends MenuEntry {
    public NecklaceSort(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        Manager.quickSort(necklace, new ComparatorOfName());
    }
}
