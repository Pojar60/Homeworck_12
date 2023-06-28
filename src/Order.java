public class Order {

    public String processOrder (int place, String orderDish, int countDish,String orderDrinks, int countDrinks){
        System.out.println("Обработка заказа:");
        System.out.println("Столик: " + place);
        System.out.println("Выбранное блюдо: " + orderDish + " (Количество: " + countDish + ")");
        System.out.println("Выбранный напиток: " + orderDrinks + " (Количество: " + countDrinks + ")");
        String o = "Заказ отправолен в обработку";
        return o;
    }
}
