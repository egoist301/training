package task1;

public class Counter {
    private int countHeads;
    private int countTails;

    public int getCountHeads() {
        return countHeads;
    }

    public void setCountHeads(int countHeads) {
        this.countHeads = countHeads;
    }

    public int getCountTails() {
        return countTails;
    }

    public void setCountTails(int countTails) {
        this.countTails = countTails;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "countHeads=" + countHeads +
                ", countTails=" + countTails +
                '}';
    }
}
