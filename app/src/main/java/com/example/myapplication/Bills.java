package com.example.myapplication;

import java.util.List;

public class Bills {

    private String billNumber;

    private String storeName;

    private List<Items> items;

    private Long billAmount;

    private String gSTIN;

    private String terms;

    private String modeOfTransaction;


    private Clients client;

    public Bills(String billNumber, String storeName, List<Items> items, Long billAmount, String gSTIN, String terms, String modeOfTransaction, Clients client) {
        this.billNumber = billNumber;
        this.storeName = storeName;
        this.items = items;
        this.billAmount = billAmount;
        this.gSTIN = gSTIN;
        this.terms = terms;
        this.modeOfTransaction = modeOfTransaction;
        this.client = client;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public Long getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Long billAmount) {
        this.billAmount = billAmount;
    }

    public String getgSTIN() {
        return gSTIN;
    }

    public void setgSTIN(String gSTIN) {
        this.gSTIN = gSTIN;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getModeOfTransaction() {
        return modeOfTransaction;
    }

    public void setModeOfTransaction(String modeOfTransaction) {
        this.modeOfTransaction = modeOfTransaction;
    }




    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }
}
