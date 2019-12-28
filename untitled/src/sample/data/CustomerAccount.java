package sample.data;

import java.util.ArrayList;

public class CustomerAccount extends Account {
    private Bill bill;
    private Basket basketTotalCost;
    private Basket accBasket;
    private ArrayList<Order> orders = new ArrayList<Order>();

    public CustomerAccount(String login, String password, String role, Bill bill){
        super(login,password,role);
        this.bill=bill;
    }

    public void setOrder(Order order){orders.add(order); }
    public ArrayList<Order> getOrders(){ return orders; }
    public void deleteOrder(Order order){orders.remove(order);}


    public Bill getBill() { return bill; }
    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Basket getBasketTotalCost() {return basketTotalCost; }
    public void setBasketTotalCost(Basket customerTotalCost) {
        this.basketTotalCost = customerTotalCost;
    }

    public Basket getAccBasket() {return accBasket; }
    public void setAccBasket(Basket basket) {
        this.accBasket = basket;
    }
}
