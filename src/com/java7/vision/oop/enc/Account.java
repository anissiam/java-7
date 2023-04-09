package com.java7.vision.oop.enc;

public class Account {
    private String name;
    private String email;
    private double amount;
    private int accountNo;

    public Account() {
    }

    public Account(String name, String email, double amount, int accountNo) {
        this.name = name;
        this.email = email;
        this.amount = amount;
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String printData() {
        return "Account{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", amount=" + amount +
                ", accountNo=" + accountNo +
                '}';
    }

    public void changeToDoller(){
        double result = amount / 3.6;
        System.out.println(result);
    }
}
