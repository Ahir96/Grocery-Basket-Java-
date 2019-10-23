package Comp250_Ass1;

public class Jam extends MarketProduct {
    private int numJars;
    private int price_Jars_cents;
    public Jam(String Name, int numJars, int price_Jars_cents) {
        super(Name);
        this.numJars = numJars;
        this.price_Jars_cents = price_Jars_cents;
    }

    @Override
    public int getCost() {
        int cost_jar;
        cost_jar = (numJars * price_Jars_cents);
        return cost_jar;
    }

    @Override
    public boolean equals(MarketProduct myjar) {
        return (myjar.getName().equals(this.getName())) && (myjar.getCost() == this.getCost());
    }
}
