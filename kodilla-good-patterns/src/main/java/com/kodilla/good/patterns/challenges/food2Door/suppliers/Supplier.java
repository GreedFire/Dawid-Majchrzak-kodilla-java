package com.kodilla.good.patterns.challenges.food2Door.suppliers;

public class Supplier {
    private String name;
    private String description;
    private String NIP;
    private String telephoneNumber;

    public Supplier(String name, String description, String NIP, String telephoneNumber) {
        this.name = name;
        this.description = description;
        this.NIP = NIP;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getNIP() {
        return NIP;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
