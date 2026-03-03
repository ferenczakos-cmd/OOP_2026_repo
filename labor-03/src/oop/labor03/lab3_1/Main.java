package oop.labor03.lab3_1;

public class Main {
    /* 
    BankAcount Acount1 = new BankAcount("BT1", 0);
    BankAcount Acount2 = new BankAcount("BT2", 10000);

    System.out.println("acount1: " + acount1);
    System.out.println("acount2: " + acount2);
    */
   public static void main(String[] args){
        Customer Customer1 = new Customer("Kis", "Janos");
        System.out.println(Customer1.toString());
        Customer1.setAcount(new BankAcount("Bt1",1000));
    }
}
   
