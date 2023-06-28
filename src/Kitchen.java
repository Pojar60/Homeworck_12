import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kitchen {
    List<String> listProductsForDish;
    List<String> listCooksForOrderDish;

    public String cooking ( int numberDish, int countDish){
        Recipe recipe = new Recipe();
        Staff staff = new Staff();
        List<String> listCooks =staff.getListCooks();
        ProductWarehouse productWarehouse = new ProductWarehouse();

        ArrayList<Integer> listKeyProductsForDish = recipe.getMenuRecipeDish(numberDish); // получил список КЛЮЧЕЙ ингридиентов для заказаного блюда
        productWarehouse.listProduct();
        HashMap<Integer, String> productWarehouse1 =  productWarehouse.getListProducts(); //общий список продуктов

        listProductsForDish = new ArrayList<>(); // Список продуктов для приготовления заказаного блюда

        for(Integer key1: listKeyProductsForDish){             // цикл для отбора продуктов
            String product1 = productWarehouse1.get(key1);
            listProductsForDish.add(product1);
        }

        listCooksForOrderDish = new ArrayList<>(); // Список поворов которые нужны для приготовления нужного колличества Блюд

        for(int i = 0; i < countDish ; i++){
            String cooks1 = listCooks.get(i);
            listCooksForOrderDish.add(cooks1);
        }
        String m = "Блюдо готово";
       return m;
    }

    public List<String> getListProductsForDish() {
        return listProductsForDish;
    }

    public List<String> getListCooksForOrderDish() {
        return listCooksForOrderDish;
    }
}
