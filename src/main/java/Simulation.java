import java.util.Scanner;

public class Simulation {
    private int numDie;
    private int numTosses;
    Dice dice;

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults();
    }

    public Simulation(int numDie, int numTosses) {
        dice = new Dice(numDie);
        this.numDie = numDie;
        this.numTosses = numTosses;
    }

    public void runSimulation() {
        for (int i = 1; i <= numTosses; i++) {
            dice.tossAndSum();
        }
    }

    public void printResults() {

    }

}
