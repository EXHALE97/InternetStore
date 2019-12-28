package sample.controller;

import java.util.ArrayList;
import sample.data.Product;

public interface ProductService {
    ArrayList<Product> getAllProducts();
    Product getProductOnIdentifier(String idtf);
    void updateProduct(Product product);
}
