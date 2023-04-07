import java.util.HashMap;
import java.util.Map;

public class Bins {

    private HashMap<Integer, Integer> map;

    public Bins() {
        this.map = new HashMap<>();
    }

    public HashMap<Integer, Integer> getBin(){
        return this.map;
    }
    public void incrementBin(int diceRolled){
        if (map.containsKey(diceRolled)){
            map.put(diceRolled, map.get(diceRolled) + 1);
        } else {
            map.put(diceRolled, 1);
        }
    }

}
