package by.gsu.gomel;

public class IceCream {

    private String name;

    private int    shoco;

    private double fatness;

    public IceCream() {
        super();

    }

    public IceCream(final String name, final int shoco, final double fatness) {
        super();
        this.name = name;
        this.shoco = shoco;
        this.fatness = fatness;
    }

    public double getFatness() {
        return this.fatness;
    }

    public String getName() {
        return this.name;
    }

    public int getShoco() {
        return this.shoco;
    }

    public void setFatness(final double fatness) {
        this.fatness = fatness;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setShoco(final int shoco) {
        this.shoco = shoco;
    }

}
