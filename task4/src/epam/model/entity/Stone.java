package epam.model.entity;

import java.util.Objects;

public class Stone {
    private final static double DEFAULT_PRICE = 0;
    private final static double DEFAULT_WEIGHT = 0;
    private final static double DEFAULT_TRANSPARENCY = 0;

    private double price;
    private double weight;
    private double transparency;

    public Stone() {//TODO add hierarchy
        price = DEFAULT_PRICE;
        weight = DEFAULT_WEIGHT;
        transparency = DEFAULT_TRANSPARENCY;
    }

    public Stone(double price, double weight, double transparency) {
        this.price = price;
        this.weight = weight;
        this.transparency = transparency;
    }

    public Stone(Stone stone) {
        if (stone != null) {
            price = stone.getPrice();
            weight = stone.getWeight();
            transparency = stone.transparency;
        }
    }

    public double getTransparency() {
        return transparency;
    }

    public void setTransparency(double transparency) {
        if (transparency >= 0 && transparency <= 100) {
            this.transparency = transparency;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0)
            this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stone)) return false;
        Stone stone = (Stone) o;
        return getPrice() == stone.getPrice() &&
                getWeight() == stone.getWeight() &&
                getTransparency() == stone.getTransparency();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPrice(), getWeight(), getTransparency());
    }

    @Override
    public String toString() {
        return "Stone{" +
                "price=" + price +
                "$, weight=" + weight +
                " carat, transparency=" + transparency +
                "%}";
    }


}