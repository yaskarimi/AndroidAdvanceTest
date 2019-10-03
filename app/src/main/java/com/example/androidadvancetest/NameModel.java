package com.example.androidadvancetest;

public class NameModel {
    private String name;
    private String family;
    NameModel(String name , String family){
        setFamily(family);
        setName(name);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
