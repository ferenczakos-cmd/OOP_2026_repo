package oop.labor02;
import java.util.Random;
public class Main{
    public static void main(String[] args){
        /*
        BankAcount account1 = new BankAcount("OTP01");
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.Deposit(1000);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.Whitdraw(500);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.Witdraw(1000);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        BankAcount account2 = new BankAcount("OTP02");
        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());
        account02.Deposit(2000);
        System.out.println(account2.getAccountNumber()+": "+account2.getBalance());
        */
       Random rand = new Random();
        Rectangle[] Rectangles = new Rectangle[10];
        for(int i=0;i<Rectangles.length;i++){
            double width = rand.nextDouble() *10;
            double height = rand.nextDouble() *10;
            Rectangles[i]= Rectangle.createRectangle(width,height);
            System.out.println(Rectangles[i]);
        }
        

    }
}