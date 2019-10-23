package Comp250_Ass1;


public class Basket {
    private MarketProduct[] products; //an array of market products containing string;



    @SuppressWarnings("unchecked")
    public Basket() {

        products = new MarketProduct[0]; // I think this one is the real empty array
    }

    public MarketProduct[] getProducts() {

        //shallow copy = creates a new instance --> copies all the field of the object to it --> returns as a object type
        MarketProduct[] proLen = new MarketProduct[products.length];
        MarketProduct[] shallow_array = proLen.clone();
        return shallow_array;
    }

    public void add(MarketProduct marketProduct){
        @SuppressWarnings("unchecked")
        MarketProduct[] shallow_array = new MarketProduct[products.length +1];
        //copy everything over to the new array
        for(int i = 0; i < products.length; i++){
            shallow_array[i] = products[i];
        }
        //add the new element
        shallow_array[shallow_array.length - 1] = marketProduct;
        products = shallow_array;
    }

    public boolean remove(MarketProduct marketProduct){
        boolean found = false;
        for(int i = 0; i < products.length; i++) {
            if (products[i].equals(marketProduct)) {
                found = true;
                return found;

            }
        }

        return found;
    }
    public void clear() {
        removeAllElements();
    }

    public synchronized void removeAllElements() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }

    }
    public int getNumofProducts(){
        int counter = 0;
        for (int i = 0; i < products.length; i ++)
            if (products[i] != null)
                counter ++;
        return counter;  //returning the count of products in myArray
    }

    public int getSubTotal(){
        int total = 0;
        for(MarketProduct product: products){
            total+= product.getCost();
        }

    return total;
    }

    public int getTotalTax(){
        MarketProduct m1;
        for(int i=0 ; i< products.length; i++){
            m1= products[i];
            if(m1 instanceof Jam ){
                int cost= (int) (products[i].getCost() * 0.15);
                return cost;
            }
        }
        return 0;
    }

    public int getTotalCost(){
        int totalCost=0;
        for(MarketProduct product: products){
            totalCost = product.getCost() + getTotalTax();
        }
        return totalCost;
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();

        for (MarketProduct product: products) {

            output.append(product.getName() + '\t' +
                    (product.getCost() <= 0 ? '-' : String.format("%.2f", product.getCost() / 100.0))).append('\n');

        }
        output.append("\nSubtotal\t" + String.format("%.2f", getSubTotal() / 100.0));
        output.append("\nTotal tax\t" + String.format("%.2f", getTotalTax() / 100.0));
        output.append("\n\nTotal cost\t" + String.format("%.2f", getTotalCost() / 100.0));

        return output.toString();

    }



}
