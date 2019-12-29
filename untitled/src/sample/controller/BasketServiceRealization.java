package sample.controller;

import sample.data.Account;
import sample.data.Basket;
import sample.data.CustomerAccount;
import sample.data.Product;

import java.util.ArrayList;

public class BasketServiceRealization implements BasketService {
    private ArrayList<Basket> baskets = new ArrayList<Basket>();

    public void putProduct(Product product, Basket basket){
        basket.setProduct(product);
    }
    public Double calculatePrice(Basket basket){
        ArrayList<Product> products = basket.getProducts();
        Double temp = 0.0;
        Double totalCost = 0.0;
        for (int i=0; i<= products.size(); i++){
            temp = products.get(i).getPrice();
            totalCost = totalCost + temp;
        }
        return totalCost;}

    public void setBaskets(Double totalCost, CustomerAccount custAcc){
        Basket basket = new Basket();
        basket.setCustomerAccount(custAcc);
        basket.setTotalCost(totalCost);
        baskets.add(basket);
    }
    public ArrayList<Basket> getBaskets() {
        return baskets;
    }
}
