package com.bridgelabz;

import java.util.ArrayList;
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
        Contact c4 = new Contact("Kevin", "Kumar", "Kolkata");
        addressBook2.list.add(c4);
        Contact c5 = new Contact("Pradeep", "Reddy", "Mumbai");
        addressBook2.list.add(c5);
        Contact c6 = new Contact("Kiran", "Roy", "Delhi");
        addressBook2.list.add(c6);

        Map<String, AddressBook> addressBookMap = new LinkedHashMap<>();
        addressBookMap.put("addressBook1", addressBook1);
        addressBookMap.put("addressBook2", addressBook2);

        //Accessing the address book - method 1
        System.out.println("\n" + addressBookMap.get("addressBook1"));
        System.out.println("\n" + addressBookMap.get("addressBook2"));

        //Accessing the address book - method 2
        addressBookMap.forEach((k, v) -> System.out.println("\n" + "key " + k + "\n" + "value " + v));

        List<Contact> nameOne = new ArrayList<>();
        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook ab = addressBookMap.get(entry.getKey());
            List<Contact> nameList = ab.list.stream().filter(x -> x.firstName.equals("Kevin")).toList();
            nameOne.addAll(nameList);
        }
        System.out.println("\ntesting " + nameOne);

        Map<String, List<Contact>> cityNameMap = new LinkedHashMap<>();

        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            AddressBook ab = addressBookMap.get(entry.getKey());
            ab.list.forEach(element -> {
                if (cityNameMap.containsKey(element.getCity())) {
                    List<Contact> list = cityNameMap.get(element.getCity());
                    list.add(element);
                } else {
                    List<Contact> list = new ArrayList<>();
                    list.add(element);
                    cityNameMap.put(element.getCity(), list);
                }
            });
        }
        System.out.println("\nCity Name Map contains:" +cityNameMap);
    }
}