package sample.controller;

import sample.data.CustomerAccount;
import sample.data.Order;
import sample.data.OrderInformation;

public interface OrderService {
    Order create(CustomerAccount customerAccount);
    void fill(Order order, OrderInformation orderInformation);
    Double calculatePrice(Order order);
}
