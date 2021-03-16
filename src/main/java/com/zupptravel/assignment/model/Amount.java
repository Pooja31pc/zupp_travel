package com.zupptravel.assignment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Amount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double eWallet_Amount;
    private int store_Credit;
    private double play_Money;
    private double cashBack;
    private String remarks;

    public Amount(Long id, double eWallet_Amount, int store_Credit, double play_Money, double cashBack, String remarks) {
        this.id = id;
        this.eWallet_Amount = eWallet_Amount;
        this.store_Credit = store_Credit;
        this.play_Money = play_Money;
        this.cashBack = cashBack;
        this.remarks = remarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Amount() {
    }

    public Amount(double eWallet_Amount, int store_Credit, double play_Money, double cashBack, String remarks) {
        this.eWallet_Amount = eWallet_Amount;
        this.store_Credit = store_Credit;
        this.play_Money = play_Money;
        this.cashBack = cashBack;
        this.remarks = remarks;
    }

}
