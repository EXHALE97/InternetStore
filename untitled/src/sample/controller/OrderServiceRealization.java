package sample.controller;

import sample.data.CustomerAccount;
import sample.data.Order;
import sample.data.OrderInformation;
import sample.data.Product;

import java.util.ArrayList;

public class OrderServiceRealization implements OrderService{
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Order create(CustomerAccount customerAccount){
        Order order = new Order();
        customerAccount.setOrder(order);
     return order;
    }
    public void fill(Order order, OrderInformation orderInformation){
        order.setOrderInformation(orderInformation);
    }
    public Double calculatePrice(Order order){
        ArrayList<Product> products = order.getProducts();
        Double temp = 0.0;
        Double totalCost = 0.0;
        for (int i=0; i<= products.size(); i++){
            temp = products.get(i).getPrice();
            totalCost = totalCost + temp;
        }
     return totalCost;
    }

}
