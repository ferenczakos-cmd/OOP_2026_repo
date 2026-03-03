package oop.labor03.lab3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAcount Acount;

    public Customer (String First,String Last){
        firstName = First;
        lastName = Last;
        Acount = null;
    }
    public String getFirst(){
        return firstName;
    }
    public String getSecond(){
        return lastName;
    }
    public BankAcount getAcount(){
        return Acount;
    }
    public void setAcount(BankAcount acount){
        Acount=acount;
    }
    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String name){
        lastName = name;
    }
    public String toString(){
        return "Name: " + firstName + lastName + "/nBalance:" + Acount.toString();
    }
}
