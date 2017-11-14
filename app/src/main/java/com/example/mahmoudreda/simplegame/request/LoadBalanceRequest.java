package com.example.mahmoudreda.simplegame.request;

/**
 * Created by botanozdemir on 13.11.2017.
 */

public class LoadBalanceRequest {

        private int amount;
        private String barcode;
        private int cashOfficeId;
        private String transactionId;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getCashOfficeId() {
        return cashOfficeId;
    }

    public void setCashOfficeId(int cashOfficeId) {
        this.cashOfficeId = cashOfficeId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
