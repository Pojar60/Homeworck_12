import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Hall {
    private Map<Integer, String> seats;

    public Hall() {
        seats = new HashMap<>();

        seats.put(1, "Двухместный столик №1");
        seats.put(2, "Двухместный столик №2");
        seats.put(3, "Двухместный столик №3");
        seats.put(4, "Четирехместный столик №4");
        seats.put(5, "Четирехместный столик №5");

    }

    public String getSeats(int id){
        return seats.get(id);
    }
    public String removePlace(int id){
        return seats.remove(id);
    }
    public Map<Integer, String> getHashMap(){
        return seats;
    }
}