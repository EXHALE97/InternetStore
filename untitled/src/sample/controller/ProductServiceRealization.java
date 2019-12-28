package sample.controller;

import sample.data.Account;
import sample.data.Product;

import java.util.ArrayList;

public class ProductServiceRealization implements ProductService {
    ArrayList<Product> products = new ArrayList<Product>();

    public ArrayList<Product> getAllProducts(){
      return products;
    };
    public void setProduct(String idtf, String brand, String model, Double price){
        Product product = new Product();
        product.setBrand(brand);
        product.setIdentifier(idtf);
        product.setModel(model);
        product.setPrice(price);
        products.add(product);}

    public Product getProductOnIdentifier(String idtf){
        for (int i=0; i<products.size(); i++){
            if (products.get(i).getIdentifier() == idtf)
                return products.get(i);
        }
        return null;
    };
    public void updateProduct(Product product){
    //невозможно реализовать данную функцию из-за нехватки входных данных: нам необходима информация, которую нужно заменять.
    };
}
