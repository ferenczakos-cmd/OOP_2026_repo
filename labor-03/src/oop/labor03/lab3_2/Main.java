package oop.labor03.lab3_2;
import oop.labor03.lab3_1.BankAcount;

public class Main {

   public static void main(String[] args){
        Customer Customer1 = new Customer("Kis", "Janos");
        System.out.println(Customer1);
        Customer1.setAcount(new BankAcount("Bt1",1000));
        Customer1.setAcount(new BankAcount("Bt2",100));
        System.out.println(Customer1);
        Customer1.CloseAcount("Bt1");
        System.out.println(Customer1);
    }
}
   
