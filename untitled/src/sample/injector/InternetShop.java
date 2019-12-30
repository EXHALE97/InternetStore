package sample.injector;

import sample.controller.*;
import sample.ui.GraphicalInterfaceMenu;

public class InternetShop {


    public void createGUI(){
        BasketService bsr = new BasketServiceRealization();
        AuthorizationService asr = new AuthorizationServiceRealization();
        OrderService osr = new OrderServiceRealization();
        ProductService psr = new ProductServiceRealization();
        GraphicalInterfaceMenu gui = new GraphicalInterfaceMenu(asr, bsr, osr, psr);
        gui.showAllProducts();

    };
}
