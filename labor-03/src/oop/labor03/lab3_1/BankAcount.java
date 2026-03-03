package oop.labor03.lab3_1;

public class BankAcount {
    private String AcountNumber;
    private double Balance;

    public BankAcount (String acountnumber, double balance){
        AcountNumber=acountnumber;
        Balance=balance;
    }
    public String getAcountnumber(){
        return AcountNumber;
    }
    public double getBalance(){
        return Balance;
    }
    public String toString(){
        return AcountNumber + " " + Balance;
    } 
    public void Deposit(double amount){
        Balance += amount;
    }
    public boolean Whitdraw(double amount){
        if(amount>Balance){
            return false;
        }
        Balance-= amount;
        return true;
    }
}
