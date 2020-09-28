package com.assesment2.RestApi.Model;

import java.util.ArrayList;
import java.util.List;

public class BankAccounts {
    private List<BankAccount> bankAccountsList;

    public List<BankAccount> getBankAccountsList() {
        if(bankAccountsList == null) {
            bankAccountsList = new ArrayList<>();
        }

        return bankAccountsList;
    }

    public void setBankAccountsList(List<BankAccount> bankAccountsList) {
        this.bankAccountsList = bankAccountsList;
    }
}
