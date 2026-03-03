package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAcount;

public class Customer {
    private static int Max_counter=10;
    private int counter=0;
    private String firstName;
    private String lastName;
    private BankAcount[] Acounts = new BankAcount[Max_counter];

    public Customer (String First,String Last){
        firstName = First;
        lastName = Last;
    }
    public String getFirst(){
        return firstName;
    }
    public String getSecond(){
        return lastName;
    }
    public BankAcount getAcount(String Acountnumber){
        for(int i=0;i<counter;++i){
            if(Acounts[i].getAcountnumber().equals(Acountnumber)){
                return Acounts[i];
            }
        }
        return null;
    }
    public void setAcount(BankAcount acount){
        if (counter<=Max_counter){
            Acounts[counter]=acount;
            counter++;
        }
        //Acounts=acount;
    }
    public void setFirstName(String name){
        firstName = name;
    }
    public void setLastName(String name){
        lastName = name;
    }
    public String toString(){
        String Result = "Name: " + firstName + " " + lastName + " BankAcounts:\n";
        for(int i=0;i<counter;i++){
            Result += "\t" + Acounts[i] +"\n";
        }
        return Result;
    }

    public void CloseAcount(String acount){
        boolean found = false;
        for(int i=0;i<counter;++i){
            if(!found){
                if(Acounts[i].getAcountnumber().equals(acount)){
                    found=true;
                }
            }else{
                Acounts[i-1]=Acounts[i];
            }
        }
        if(found){
            counter--;
        }
    }
}

