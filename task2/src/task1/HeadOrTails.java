package task1;

import java.util.Random;

public class HeadOrTails {
    public static Counter throwCoin(){
        Counter counter = new Counter();

        int countHeads = 0;
        int countTails = 0;

        Random random = new Random();
        for (int i = 0; i < 1000; i++){
            if(random.nextBoolean()){
                countHeads++;
            }
            else {
                countTails++;
            }
        }
        counter.setCountHeads(countHeads);
        counter.setCountTails(countTails);
        return counter;
    }
}
