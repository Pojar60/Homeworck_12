import java.awt.*;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class Main {
//        public int place;
//
//        public Main(int place) {
//                this.place = place;
//        }

//        public void setPlace(int place) {
//                this.place = place;
//        }

        public static void main(String[] args) {

        Hall hall = new Hall();
        Visitor visitor = new Visitor();
        Menu menu = new Menu();
        Order order = new Order();
        Recipe recipe = new Recipe();
        Kitchen kitchen = new Kitchen();
        Bar bar = new Bar();




        System.out.println("Приветсявую Вас в нашем ретсоране. У нас свободны столики с 1 по 5. Какой столик вы хотеле бы занять?");
        Scanner scanner = new Scanner(System.in);
        int place = 0;
        String selectedPlace ="";
        while (place < 1 || place > 5) {
                place = scanner.nextInt();
                if (place >= 1 && place < +5) {
                        selectedPlace = hall.getSeats(place);
                } else {
                        System.out.println("Пожалуйста вібирите столик от 1 до 5: ");
                }
        }
        visitor.placeVisitor = place;
        hall.removePlace(place);


        System.out.println("Вы выбрали столик - " + selectedPlace + ". Присаживайтесь. Вот наше меню: ");
        System.out.println("Блюда: ");
        for (Integer key : menu.getDishes().keySet()) {
            String value = menu.getDishes().get(key);
            System.out.println("Номер блюда: " + key + " - " + value);
        }

        System.out.println("Какое блюдо вы хотите заказать? Укажите его номер: ");
        Scanner scanner2 = new Scanner(System.in);

        int numberDish = 0;
        String orderDish = "";
        while (numberDish < 1 || numberDish > 5) {
                numberDish = Integer.parseInt(scanner2.nextLine());
                if(numberDish >= 1 && numberDish < +5) {
                        orderDish = menu.getDishesByKey(numberDish);
                }else {
                        System.out.println("Выберите блюдо от 1 до 5: ");
                }
        }

        System.out.println("Вы выбрали  - " + orderDish + ". Отличный выбор. Какое колличество блюд вы хотите заказать?");
        Scanner scanner3 = new Scanner(System.in);
        int countDish = scanner3.nextInt();

        System.out.println("Желаете что то выпить?");
        for (Integer key : menu.getDrinks().keySet()) {
            String value = menu.getDrinks().get(key);
            System.out.println("Номер напитка: " + key + " - " + value);
        }

        int numberDrinks = 0;
        String orderDrinks = "";
        Scanner scanner4 = new Scanner(System.in);
                while (numberDrinks < 8 || numberDrinks > 10) {
                        numberDrinks = Integer.parseInt(scanner4.nextLine());
                        if (numberDrinks >= 8 && numberDrinks < +10) {
                                orderDrinks = menu.getDrinksByKey(numberDrinks);
                        }else{
                                System.out.println("Выбирите напиток с 8 по 10: ");
                        }
                }
        System.out.println("Вы выбрали  - " + orderDrinks + ". Сколько напитков вы хотите заказать?");
        Scanner scanner5 = new Scanner(System.in);
        int countDrinks = scanner5.nextInt();


//        order.processOrder(place, orderDish, countDish, orderDrinks, countDrinks);
//      ЄТОТ БЛОК КОДА Я ВЫВОЖУ ДЛЯ ОТОБРАЖЕНИЯ ПРОЦЕССА ГОТОВКИ ЗАКАЗА (я не увечен что он необходим)
            System.out.println(order.processOrder(place, orderDish, countDish, orderDrinks, countDrinks));
                System.out.println(kitchen.cooking(numberDish, countDish));
                System.out.println(bar.cookingDrinks(numberDrinks, countDrinks));
//
//
//                List<String> listProductsForDish1 = kitchen.getListProductsForDish();
//                List<String> listCooksForOrderDish1 = kitchen.getListCooksForOrderDish();
//
//                System.out.println("Список продуктов из которых будет готовится" + orderDish);
//                for(String prod : listProductsForDish1){
//                        System.out.println(prod);
//                }
//                System.out.println("Список поваров  которые будет готовится" + orderDish + " в колличестве " +countDish + " шт. ");
//                for(String cooks1 : listCooksForOrderDish1){
//                        System.out.println(cooks1);
//                }
//
//
//                List<String> listProductsForDrinks = bar.getListProductsForDrinks();
//                List<String> listCooksForOrderDrinks = bar.getListCooksForOrderDrinks();
//
//                System.out.println("Список продуктов из которых будет готовится" + orderDrinks);
//                for(String prod2 : listProductsForDrinks){
//                        System.out.println(prod2);
//                }
//                System.out.println("Список барменов которые будет готовится" + orderDrinks + " в колличестве " +countDrinks + " шт. ");
//                for(String barmens2 : listCooksForOrderDrinks){
//                        System.out.println(barmens2);
//                }

    }


}

