package service;

import entities.Account;
import entities.Clients;

public class AccountSavings extends Account {

    
    public AccountSavings(Clients client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("============================");
        System.out.println("== Extrato conta Poupança ==");
        super.printInfosAccount();

        System.out.println("\n============================");

    }
    
}