package sample.controller;

import sample.data.CustomerAccount;
import sample.data.Order;
import sample.data.OrderInformation;

import java.util.ArrayList;

public class OrderServiceRealization implements OrderService{
    private ArrayList<Order> orders = new ArrayList<Order>();

    public Order create(CustomerAccount customerAccount){
        Order order = new Order();
        customerAccount.setOrder(order);
     return order;
    }
    public void fill(Order order, OrderInformation orderInformation){

    }
    public Double calculatePrice(Order order){
     return 1.0;
    }

}
