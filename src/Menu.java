import java.util.HashMap;

public class Menu {
    private HashMap<Integer, String> dishes;
    private HashMap<Integer, String> drinks;
    public Menu() {
        dishes = new HashMap<>();
        drinks = new HashMap<>();
        dishes.put(1, "Борщ - Традиционный украинский суп, приготовленный на основе свеклы, капусты, мяса и специй  - 100 грн");
        dishes.put(2, "Вареники - Традиционные украинские пельмени, обычно с начинкой из картофеля, грибов, творога или вишни. Подаются с сметаной или маслом - 130 грн");
        dishes.put(3, "Голубцы - Блюдо, состоящее из фаршированных капустных листьев с начинкой из риса, мяса и специй. Подаются с соусом или сметаной - 100 грн");
        dishes.put(4, "Деруны - Картофельные оладьи, обжаренные на сковороде до золотистой корочки - 110 грн");
        dishes.put(5, "Паста Карбонара - Спагетти  приготовленных с мелкими кусочками ветчени, яичного соуса, сыра пармезан и свежего перца - 90 грн");

        drinks.put(8, "Капуччино - Эспрессо, горячее молоко и молочная пена");
        drinks.put(9, "Латте - Эспрессо и горячее молоко, приправленное молочной пеной");
        drinks.put(10, "Фреш-сок - Фреш с свежих фруктов или овощей");
    }
    public HashMap<Integer, String> getDishes() {
        return dishes;
    }
    public HashMap<Integer, String> getDrinks() {
        return drinks;
    }

    public String getDishesByKey(int key) {
        return dishes.get(key);
    }
    public String getDrinksByKey(int key) {
        return drinks.get(key);
    }
}