package epam.util;

import epam.model.Necklace;
import epam.model.entity.Gemstone;
import epam.model.entity.OrganicStone;
import epam.model.entity.Stone;
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
        try {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split("\\|");

                necklace.add(getStone(arr));
            }
        } catch (IOException | NumberFormatException e) {
            LOG.warn(e);
        }
        return necklace;
    }

    private static Stone getStone(String[] arr){
        Stone stone;
        if (arr.length == 6) {
            if (!arr[5].matches("[a-zA-Z]?\\d+")) {
                stone = new Gemstone(arr[0], Double.valueOf(arr[1]), Double.valueOf(arr[2]),
                        Double.valueOf(arr[3]), arr[4], arr[5]);
            } else {
                stone = new OrganicStone(arr[0], Double.valueOf(arr[1]), Double.valueOf(arr[2]),
                        Double.valueOf(arr[3]), arr[4], Double.valueOf(arr[5]));
            }
        } else if (arr.length == 5){
            stone = new Stone(arr[0], Double.valueOf(arr[1]), Double.valueOf(arr[2]), Double.valueOf(arr[3]),
                    arr[4]);
        }
        else{
            throw new IllegalArgumentException();
        }
        return stone;
    }
}
