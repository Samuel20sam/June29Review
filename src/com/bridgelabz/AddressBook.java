package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> list = new ArrayList<>();
    ArrayList<String> cityList = new ArrayList<>();

    @Override
    public String toString() {
        return "AddressBook{" +
                "list=" + list +
                ", cityList=" + cityList +
                '}';
    }
}