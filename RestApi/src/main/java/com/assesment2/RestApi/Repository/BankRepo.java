package com.assesment2.RestApi.Repository;

import com.assesment2.RestApi.Model.*;
import org.springframework.stereotype.Repository;

@Repository
public class BankRepo {
    private static final BankAccounts listBankAccounts = new BankAccounts();
    private static final BankPersons listBankPersons = new BankPersons();
    private static final BankHolderAccounts listBankHolderAccounts = new BankHolderAccounts();

    static {

        // add static data for BankAcconts.
        listBankAccounts.getBankAccountsList().add(new BankAccount("0", "IBAN59NLINGB612345", 16, 0));
        listBankAccounts.getBankAccountsList().add(new BankAccount("1", "IBAN59NLINGB123456", 10, 0));
        listBankAccounts.getBankAccountsList().add(new BankAccount("2", "IBAN59NLINGB213456", 100, 0));
        listBankAccounts.getBankAccountsList().add(new BankAccount("3", "IBAN59NLINGB345612", 110, 0));
        listBankAccounts.getBankAccountsList().add(new BankAccount("4", "IBAN59NLINGB456123", 20, 0));
        listBankAccounts.getBankAccountsList().add(new BankAccount("5", "IBAN59NLINGB561234", 50, 1));

        // add static data for BankPerons.
        listBankPersons.getBankPersonsList().add(new BankPerson("0", "Eva Salomos"));
        listBankPersons.getBankPersonsList().add(new BankPerson("1", "Wietze Eilander"));
        listBankPersons.getBankPersonsList().add(new BankPerson("2", "Rik Rustenhoven"));
        listBankPersons.getBankPersonsList().add(new BankPerson("3", "Ralph Rijkse"));
        listBankPersons.getBankPersonsList().add(new BankPerson("4", "Diederick Schipper"));
        listBankPersons.getBankPersonsList().add(new BankPerson("5", "Wouter Visser"));
        listBankPersons.getBankPersonsList().add(new BankPerson("6", "Maurits van Pelt"));

        // add static data for BankHolders
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("0", 1, 1));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("1", 6, 5));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("2", 1, 2));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("3", 0, 2));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("4", 0, 2));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("5", 1, 3));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("6", 2, 3));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("7", 3, 3));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("8", 4, 3));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("9", 5, 3));
        listBankHolderAccounts.getBankHolderAccountsList().add(new BankHolderAccount("10", 6, 3));

    }

    public BankAccounts getListBankAccounts() {
        return listBankAccounts;
    }

    public BankPersons getListBankPersons() {
        return listBankPersons;
    }

    public void addBankAcconut(BankAccount bankAccount) {
        listBankAccounts.getBankAccountsList().add(bankAccount);
    }
}
