package sample.controller;

import sample.data.Account;
import sample.data.Basket;
import sample.data.CustomerAccount;
import sample.data.Product;

import java.util.ArrayList;

public class BasketServiceRealization implements BasketService {
    public void putProduct(Product product, Basket basket){}
    public Double calculatePrice(Basket basket){ return 1.0;}

   private ArrayList<Basket> baskets = new ArrayList<Basket>();

    public void setBaskets(Double totalCost, CustomerAccount custAcc){
        Basket basket = new Basket();
        basket.setCustomerAccount(custAcc);
        basket.setTotalCost(totalCost);
        baskets.add(basket);
    }
    public ArrayList<Basket> getBaskets() {
        return baskets;
    }
    public void deleteBasket(Basket basket){
        baskets.remove(basket);
    }
}
