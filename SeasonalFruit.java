package Comp250_Ass1;

public class SeasonalFruit extends Fruit {

    public SeasonalFruit(String Name, double weight_kg, int price_kg_cents) {
        super(Name, weight_kg, price_kg_cents);


    }
    public int getCost(){
        int discout_cost;
        discout_cost =  (int)(super.getCost()-(super.getCost()*(0.15)));
        return discout_cost;

    }
}
