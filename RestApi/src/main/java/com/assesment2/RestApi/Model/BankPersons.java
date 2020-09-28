package com.assesment2.RestApi.Model;

import java.util.ArrayList;
import java.util.List;

public class BankPersons {
    private List<BankPerson> bankPersonsList;

    public List<BankPerson> getBankPersonsList() {
        if(bankPersonsList == null) {
            bankPersonsList = new ArrayList<>();
        }

        return bankPersonsList;
    }

    public void setBankPersonsList(List<BankPerson> bankPersonsList) {
        this.bankPersonsList = bankPersonsList;
    }
}
