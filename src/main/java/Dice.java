import java.util.Random;

public class Dice {
    int max = 6;
    //int lowestPossibleNumber = numOfDies;
    int timesThrown = 0;
    int numOfDice = 0;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int tossAndSum() {
        int result = 0;
        int ran = 0;
        Random random = new Random();
        for (int i = 0; i < numOfDice; i++) {
            ran = random.nextInt(6) + 1;
            result += ran;
        }
        return result;
    }

    public int randomDieResult() {
        return 0;
    }

}
