package com.assesment2.RestApi.Controller;

import com.assesment2.RestApi.Model.BankAccounts;
import com.assesment2.RestApi.Model.BankPersons;
import com.assesment2.RestApi.Repository.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class BankController {

    @Autowired
    private BankRepo bankRepo;

    @GetMapping(path="/accounts", produces = "application/json")
    public BankAccounts getBankAccounts() {
        return bankRepo.getListBankAccounts();
    }

    @GetMapping(path="/persons", produces = "application/json")
    public BankPersons getBankPersons() {
        return bankRepo.getListBankPersons();
    }



}
