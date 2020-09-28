package com.assesment2.RestApi.Model;

import lombok.Data;

@Data
public class BankAccount {

    public BankAccount() {

    }

    public BankAccount(String id, String IBAN, int balance, int blocked) {
        this.id = id;
        this.IBAN = IBAN;
        this.balance = balance;
        this.blocked = blocked;
    }

    private String id;
    private String IBAN;
    private int balance;
    private int blocked;

    public void setId(String id) {
        this.id = id;
    }

    public void blockAccount(String id) {
        this.blocked = 1;
    }
    public void unblockAccount(String id) {
        this.blocked = 0;
    }
}
