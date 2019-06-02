package epam.model.entity;

public class Gemstone extends Stone {
    private final static String DEFAULT_MINERAL = "Diamond";

    private String mineral;

    public Gemstone() {
        super();
        mineral = DEFAULT_MINERAL;
    }

    public Gemstone(String name, double price, double weight, double transparency, String color, String mineral) {
        super(name, price, weight, transparency, color);
        if (mineral != null) {
            this.mineral = mineral;
        }
    }

    public Gemstone(Gemstone stone) {
        super(stone);
        if (stone != null) {
            mineral = stone.mineral;
        }
    }

    public String getMineral() {
        return mineral;
    }

    public void setMineral(String mineral) {
        if (mineral != null) {
            this.mineral = mineral;
        }
    }

    @Override
    public String toString() {
        return "GemStone{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                "$, weight=" + getWeight() +
                " carat, transparency=" + getTransparency() +
                "%, color=" + getColor() +
                ", mineral=" + mineral + "}";
    }
}
