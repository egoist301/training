package task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Head or tails:");
        Counter counter = HeadOrTails.throwCoin();
        System.out.println("Heads = " + counter.getCountHeads() + "\nTails = " + counter.getCountTails()) ;

    }
}
