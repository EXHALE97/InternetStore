package sample.data;

public class OrderInformation {
    private String address;
    private String paymentMethod;
    private Order order;

    public void setAddress(String address){this.address=address;}
    public String getAddress(){return address;}

    public void setPaymentMethod(String paymentMethod){this.paymentMethod=paymentMethod;}
    public String getPaymentMethod(){return paymentMethod;}

    public void setOrder(Order order){this.order=order;}
    public Order getOrder(){return order;}
}
