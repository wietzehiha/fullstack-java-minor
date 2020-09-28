package com.assesment2.RestApi.Model;

import lombok.Data;

@Data
public class BankHolderAccount {

    public BankHolderAccount() {

    }

    public BankHolderAccount(String id, int bankPersonId, int bankAccountId) {
        this.id = id;
        this.bankAccountId = bankAccountId;
        this.bankPersonId = bankPersonId;
    }

    private String id;
    private int bankPersonId;
    private int bankAccountId;

    public void setId(String id) {
        this.id = id;
    }
}
