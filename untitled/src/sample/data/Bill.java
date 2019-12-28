package sample.data;

public class Bill {
    private Long uniqueIdtf;
    private Double balance;
    private CustomerAccount customerAccount;

    public Bill(Long uniqueIdtf, Double balance){
        this.balance=balance;
        this.uniqueIdtf=uniqueIdtf;
    }

    public CustomerAccount getCustomerAccount(){ return customerAccount; }
    public void setCustomerAccount(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public Long getUniqueIdtf() {
        return uniqueIdtf;
    }
    public void setUniqueIdtf(Long uniqueIdtf) {
        this.uniqueIdtf = uniqueIdtf;
    }

    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
