
package oop.labor02;

public class BankAcount{
    private String AcountNumber;
    private Double balance;

    public BankAcount(String Number,Double Balance){
        AcountNumber = Number;
        balance = Balance;
    }

    public String getAccountNumber(){
        return AcountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void Deposit(double amount){
        balance += amount;
    }
    public boolean Whitdraw(double amount){
        if(amount>balance){
            return false;
        }
        balance-= amount;
        return true;
    }
}



