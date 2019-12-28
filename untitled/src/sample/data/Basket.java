package sample.data;

import java.util.ArrayList;

public class Basket {
    private Double totalCost;
    private CustomerAccount custAcc;
    private ArrayList<Product> products = new ArrayList<Product>();

    public void setProduct(Product product){products.add(product);}
    public ArrayList<Product> getProducts(){return products;}
    public void deleteProduct(Product product){
        products.remove(product);
    }

    public Double getTotalCost() {return totalCost; }
    public void setTotalCost(Double totalCost) {this.totalCost = totalCost; }

    public CustomerAccount getCustomerAccount() {
        return custAcc;
    }
    public void setCustomerAccount(CustomerAccount custAcc) {
        this.custAcc = custAcc;
    }


}
