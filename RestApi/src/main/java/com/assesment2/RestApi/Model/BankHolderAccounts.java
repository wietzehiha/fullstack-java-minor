package com.assesment2.RestApi.Model;

import java.util.ArrayList;
import java.util.List;

public class BankHolderAccounts {
    private List<BankHolderAccount> bankHolderAccountsList;

    public List<BankHolderAccount> getBankHolderAccountsList() {
        if(bankHolderAccountsList == null) {
            bankHolderAccountsList = new ArrayList<>();
        }

        return bankHolderAccountsList;
    }

    public void setBankPersonsList(List<BankHolderAccount> bankHolderAccountsList) {
        this.bankHolderAccountsList = bankHolderAccountsList;
    }
}
