package com.zupptravel.assignment.controller;

import com.zupptravel.assignment.model.AddAmount;
import com.zupptravel.assignment.model.Amount;
import com.zupptravel.assignment.repository.AmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdminController {

    @Autowired
    private AmountRepository amountRepo;

    @PostMapping("addamount")
    public Amount postAmount(@RequestBody AddAmount addAmount){

        Amount amountDetails =new Amount(addAmount.geteWallet_Amount(),addAmount.getStore_Credit(),addAmount.getPlay_Money(),addAmount.getCashBack(), addAmount.getRemarks());
        Amount saveDetails = amountRepo.save(amountDetails);
        return saveDetails;

    }

    @PutMapping("addAmount")
    public Amount addAmount(@RequestParam("id") long id, @RequestBody AddAmount addAmount) {

        Amount amount = amountRepo.findByAmountId(id);

        amount.seteWallet_Amount(addAmount.geteWallet_Amount()+amount.geteWallet_Amount());
        amount.setStore_Credit(addAmount.getStore_Credit()+amount.getStore_Credit());
        amount.setPlay_Money(addAmount.getPlay_Money()+amount.getPlay_Money());
        amount.setCashBack(addAmount.getCashBack()+amount.getCashBack());
        amount.setRemarks(addAmount.getRemarks());
        Amount amountRecord = null;

        amountRecord = amountRepo.save(amount);

        return amountRecord;

    }

    @PutMapping("deductAmount")
    public Amount deductAmount(@RequestParam("id") long id, @RequestBody AddAmount addAmount) {

        Amount amount = amountRepo.findByAmountId(id);

        amount.seteWallet_Amount(amount.geteWallet_Amount()-addAmount.geteWallet_Amount());
        amount.setStore_Credit(amount.getStore_Credit()-addAmount.getStore_Credit());
        amount.setPlay_Money(amount.getPlay_Money()-addAmount.getPlay_Money());
        amount.setCashBack(amount.getCashBack()-addAmount.getCashBack());
        amount.setRemarks(addAmount.getRemarks());
        Amount amountRecord = null;

        amountRecord = amountRepo.save(amount);

        return amountRecord;

    }


}
