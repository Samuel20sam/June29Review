package com.bridgelabz;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //Creating first address book
        AddressBook addressBook1 = new AddressBook();
        Contact c1 = new Contact("Samuel", "Elijah", "Chennai");
        addressBook1.list.add(c1);
        Contact c2 = new Contact("Kevin", "Raymond", "Pune");
        addressBook1.list.add(c2);
        Contact c3 = new Contact("Hardy", "Cooper", "Chennai");
        addressBook1.list.add(c3);

        //Creating second address book
        AddressBook addressBook2 = new AddressBook();
        Contact c4 = new Contact("Venkatesh", "Bhatt", "Kolkata");
        addressBook2.list.add(c4);
        Contact c5 = new Contact("Pradeep", "Reddy", "Mumbai");
        addressBook2.list.add(c5);
        Contact c6 = new Contact("Magesh", "Kumar", "Delhi");
        addressBook2.list.add(c6);

        Map<String, AddressBook> addressBookMap = new LinkedHashMap<>();
        addressBookMap.put("addressBook1", addressBook1);
        addressBookMap.put("addressBook2", addressBook2);

        //Accessing the address book - method 1
        System.out.println("\n" + addressBookMap.get("addressBook1"));
        System.out.println("\n" + addressBookMap.get("addressBook2"));

        //Accessing the address book - method 2
        for (Map.Entry<String, AddressBook> e : addressBookMap.entrySet())
            System.out.println("\n" + e.getKey() + " " + e.getValue());

        //Accessing the address book - method 2
        addressBookMap.forEach((k, v) -> System.out.println("\n" + "key " + k + "\n" + "value " + v));

        List<Contact> nameOne = addressBookMap.get("addressBook1").list.stream().filter(x -> x.firstName.equals("Kevin")).toList();
        System.out.println("\n" +nameOne);
        List<Contact> nameTwo = addressBookMap.get("addressBook2").list.stream().filter(x -> x.firstName.equals("Magesh")).toList();
        System.out.println("\n" +nameTwo);
    }
}