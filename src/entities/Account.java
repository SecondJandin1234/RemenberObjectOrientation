package entities;

public abstract class Account implements IntAccount{

    private int agency;
    private final String numberAccount;
    private double balance;
    private Clients clients;



    private int AGENCY_DEFAULT=1;    

    public Account(Clients client) {
        this.clients=client;
        this.agency = AGENCY_DEFAULT;
        this.numberAccount = generatedAccountNumber();
    }


    @Override
    public void withdraw(double valor) {
        balance-=valor;
    }
    @Override
    public void deposit(double valor) {
        balance+= valor;
    }
    @Override
    public void trasfer(double valor, Account target) {
        target.deposit(valor);
        this.withdraw(valor);
    }

    public Clients getClients(){
        return this.clients;
    }
    public int getAgency() {
        return agency;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    protected void printInfosAccount(){
        System.out.println("   Agencia: "+this.agency);
        System.out.println("   Numero da conta: "+this.numberAccount);
        System.out.println("   Saldo: "+this.balance);
        System.out.println("\n\n\n    "+this.clients.getName());
    }

    private String generatedAccountNumber(){
        String idAcouString="";
        int number = 0;
        int sum=0;
        for (int i = 0; i < 4; i++) {
            number = (int) (Math.random() * 10);
            sum+=number;
            idAcouString += String.valueOf(number);

        }
        return idAcouString+"-"+(sum%2);
    }

}
