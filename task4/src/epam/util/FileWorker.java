package epam.util;

import epam.model.Necklace;
import epam.model.exception.IncorrectValueException;
import org.apache.log4j.Logger;

import java.io.*;

public class FileWorker {
    private static final Logger LOG = Logger.getLogger(FileWorker.class);
    private static final String SEPARATOR = "\\|";
    private FileWorker() {
    }

    public static Necklace createNecklaceFromFile(String fileName) {
        Necklace necklace = new Necklace();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(SEPARATOR);
                necklace.addStone(StoneFactory.getStoneFromString(arr));
            }
        } catch (IncorrectValueException | NumberFormatException | IOException ex) {
            LOG.warn(ex);
        }
        return necklace;
    }

}