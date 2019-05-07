package maintask2.task1;

import static util.UserInput.*;

public class Initializer {
    public static Point execute(){
        int x;
        int y;
        x = readInt();
        y = readInt();
        return new Point(x, y);
    }
}
