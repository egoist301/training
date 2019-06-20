package epam.util;

import epam.model.entity.Gemstone;
import epam.model.entity.OrganicStone;
import epam.model.entity.Stone;
import epam.model.exception.IncorrectValueException;

public class StoneFactory {
    private StoneFactory() {

    }

    public static Stone getStoneFromString(String[] arr) throws IncorrectValueException {
        Stone stone;
        if (arr.length == 6 || arr.length == 7) {
            switch (arr[0]) {
                case "gemstone":
                    stone = new Gemstone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]),
                            Double.valueOf(arr[4]), arr[5], arr[6]);
                    break;
                case "organicstone":
                    stone = new OrganicStone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]),
                            Double.valueOf(arr[4]), arr[5], Double.valueOf(arr[6]));
                    break;
                case "stone":
                    stone = new Stone(arr[1], Double.valueOf(arr[2]), Double.valueOf(arr[3]), Double.valueOf(arr[4]),
                            arr[5]);
                    break;
                default:
                    throw new IncorrectValueException("Incorrect values.");
            }
        } else {
            throw new IncorrectValueException("Invalid number of values.");
        }
        return stone;
    }
}
