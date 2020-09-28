package com.assesment2.RestApi.Model;

import lombok.Data;

@Data
public class BankPerson {

    public BankPerson() {

    }

    public BankPerson(String id, String name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }
}
