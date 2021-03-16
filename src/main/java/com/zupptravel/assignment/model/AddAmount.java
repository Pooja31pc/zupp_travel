package com.zupptravel.assignment.model;

public class AddAmount {

    private double eWallet_Amount;
    private int store_Credit;
    private double play_Money;
    private double cashBack;
    private String remarks;

    public AddAmount() {
    }

    public AddAmount(double eWallet_Amount, int store_Credit, double play_Money, double cashBack, String remarks) {
        this.eWallet_Amount = eWallet_Amount;
        this.store_Credit = store_Credit;
        this.play_Money = play_Money;
        this.cashBack = cashBack;
        this.remarks = remarks;
    }

    public double geteWallet_Amount() {
        return eWallet_Amount;
    }

    public void seteWallet_Amount(double eWallet_Amount) {
        this.eWallet_Amount = eWallet_Amount;
    }

    public int getStore_Credit() {
        return store_Credit;
    }

    public void setStore_Credit(int store_Credit) {
        this.store_Credit = store_Credit;
    }

    public double getPlay_Money() {
        return play_Money;
    }

    public void setPlay_Money(double play_Money) {
        this.play_Money = play_Money;
    }

    public double getCashBack() {
        return cashBack;
    }

    public void setCashBack(double cashBack) {
        this.cashBack = cashBack;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
