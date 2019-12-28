package sample.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import sample.data.*;
import sample.controller.*;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.util.ArrayList;

public class GraphicalInterfaceMenu {

    public GraphicalInterfaceMenu(AuthorizationServiceRealization asr,BasketServiceRealization bsr, OrderServiceRealization osr , ProductServiceRealization psr){
    //для передачи всех списков(аккаунты, корзины, продукты, заказы) необходимо добавить новые поля в данный класс
        // в диаграмме классов должна быть связь между данным классом и классами "серивсов"
    }
    public void showAllProducts(){
        Button allProducts = new Button("Все продукты");
        Button basket = new Button("Корзина");
        Button author = new Button("Войти");
        GridPane allProductsMenu = new GridPane();
        //вывод продуктов невозможен из-за отсутствия доступа к списку продуктов

        //тут должно быть создание списка продуктов, добавленного в VBox
        //код ниже - макет списка продуктов
        VBox productsBox = new VBox();
        Label product1 = new Label("Продукт 1");
        Label product2 = new Label("Продукт 2");
        Label product3 = new Label("Продукт 3");
        Label product4 = new Label("Продукт 4");
        Label product5 = new Label("Продукт 5");
        Label product6 = new Label("Продукт 6");
        Button prod1 = new Button("Добавить в корзину");
        Button prod2 = new Button("Добавить в корзину");
        Button prod3 = new Button("Добавить в корзину");
        Button prod4 = new Button("Добавить в корзину");
        Button prod5 = new Button("Добавить в корзину");
        Button prod6 = new Button("Добавить в корзину");
        productsBox.getChildren().addAll(product1,prod1,product2,prod2,product3,prod3,product4,prod4,product5,prod5,product6,prod6);

        allProductsMenu.getColumnConstraints().add(new ColumnConstraints(140));
        allProductsMenu.getColumnConstraints().add(new ColumnConstraints(120));
        allProductsMenu.getColumnConstraints().add(new ColumnConstraints(130));
        GridPane.setRowIndex(allProducts, 0);
        GridPane.setColumnIndex(allProducts, 0);
        GridPane.setRowIndex(basket, 0);
        GridPane.setColumnIndex(basket, 1);
        GridPane.setRowIndex(author, 0);
        GridPane.setColumnIndex(author, 2);
        GridPane.setRowIndex(productsBox,1);
        GridPane.setColumnIndex(productsBox, 0);
        allProductsMenu.getChildren().addAll(allProducts,basket,author,productsBox);
        Stage stage = new Stage();
        Scene scene = new Scene(allProductsMenu, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Internet Shop");
        allProducts.setOnAction(event -> {
            stage.close();
            showAllProducts();
        });
        basket.setOnAction(event -> {
            stage.close();
            showBasket();

        });
        author.setOnAction(event -> {
            stage.close();
            showAuthorizationMenu();
        });
        stage.show();

    };
    public void showEditMenu(){
        Button allProducts = new Button("Все продукты");
        Button basket = new Button("Корзина");
        Button author = new Button("Войти");
        //макет редактирования продуктов(взаимодействие невозможно из-за ошибиок в диаграммах)
        Label prod1Label = new Label("Продукт 1");
        Button del1Button = new Button("Удалить");
        Button edit1Button = new Button("Редактировать");
        TextField brand1 = new TextField("Бренд 1");
        TextField model1 = new TextField("Модель 1");
        TextField price1 = new TextField("Цена 1");
        Label prod2Label = new Label("Продукт 2");
        Button del2Button = new Button("Удалить");
        Button edit2Button = new Button("Редактировать");
        TextField brand2 = new TextField("Бренд 2");
        TextField model2 = new TextField("Модель 2");
        TextField price2 = new TextField("Цена 2");
        Label prod3Label = new Label("Продукт 3");
        Button del3Button = new Button("Удалить");
        Button edit3Button = new Button("Редактировать");
        TextField brand3 = new TextField("Бренд 3");
        TextField model3 = new TextField("Модель 3");
        TextField price3 = new TextField("Цена 3");
        Label prod4Label = new Label("Продукт 4");
        Button del4Button = new Button("Удалить");
        Button edit4Button = new Button("Редактировать");
        TextField brand4 = new TextField("Бренд 4");
        TextField model4 = new TextField("Модель 4");
        TextField price4 = new TextField("Цена 4");
        Label prod5Label = new Label("Продукт 5");
        Button del5Button = new Button("Удалить");
        Button edit5Button = new Button("Редактировать");
        TextField brand5 = new TextField("Бренд 5");
        TextField model5 = new TextField("Модель 5");
        TextField price5 = new TextField("Цена 5");
        Label prod6Label = new Label("Продукт 6");
        Button del6Button = new Button("Удалить");
        Button edit6Button = new Button("Редактировать");
        TextField brand6 = new TextField("Бренд 6");
        TextField model6 = new TextField("Модель 6");
        TextField price6 = new TextField("Цена 6");

        GridPane editPane1 = new GridPane();
        editPane1.add(prod1Label,0,0);
        editPane1.add(del1Button,0,1);
        editPane1.add(edit1Button,0,2);
        editPane1.add(brand1,1,0);
        editPane1.add(model1,1,1);
        editPane1.add(price1,1,2);
        GridPane editPane2 = new GridPane();
        editPane2.add(prod2Label,0,0);
        editPane2.add(del2Button,0,1);
        editPane2.add(edit2Button,0,2);
        editPane2.add(brand2,1,0);
        editPane2.add(model2,1,1);
        editPane2.add(price2,1,2);
        GridPane editPane3 = new GridPane();
        editPane3.add(prod3Label,0,0);
        editPane3.add(del3Button,0,1);
        editPane3.add(edit3Button,0,2);
        editPane3.add(brand3,1,0);
        editPane3.add(model3,1,1);
        editPane3.add(price3,1,2);
        GridPane editPane4 = new GridPane();
        editPane4.add(prod4Label,0,0);
        editPane4.add(del4Button,0,1);
        editPane4.add(edit4Button,0,2);
        editPane4.add(brand4,1,0);
        editPane4.add(model4,1,1);
        editPane4.add(price4,1,2);
        GridPane editPane5 = new GridPane();
        editPane5.add(prod5Label,0,0);
        editPane5.add(del5Button,0,1);
        editPane5.add(edit5Button,0,2);
        editPane5.add(brand5,1,0);
        editPane5.add(model5,1,1);
        editPane5.add(price5,1,2);
        GridPane editPane6 = new GridPane();
        editPane6.add(prod6Label,0,0);
        editPane6.add(del6Button,0,1);
        editPane6.add(edit6Button,0,2);
        editPane6.add(brand6,1,0);
        editPane6.add(model6,1,1);
        editPane6.add(price6,1,2);

        GridPane editPanes = new GridPane();
        editPanes.add(editPane1,0,0);
        editPanes.add(editPane2,0,1);
        editPanes.add(editPane3,0,2);
        editPanes.add(editPane4,1,0);
        editPanes.add(editPane5,1,1);
        editPanes.add(editPane6,1,2);
        editPanes.setPadding(new Insets(10));
        editPanes.setHgap(5);
        editPanes.setVgap(5);
        editPanes.getColumnConstraints().add(new ColumnConstraints(250));
        editPanes.getColumnConstraints().add(new ColumnConstraints(250));
        //конец макета

        GridPane editMenu = new GridPane();
        editMenu.getColumnConstraints().add(new ColumnConstraints(140));
        editMenu.getColumnConstraints().add(new ColumnConstraints(120));
        editMenu.getColumnConstraints().add(new ColumnConstraints(130));
        GridPane.setRowIndex(allProducts, 0);
        GridPane.setColumnIndex(allProducts, 0);
        GridPane.setRowIndex(basket, 0);
        GridPane.setColumnIndex(basket, 1);
        GridPane.setRowIndex(author, 0);
        GridPane.setColumnIndex(author, 2);
        GridPane.setRowIndex(editPanes,1);
        GridPane.setColumnIndex(editPanes,0);
        editMenu.getChildren().addAll(allProducts,basket,author,editPanes);
        Stage stage = new Stage();
        Scene scene = new Scene(editMenu, 520, 300);
        stage.setScene(scene);
        stage.setTitle("Internet Shop");
        allProducts.setOnAction(event -> {
            stage.close();
            showAllProducts();
        });
        basket.setOnAction(event -> {
            stage.close();
            showBasket();
        });
        author.setOnAction(event -> {
            stage.close();
            showAuthorizationMenu();
        });
        //+взаимодействие с каждой из кнопок "удаление", "редактирование".
        stage.show();
    };
    public void showBasket(){
        Button allProducts = new Button("Все продукты");
        Button basket = new Button("Корзина");
        Button author = new Button("Войти");
        GridPane basketMenu = new GridPane();

        //макет корзины
        GridPane basketPane = new GridPane();
        Label prod1 = new Label("Продукт 1");
        Label colprod1 = new Label("Количество:");
        TextField textcolprod1 = new TextField("количество");
        Button delprod1 = new Button("Удалить");
        Label prod2 = new Label("Продукт 2");
        Label colprod2 = new Label("Количество:");
        TextField textcolprod2 = new TextField("количество");
        Button delprod2 = new Button("Удалить");
        Label totalCost = new Label ("Общая сумма");
        Button makeOrder = new Button("Заказать");
        basketPane.add(prod1,0,0);
        basketPane.add(colprod1,1,0);
        basketPane.add(textcolprod1,2,0);
        basketPane.add(delprod1,1,1);
        basketPane.add(prod2,0,2);
        basketPane.add(colprod2,1,2);
        basketPane.add(textcolprod2,2,2);
        basketPane.add(delprod2,1,3);
        basketPane.add(totalCost,0,4);
        basketPane.add(makeOrder,1,4);
        basketPane.setPadding(new Insets(10));
        basketPane.setHgap(5);
        basketPane.setVgap(5);
        basketPane.getColumnConstraints().add(new ColumnConstraints(100));
        basketPane.getColumnConstraints().add(new ColumnConstraints(100));
        basketPane.getColumnConstraints().add(new ColumnConstraints(100));
        //конец макета

        basketMenu.getColumnConstraints().add(new ColumnConstraints(140));
        basketMenu.getColumnConstraints().add(new ColumnConstraints(120));
        basketMenu.getColumnConstraints().add(new ColumnConstraints(130));
        GridPane.setRowIndex(allProducts, 0);
        GridPane.setColumnIndex(allProducts, 0);
        GridPane.setRowIndex(basket, 0);
        GridPane.setColumnIndex(basket, 1);
        GridPane.setRowIndex(author, 0);
        GridPane.setColumnIndex(author, 2);
        GridPane.setRowIndex(basketPane,1);
        GridPane.setColumnIndex(basketPane, 0);
        basketMenu.getChildren().addAll(allProducts,basket,author,basketPane);
        Stage stage = new Stage();
        Scene scene = new Scene(basketMenu, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Internet Shop");

        allProducts.setOnAction(event -> {
            stage.close();
            showAllProducts();
        });

        author.setOnAction(event -> {
            stage.close();
            showAuthorizationMenu();
        });
        basket.setOnAction(event -> {
            stage.close();
            showBasket();
        });
        makeOrder.setOnAction(event -> {
            stage.close();
            showAuthorizationMenu();
        });
        stage.show();
    };
    public void showAuthorizationMenu(){
        Button allProducts = new Button("Все продукты");
        Button basket = new Button("Корзина");
        Button author = new Button("Войти");
        GridPane authorizationMenu = new GridPane();

        //макет авторизации
        GridPane authorizationPane = new GridPane();
        Label login = new Label("Логин");
        Label password = new Label("Пароль");
        Button logInButton = new Button("Войти");
        TextField logintext = new TextField("логин");
        PasswordField passtext = new PasswordField();
        authorizationPane.add(login,0,0);
        authorizationPane.add(password,0,1);
        authorizationPane.add(logInButton,0,2);
        authorizationPane.add(logintext,1,0);
        authorizationPane.add(passtext,1,1);
        authorizationPane.setPadding(new Insets(10));
        authorizationPane.setHgap(5);
        authorizationPane.setVgap(5);
        authorizationPane.getColumnConstraints().add(new ColumnConstraints(100));
        authorizationPane.getColumnConstraints().add(new ColumnConstraints(100));
        authorizationPane.getColumnConstraints().add(new ColumnConstraints(100));
        //конец макета

        authorizationMenu.getColumnConstraints().add(new ColumnConstraints(140));
        authorizationMenu.getColumnConstraints().add(new ColumnConstraints(120));
        authorizationMenu.getColumnConstraints().add(new ColumnConstraints(130));
        GridPane.setRowIndex(allProducts, 0);
        GridPane.setColumnIndex(allProducts, 0);
        GridPane.setRowIndex(basket, 0);
        GridPane.setColumnIndex(basket, 1);
        GridPane.setRowIndex(author, 0);
        GridPane.setColumnIndex(author, 2);
        GridPane.setRowIndex(authorizationPane, 1);
        GridPane.setColumnIndex(authorizationPane, 0);
        authorizationMenu.getChildren().addAll(allProducts,basket,author,authorizationPane);
        Stage stage = new Stage();
        Scene scene = new Scene(authorizationMenu, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Internet Shop");

        allProducts.setOnAction(event -> {
            stage.close();
            showAllProducts();
        });

        author.setOnAction(event -> {
            stage.close();
            showAuthorizationMenu();
        });
        basket.setOnAction(event -> {
            stage.close();
            showBasket();
        });
        logInButton.setOnAction(event -> {
            stage.close();
            //вызов функции авторизации
            //если пользователь админ - переход в showEditMenu()
            //если же пользоватнль - переход в showOrderMenu()
            //данные действия выполняются в соответствии с диаграммой состояний
            //не предусмотрена авторизация из любой точки и смена окна после авторизации на окно авторизованного пользователя
            showOrderMenu();
        });
        stage.show();
    };
    public void showOrder(){
        Button allProducts = new Button("Все продукты");
        Button basket = new Button("Корзина");
        Button author = new Button("Войти");

        //макет демонстрации заказа(реальный показ невозможен из-за отуствия доступа к списку заказов
        GridPane orderCheckPane = new GridPane();
        Label prod1 = new Label("Продукт 1");
        Label colprod1 = new Label("Количество:");
        Label prod2 = new Label("Продукт 2");
        Label colprod2 = new Label("Количество:");
        Label totalCost = new Label ("Общая сумма:");
        orderCheckPane.add(prod1,0,0);
        orderCheckPane.add(colprod1,1,0);
        orderCheckPane.add(prod2,0,1);
        orderCheckPane.add(colprod2,1,1);
        orderCheckPane.add(totalCost,0,2);
        orderCheckPane.setPadding(new Insets(10));
        orderCheckPane.setHgap(5);
        orderCheckPane.setVgap(5);
        orderCheckPane.getColumnConstraints().add(new ColumnConstraints(100));
        orderCheckPane.getColumnConstraints().add(new ColumnConstraints(100));
        orderCheckPane.getColumnConstraints().add(new ColumnConstraints(100));
        //конец макета

        GridPane orderCheckMenu = new GridPane();
        orderCheckMenu.getColumnConstraints().add(new ColumnConstraints(140));
        orderCheckMenu.getColumnConstraints().add(new ColumnConstraints(120));
        orderCheckMenu.getColumnConstraints().add(new ColumnConstraints(130));
        GridPane.setRowIndex(allProducts, 0);
        GridPane.setColumnIndex(allProducts, 0);
        GridPane.setRowIndex(basket, 0);
        GridPane.setColumnIndex(basket, 1);
        GridPane.setRowIndex(author, 0);
        GridPane.setColumnIndex(author, 2);
        GridPane.setRowIndex(orderCheckPane,1);
        GridPane.setColumnIndex(orderCheckPane, 0);
        orderCheckMenu.getChildren().addAll(allProducts,basket,author,orderCheckPane);
        Stage stage = new Stage();
        Scene scene = new Scene(orderCheckMenu, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Internet Shop");

        allProducts.setOnAction(event -> {
            stage.close();
            showAllProducts();
        });

        author.setOnAction(event -> {
            stage.close();
            showAuthorizationMenu();
        });
        basket.setOnAction(event -> {
            stage.close();
            showBasket();
        });
        stage.show();
    };
    public void showOrderMenu(){
        Button allProducts = new Button("Все продукты");
        Button basket = new Button("Корзина");
        Button author = new Button("Войти");
        GridPane orderMenu = new GridPane();

        //макет заполнения полей для заказа
        GridPane orderPane = new GridPane();
        Label address = new Label("Адрес");
        Label paymentMethod = new Label("Метод оплаты");
        Button makeOrder = new Button("Заказать");
        TextField addressText = new TextField("адрес доставки");
        ObservableList<String> methods = FXCollections.observableArrayList("Карта", "Наличные", "Комбинированная", "Со счета аккаунта");
        ChoiceBox<String> choice = new ChoiceBox<String>(methods);

        orderPane.add(address,0,0);
        orderPane.add(paymentMethod,0,1);
        orderPane.add(makeOrder,0,2);
        orderPane.add(addressText,1,0);
        orderPane.add(choice,1,1);
        orderPane.setPadding(new Insets(10));
        orderPane.setHgap(5);
        orderPane.setVgap(5);
        orderPane.getColumnConstraints().add(new ColumnConstraints(100));
        orderPane.getColumnConstraints().add(new ColumnConstraints(100));
        orderPane.getColumnConstraints().add(new ColumnConstraints(100));
        //конец макета

        orderMenu.getColumnConstraints().add(new ColumnConstraints(140));
        orderMenu.getColumnConstraints().add(new ColumnConstraints(120));
        orderMenu.getColumnConstraints().add(new ColumnConstraints(130));
        GridPane.setRowIndex(allProducts, 0);
        GridPane.setColumnIndex(allProducts, 0);
        GridPane.setRowIndex(basket, 0);
        GridPane.setColumnIndex(basket, 1);
        GridPane.setRowIndex(author, 0);
        GridPane.setColumnIndex(author, 2);
        GridPane.setRowIndex(orderPane, 1);
        GridPane.setColumnIndex(orderPane, 0);
        orderMenu.getChildren().addAll(allProducts,basket,author,orderPane);
        Stage stage = new Stage();
        Scene scene = new Scene(orderMenu, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Internet Shop");

        allProducts.setOnAction(event -> {
            stage.close();
            showAllProducts();
        });

        author.setOnAction(event -> {
            stage.close();
            showAuthorizationMenu();
        });
        basket.setOnAction(event -> {
            stage.close();
            showBasket();
        });
        makeOrder.setOnAction(event -> {
            stage.close();
            showOrder();
        });
        stage.show();
    };
    public void putProductInBasket(Product product, Basket basket){
        //нет возможности реализовать данную функцию из-за отсуствия связи между данным классом и сервисом корзин.
    };
    public void createOrder(Account account, OrderInformation orderInformation, Order order){
        //нет возможности вызвать функцию create из сервиса заказов из-за отсуствия связи между данным классом и сервисом.
    };
    public void authorize(Account account){
        //нет возможности вызвать функцию authorize из сервиса авторизации из-за отсуствия связи между данным классом и сервисом.
    };
    public void editProduct(Product product, Account account){
       //нет возмонжости вызвать функцию updateProduct из сервиса продуктов из-за отсутсвия связи между данным классом и сервисом.
    };
    public void showAuthError(){
        Alert alert = new Alert(Alert.AlertType.ERROR);

        alert.setTitle("Ошибка авторизации");
        alert.setHeaderText("Авторизация не удалась");
        alert.setContentText("Проверьте правильность ввода логина и пароля!");

        alert.showAndWait();
    };
}