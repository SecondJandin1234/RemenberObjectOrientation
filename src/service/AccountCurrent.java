package service;

import entities.Account;
import entities.Clients;

public class AccountCurrent extends Account {

    public AccountCurrent(Clients client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("================================");
        System.out.println("CPF: "+super.getClients().getCPF());

        System.out.println("== Extrato conta Corrente ==");
        super.printInfosAccount();
        System.out.println("\n================================");

    }

}