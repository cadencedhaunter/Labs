package by.gsu.gomel;

import java.util.ArrayList;

public class MainApp {
    public static void main(final String[] args) {
        final ArrayList<IceCream> icecream = new ArrayList<>();
        icecream.add(new IceCream("Lakomka", 10, 14.5));
        icecream.add(new IceCream("Pingvin", 3, 10.0));
        icecream.add(new IceCream("Ykki", 4, 11.1));
        icecream.add(new IceCream("Soletto", 5, 11.0));
        icecream.add(new IceCream("Plombir", 3, 13.5));
        icecream.add(new IceCream("Moon", 20, 0.6));
        icecream.add(new IceCream("28Cent", 5, 1.9));
        icecream.add(new IceCream("Lil", 6, 1.11));
        icecream.add(new IceCream("322", 3, 1.14));
        icecream.add(new IceCream("Rome", 15, 0.11));
        float AllFat = 0;
        int AllCh = 0;
        for (int i = 0; i < 10; i++) {
            AllFat += icecream.get(i).getFatness();
            AllCh += icecream.get(i).getShoco();
        }
        System.out.println("AvgFat = " + (AllFat / icecream.size()));
        System.out.println("Kolvo_ch = " + AllCh);
    }
}
