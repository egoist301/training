package epam.model.entity;

public class OrganicStone extends Stone {
    private final static double DEFAULT_HARDNESS = 75;

    private double hardness;

    public OrganicStone() {
        super();
        hardness = DEFAULT_HARDNESS;
    }

    public OrganicStone(String name, double price, double weight, double transparency, String color, double hardness) {
        super(name, price, weight, transparency, color);
        if (hardness > 0 && hardness <= 100)
            this.hardness = hardness;
    }

    public OrganicStone(OrganicStone stone) {
        super(stone);
        if (stone != null) {
            hardness = stone.hardness;
        }
    }

    public double getHardness() {
        return hardness;
    }

    public void setHardness(double hardness) {
        if (hardness > 0 && hardness <= 100) {
            this.hardness = hardness;
        }
    }

    @Override
    public String toString() {
        return "OrganicStone{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                "$, weight=" + getWeight() +
                " carat, transparency=" + getTransparency() +
                "%, color=" + getColor() +
                ", hardness=" + hardness + "%}";
    }
}
