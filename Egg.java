package Comp250_Ass1;

public class Egg extends MarketProduct{
    private int numberofEggs;
    private int centcost;

    public Egg(String Name, int numberofEggs, int centcost) {
        super(Name);
        this.numberofEggs = numberofEggs;
        this.centcost = centcost;
    }


    @Override
    public int getCost() {
        int cost;
        cost = (numberofEggs*centcost)/12;
        return cost;
    }

    @Override
    public boolean equals(MarketProduct myegg) {
        return (myegg.getName().equals(this.getName())) && (myegg.getCost() == this.getCost());
    }
}
