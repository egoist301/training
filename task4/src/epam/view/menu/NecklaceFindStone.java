package epam.view.menu;

import epam.model.Necklace;
import epam.model.logic.Manager;
import epam.view.Printer;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NecklaceFindStone extends MenuEntry {
    private static final Logger LOG = Logger.getLogger(NecklaceFindStone.class);

    public NecklaceFindStone(String title) {
        super(title);
    }

    @Override
    public void run(Necklace necklace) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double start = 0;
        double end = 0;

        try {
            Printer.execute("Enter the lower limit of transparency:");
            start = Double.parseDouble(reader.readLine());
            Printer.execute("Enter the high limit of transparency:");
            end = Double.parseDouble(reader.readLine());

        } catch (IOException e) {
            LOG.warn(e);
        }

        Printer.execute(Manager.searchByTransparency(necklace, start, end));
    }
}
