import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bar {
    List<String> listProductsForDrinks;
    List<String> listCooksForOrderDrinks;

    public String cookingDrinks (int numberDrinks, int countDrinks){
        Recipe recipe = new Recipe();
        Staff staff = new Staff();
        List<String> listBarmens = staff.getListBarmens();
        ProductWarehouse productWarehouse = new ProductWarehouse();

        ArrayList<Integer> listKeyProductsForDrinks = recipe.getMenuRecipeDrinks(numberDrinks); // получил список КЛЮЧЕЙ ингридиентов для заказаного напитка
        productWarehouse.listProduct();
        HashMap<Integer, String> productWarehouse2 =  productWarehouse.getListProducts(); //общий список продуктов

        listProductsForDrinks = new ArrayList<>(); // Список продуктов для приготовления заказаного напитка

        for(Integer key2: listKeyProductsForDrinks){             // цикл для отбора продуктов
            String product2 = productWarehouse2.get(key2);
            listProductsForDrinks.add(product2);
        }

        listCooksForOrderDrinks = new ArrayList<>(); // Список поворов которые нужны для приготовления нужного колличества НАпитков

        for(int i = 0; i < countDrinks ; i++){
            String cooks2 = listBarmens.get(i);
            listCooksForOrderDrinks.add(cooks2);
        }

        return null;
    }

    public List<String> getListProductsForDrinks() {
        return listProductsForDrinks;
    }

    public List<String> getListCooksForOrderDrinks() {
        return listCooksForOrderDrinks;
    }
}

