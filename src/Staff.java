import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Staff {
    List<String> listCooks;
    List<String> listBarmens;

    public Staff() {
        listStaff();
    }
    private void listStaff() {
        listCooks = new ArrayList<>();
        listCooks.add("Петров Андрей");
        listCooks.add("Иванов Сергей");
        listCooks.add("Порохнявый Владислав");
        listCooks.add("Меняйло Ольга");
        listCooks.add("Развалинова Виктория");

        listBarmens = new ArrayList<>();
        listBarmens.add("Амосов Арсений");
        listBarmens.add("Бекетова Анастасия");
    }

    public List<String> getListCooks() {
        return listCooks;
    }

    public List<String> getListBarmens() {
        return listBarmens;
    }
}
