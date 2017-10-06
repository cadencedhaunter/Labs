package by.gsu.gomel;

public class MainApp {

    public static void main(final String[] args) {
        final IceCream[] moroz = {new IceCream("Lakomka", 10, 14.5),
                new IceCream("Pingvin", 3, 10.0), new IceCream("Ykki", 4, 11.1),
                new IceCream("Soletto", 5, 11.0), new IceCream("Plombir", 3, 13.5),
                new IceCream("Noon", 20, 0.6), new IceCream("9Pash", 5, 1.9),
                new IceCream("Lil", 6, 1.11), new IceCream("Solo", 3, 1.14),
                new IceCream("Ramz", 15, 0.11)};

        float averageFat = 0;
        int kolvoch = 0;
        for (final IceCream i : moroz) {
            System.out.format("Name/Shoco/Fatness:  %-9s/%-4d/%.1f%n", i.getName(), i.getShoco(),
                    i.getFatness());
            averageFat += i.getFatness();
            kolvoch += i.getShoco();
        }
        System.out.println("AvgFat = " + (averageFat / moroz.length));
        System.out.println("Kolvo_ch = " + kolvoch);
    }
}
