package Comp250_Ass1;


public class Basket {
    private MarketProduct[] products;

    public Basket() {
         products = new MarketProduct[0]; //initialize the field with an empty array.
    }

    public MarketProduct[] getProducts(){
        MarketProduct[] coppyArray = new MarketProduct[]{};
        System.arraycopy(products, 0, coppyArray, 0, coppyArray.length);
        return coppyArray;
    }


    public void add(MarketProduct mp){
        MarketProduct[] coppyArray = new MarketProduct[products.length+1];
        System.arraycopy(products, 0, coppyArray, 0, products.length);

        coppyArray[coppyArray.length-1]= mp;
        products=coppyArray;
    }


    public boolean remove(MarketProduct mp){
        for (int i = 0; i< products.length; i++){
            if(products[i].equals(mp)) {
                MarketProduct[] copyArray = new MarketProduct[products.length-1];
                System.arraycopy(products, 0, copyArray, 0, i);
                System.arraycopy(products, i + 1, copyArray, i, copyArray.length - i);
                products = copyArray;
                return true;
            }
        }
        return false;
    }


    public void clear(){
        products = new MarketProduct[0];
    }

    public int getNumOfProducts(){
        return products.length;

    }


    public int getSubTotal(){
        int cost=0;
        for(int i = 0; i< products.length; i++){
            cost = cost + products[i].getCost();
        }
        return cost;
    }


    public int getTotalTax(){
        int tax =0;
        for(int i = 0; i< products.length; i++){
            if(products[i] instanceof Jam){
                tax = tax + products[i].getCost();
            }
        }
        tax = (int) (tax *1.15);
        return tax;
    }


    public int getTotalCost(){
        int totalCost = getSubTotal()+getTotalTax();
        return totalCost;
    }


    @Override
    public String toString() {
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
