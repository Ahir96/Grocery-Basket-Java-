package Comp250_Ass1;

public class Customer {
    private String name;
    private int balance_in_cents;
    private Basket products_buying = new Basket();

    public Customer(String name, int balance_in_cents){
            this.name = name;
            this.balance_in_cents = balance_in_cents;
    }

    public String getName(){
        return name;

    }

    public int getBalance(){
        return balance_in_cents;
    }

    public Basket getBasket(){
        return products_buying;
    }

    public int addFunds(int more_cent){
        return balance_in_cents + more_cent;
        //also throw illegal expression, don't know how to do it
    }

    public void addToBasket(MarketProduct myMarketProduct){
        this.products_buying.add(myMarketProduct);

    }

    public boolean removeFromBasket(MarketProduct myMarketProduct){
        return this.products_buying.remove(myMarketProduct);
    }


    public String checkOut(){
        return "safcea";
    }




}
