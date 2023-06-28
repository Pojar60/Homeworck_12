import java.util.*;

public class Recipe {
    Map<Integer, ArrayList<Integer>> menuRecipeDish;
    Map<Integer, ArrayList<Integer>> menuRecipeDrinks;

    List<Integer> borsh;
    List<Integer> vareniki;
    List<Integer> golubtcy;
    List<Integer> deruny;
    List<Integer> pustaKarbonara;

    List<Integer> cappuccino;
    List<Integer> latte;
    List<Integer> freshJuice;


    public Recipe() {
        borsh = new ArrayList<>();
        borsh.add(1);
        borsh.add(7);
        borsh.add(8);
        borsh.add(11);
        borsh.add(12);

        vareniki = new ArrayList<>();
        vareniki.add(13);
        vareniki.add(14);
        vareniki.add(15);

        golubtcy = new ArrayList<>();
        golubtcy.add(8);
        golubtcy.add(14);
        golubtcy.add(15);
        golubtcy.add(16);

        deruny = new ArrayList<>();
        deruny.add(1);
        deruny.add(17);
        deruny.add(18);

        pustaKarbonara = new ArrayList<>();
        pustaKarbonara.add(2);
        pustaKarbonara.add(9);
        pustaKarbonara.add(15);
        pustaKarbonara.add(19);

        cappuccino = new ArrayList<>();
        cappuccino.add(1);
        cappuccino.add(2);
        cappuccino.add(3);

        latte = new ArrayList<>();
        latte.add(1);
        latte.add(2);
        latte.add(3);

        freshJuice = new ArrayList<>();
        freshJuice.add(1);

        menuRecipeDish = new HashMap<>();
        menuRecipeDish.put(1, (ArrayList<Integer>) borsh);
        menuRecipeDish.put(2,(ArrayList<Integer>) vareniki);
        menuRecipeDish.put(3,(ArrayList<Integer>) golubtcy);
        menuRecipeDish.put(4,(ArrayList<Integer>) deruny);
        menuRecipeDish.put(5,(ArrayList<Integer>) pustaKarbonara);

        cappuccino = new ArrayList<>();
        cappuccino.add(1);
        cappuccino.add(2);
        cappuccino.add(3);

        latte = new ArrayList<>();
        latte.add(1);
        latte.add(2);
        latte.add(3);

        freshJuice = new ArrayList<>();
        freshJuice.add(1);

        menuRecipeDrinks = new HashMap<>();
        menuRecipeDrinks.put(8,(ArrayList<Integer>) cappuccino);
        menuRecipeDrinks.put(9,(ArrayList<Integer>) latte);
        menuRecipeDrinks.put(10,(ArrayList<Integer>) freshJuice);


    }

    public ArrayList<Integer> getMenuRecipeDish(int numberDish) {
        return menuRecipeDish.get(numberDish);
    }

    public ArrayList<Integer> getMenuRecipeDrinks(int numberDrinks) {
        return menuRecipeDrinks.get(numberDrinks);
    }


}
