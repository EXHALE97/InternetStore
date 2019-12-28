package sample.injector;

import sample.controller.*;
import sample.ui.GraphicalInterfaceMenu;

public class InternetShop {


    public void createGUI(){
        BasketServiceRealization bsr = new BasketServiceRealization();
        AuthorizationServiceRealization asr = new AuthorizationServiceRealization();
        OrderServiceRealization osr = new OrderServiceRealization();
        ProductServiceRealization psr = new ProductServiceRealization();
        GraphicalInterfaceMenu gui = new GraphicalInterfaceMenu(asr, bsr, osr, psr);
        gui.showAllProducts();

    };
}
