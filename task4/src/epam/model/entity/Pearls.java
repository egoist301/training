package epam.model.entity;

public class Pearls extends Stone {
    public Pearls() {
        super();
    }

    public Pearls(double price, double weight, double transparency) {
        super(price, weight, transparency);
    }

    public Pearls(Stone stone) {
        super(stone);
    }
}
