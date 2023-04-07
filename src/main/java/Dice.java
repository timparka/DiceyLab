import java.util.Random;

public class Dice {
    int maxNum;
    int minNum;
    Bins bin;
    int numOfDice = 0;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
        this.maxNum = numOfDice * 6;
        this.minNum = numOfDice;
        this.bin = new Bins();
    }

    public int tossAndSum() {
        int result = 0;
        int ran = 0;
        Random random = new Random();
        for (int i = 0; i < numOfDice; i++) {
            ran = random.nextInt(6) + 1;
            result += ran;
        }
        bin.incrementBin(result);
        return result;
    }

}
