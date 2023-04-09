package com.java7.vision.oop.enc;

public class Main1 {
    public static void main(String[] args) {
        Account account = new Account("anis" , "anis.siam.cs@gmail.com" , -4.0 ,1 );
        account.setName("Anis");
        account.setAccountNo(1);
        account.changeToDoller();

        System.out.println(account.printData());
    }
}
