package sample.data;

public class Basket {
    private Double totalCost;
    private CustomerAccount custAcc;

    public Double getTotalCost() {return totalCost; }
    public void setTotalCost(Double totalCost) {this.totalCost = totalCost; }

    public CustomerAccount getCustomerAccount() {
        return custAcc;
    }
    public void setCustomerAccount(CustomerAccount custAcc) {
        this.custAcc = custAcc;
    }


}
