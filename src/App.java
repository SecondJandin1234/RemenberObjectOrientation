
import entities.Account;
import entities.Clients;
import service.AccountCurrent;
import service.AccountSavings;

public class App {
    public static void main(String[] args) throws Exception {
        Clients client = new Clients("John", "2121551");
        Account n1= new AccountCurrent(client);
        Account n2= new AccountSavings(client);
        n1.deposit(1000);
        n1.printExtract();
        n1.trasfer(100, n2);

        n1.printExtract();
        n2.printExtract();
    }
}
