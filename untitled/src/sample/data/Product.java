package sample.data;

public class Product {
    String identifier;
    String brand;
    String model;
    Double price;



    public String getIdentifier() { return identifier; }
    public void setIdentifier(String identifier) { this.identifier = identifier; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() { return model; }
    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() { return price; }
    public void setPrice(Double price) {
        this.price = price;
    }
}
