package epam.util;

import epam.model.Necklace;
import epam.model.entity.Gemstone;
import epam.model.entity.OrganicStone;
import epam.model.entity.Stone;
import epam.model.entity.TypesStones;
import epam.model.exception.IncorrectValueException;
import org.apache.log4j.Logger;

import java.io.*;

public class FileWorker {
    private static final Logger LOG = Logger.getLogger(FileWorker.class);

    private FileWorker() {
    }

    public static Necklace createNecklace(String fileName) {
        Necklace necklace = new Necklace();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException ex) {
            LOG.warn(ex);
        }

        while (true) {
            try {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split("\\|");

                necklace.add(getStone(arr));

            }
            catch (IOException | NumberFormatException | IncorrectValueException e) {
                LOG.warn(e);
            }
        }
        return necklace;
    }

    private static Stone getStone(String[] arr) throws IncorrectValueException {
        Stone stone;
        if (arr.length >= 6 && arr.length <= 7) {
            switch (TypesStones.valueOf(arr[0].toUpperCase())) {
                case GEMSTONE:
                    stone = new Gemstone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]),
                            Double.valueOf(arr[4]), arr[5], arr[6]);
                    break;
                case ORGANICSTONE:
                    stone = new OrganicStone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]),
                            Double.valueOf(arr[4]), arr[5], Double.valueOf(arr[6]));
                    break;
                case STONE:
                    stone = new Stone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]), Double.valueOf(arr[4]),
                            arr[5]);
                default:
                    throw new IncorrectValueException("Incorrect values.");
            }
        } else {
            throw new IncorrectValueException("Invalid number of values.");
        }
        return stone;
    }
}