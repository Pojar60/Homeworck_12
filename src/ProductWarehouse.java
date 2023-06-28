import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class ProductWarehouse {
    HashMap<Integer, String> listProducts;
    HashMap<Integer, String> listDrinksIngredients;

    public void listProduct(){
        listProducts = new HashMap<>();
        listProducts.put(1, "Картошка");
        listProducts.put(2, "Макароны");
        listProducts.put(3, "Помидоры");
        listProducts.put(4, "Яйцо");
        listProducts.put(5, "Черный перец");
        listProducts.put(6, "Красный перец");
        listProducts.put(7, "Морковка");
        listProducts.put(8, "Капуста");
        listProducts.put(9, "Соус Паприк");
        listProducts.put(10, "Соус Цезарь");
        listProducts.put(11, "Свекла");
        listProducts.put(12, "Мясо - свинина");
        listProducts.put(13, "Тесто");
        listProducts.put(14, "Фарш");
        listProducts.put(15, "Вода");
        listProducts.put(16, "Рис");
        listProducts.put(17, "Подсолнечное масло");
        listProducts.put(18, "Мука");
        listProducts.put(19, "Бекон");

        listDrinksIngredients = new HashMap<>();
        listDrinksIngredients.put(1,"Кофе");
        listDrinksIngredients.put(2,"Молоко");
        listDrinksIngredients.put(3, "Вода");
        listDrinksIngredients.put(4, "Фреш-апельсиновый");
    }
    public HashMap<Integer, String> getListProducts(){
        return listProducts;
    }

    public HashMap<Integer, String> getListDrinksIngredients(){
        return listDrinksIngredients;
    }
}
