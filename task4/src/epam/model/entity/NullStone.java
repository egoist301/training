package epam.model.entity;

public class NullStone extends Stone {

    public NullStone() {
        super();

    }

    @Override
    public double getPrice() {
        return -1;
    }

    @Override
    public double getWeight() {
        return -1;
    }

    @Override
    public void setPrice(double price) {
    }

    public void setWeight(double weight) {
    }

    @Override
    public double getTransparency() {
        return -1;
    }

    @Override
    public void setTransparency(double transparency) {
    }

    @Override
    public String toString() {
        return "Stone not found.";
    }
}
