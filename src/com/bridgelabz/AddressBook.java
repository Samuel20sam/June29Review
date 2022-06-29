package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contact> list = new ArrayList<>();// It represents a single diary where contact has been stored

    @Override
    public String toString() {
        return "AddressBook{" +
                "list=" + list +
                '}';
    }
}