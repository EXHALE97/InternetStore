package sample.controller;

import sample.data.Account;
import sample.data.Basket;
import sample.data.Bill;
import sample.data.CustomerAccount;
import sample.ui.GraphicalInterfaceMenu;
import java.util.ArrayList;

public class AuthorizationServiceRealization implements AuthorizationService{


    private ArrayList<Account> accounts = new ArrayList<Account>();


    public void setAccounts(String login, String password, String role){
        Account account = new Account(login,password,role);
        accounts.add(account);
    }
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public void deleteAccount(Account account){
        accounts.remove(account);
    }

    public Account authorize(String login, String password){
        Account temp;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getLogin()== login && accounts.get(i).getPassword()== password) {
                temp=accounts.get(i);
                return temp;
            }
        }
        return null;
    };

    public boolean isAdmin(Account account){
        if (account.getRole()=="admin"){return true;}
        else return false;
    };

    public boolean isAuthorized(Account account){
        //из-за отсутсвия в Account поля "статус" определить авторизацию невозможно.
        return true;
    };
}
