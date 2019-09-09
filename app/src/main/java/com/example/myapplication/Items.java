package com.example.myapplication;

public class Items {

    private String itemName;

    private int quantity;

    private Long amount;

    public Items(String itemName, int quantity, Long amount) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.amount = amount;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
