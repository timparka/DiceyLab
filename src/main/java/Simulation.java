import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Simulation {
    private int numDie;
    private int numTosses;
    public HashMap<Integer, Integer> map = new HashMap<>();
    Dice dice;
    static Bins bins;
    private Simulation simulation;

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults(bins);
    }

    public Simulation(int numDie, int numTosses) {
        dice = new Dice(numDie);
        bins = new Bins();
        this.numDie = numDie;
        this.numTosses = numTosses;
    }

    public void runSimulation() {
        for (int i = 1; i <= numTosses; i++) { //iterates thru number of tosses
            int diceRolled = dice.tossAndSum(); // sets diceRolled as int of
            bins.incrementBin(diceRolled);
        }
    }

    public void printResults(Bins bins) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : bins.getBin().entrySet()) {
            sb.append(entry.getKey());
            sb.append(": ");
            sb.append(entry.getValue());
            sb.append(": ");
            double ratio = (double) entry.getValue() / numTosses;
            sb.append(String.format("%.2f", ratio));
            sb.append("% ");
            sb.append(triangle((int) (ratio * 100)) + "\n");

        }
        System.out.println(sb);
    }
    public String triangle(int percent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < percent; i++){
            sb.append("*");
        }
        return sb.toString();
    }

}
