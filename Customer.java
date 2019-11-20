package Comp250_Ass1;

public class Customer {
    private String name;
    private int balance;
    private Basket basket;


    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
        basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void addToBasket(MarketProduct mp){
        basket.add(mp);
    }

    public boolean removeFromBasket(MarketProduct mp){
        return basket.remove(mp);
    }

    public int addFunds(int amount){
        if(amount<0){
            throw new IllegalArgumentException("Negative amount!");
        }
         balance = balance + amount;
        return balance;
    }

    public String checkOut(){
        if(balance < basket.getTotalCost()){
            throw new IllegalStateException();
        }
        balance = balance - basket.getTotalCost();
        String output = basket.toString();
        basket.clear();
        return output;
    }
}
