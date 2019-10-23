package Comp250_Ass1;

public class Fruit extends  MarketProduct{
    private double weight_kg;
    private int price_kg_cents;

    public Fruit(String Name, double weight_kg, int price_kg_cents) {

        super(Name);
        this.weight_kg = weight_kg;
        this.price_kg_cents = price_kg_cents;
    }

    @Override
    public int getCost() {
        int cost_weight;
        cost_weight = (int) (weight_kg * price_kg_cents);
        return cost_weight;
    }

    @Override
    public boolean equals(MarketProduct myfruit) {
        return myfruit.getName().equals(this.getName()) && myfruit.getCost() == this.getCost();
    }
}
