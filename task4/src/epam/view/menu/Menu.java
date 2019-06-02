package epam.view.menu;

import epam.model.Necklace;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static final Logger LOG = Logger.getLogger(Menu.class);

    private List<MenuEntry> menu = new ArrayList<>();
    private boolean isExit = false;

    public Menu() {
        menu.add(new MenuEntry("Exit") {
            @Override
            public void run(Necklace necklace) {
                isExit = true;
            }
        });
    }

    public void run(Necklace necklace) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!isExit) {
            System.out.println(toString());
            try {
                int choice = Integer.parseInt(reader.readLine());
                MenuEntry entry = menu.get(choice);
                entry.run(necklace);
            }
            catch (IOException e) {
                LOG.warn("Menu: ", e);
            }
        }
        try {
            reader.close();
        }
        catch (IOException ex){
            LOG.warn(ex);
        }
    }

    public void addEntry(MenuEntry entry) {
        if (entry != null)
            menu.add(entry);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Menu:");
        for (int i = 0; i < menu.size(); i++) {
            builder.append(String.format("\n%s - %s;", i, menu.get(i).getTitle()));
        }
        return builder.toString();
    }
}
