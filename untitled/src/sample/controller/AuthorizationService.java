package sample.controller;

import sample.data.Account;

public interface AuthorizationService {
    Account authorize(String login, String password);
    boolean isAdmin(Account account);
    boolean isAuthorized(Account account);
}
