
package entities;

interface IntAccount {

    void withdraw(double valor);
    void deposit(double valor);
    void trasfer(double valor, Account targeAccount);
    void printExtract();

    
}
