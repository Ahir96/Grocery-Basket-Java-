package Comp250_Ass1;

import java.util.jar.Attributes;

abstract class MarketProduct {

   //private field for String names
    //private final String name;
    private  String aName;



    //constructor initializing product name
    public MarketProduct(String Name){
        this.aName = Name;

    }

    //getName() method to return the name of "this" MarketProduct
    public final String getName(){
        return aName;
    }

    //abstract method returning int w/o body
    public abstract int getCost();
    //abstract method with input returning boolean

    public abstract boolean equals(MarketProduct product);
}
