package sample.data;

import java.util.ArrayList;

public class Order {
    private Double totalCost;
    private CustomerAccount customerAccount;
    private OrderInformation orderInformation;

    private ArrayList<Product> products = new ArrayList<Product>();

    public void setProduct(Product product){products.add(product); }
    public ArrayList<Product> getProducts(){ return products; }
    public void deleteProduct(Product product){products.remove(product);}


    public void setTotalCost(Double totalCost){this.totalCost=totalCost;}
    public Double getTotalCost(){return totalCost;}

    public CustomerAccount getCustomerAccount(){ return customerAccount; }
    public void setCustomerAccount(CustomerAccount customerAccount) { this.customerAccount = customerAccount; }

    public OrderInformation getOrderInformation(){return orderInformation;}
    public void setOrderInformation(OrderInformation orderInformation) { this.orderInformation = orderInformation; }
}
