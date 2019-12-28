package sample.controller;

import sample.data.Basket;
import sample.data.Product;

public interface BasketService {
    void putProduct(Product product, Basket basket);
    Double calculatePrice(Basket basket);
}
