package com.bridgelabz;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        AddressBook ab = new AddressBook();
        Main main = new Main();

        //Creating first address book
        System.out.println("Enter first book name");
        String bookName1 = main.in.next();
        ab.map.put(bookName1, new LinkedList<>());
        Contact c1 = new Contact("Samuel", "Elijah", "Chennai");
        ab.map.get(bookName1).add(c1);
        Contact c2 = new Contact("Kevin", "Raymond", "Pune");
        ab.map.get(bookName1).add(c2);
        Contact c3 = new Contact("Hardy", "Cooper", "Cochin");
        ab.map.get(bookName1).add(c3);

        //Creating second address book
        System.out.println("Enter second book name");
        String bookName2 = main.in.next();
        ab.map.put(bookName2, new LinkedList<>());
        Contact c4 = new Contact("Naren", "Vinay", "Kolkata");
        ab.map.get(bookName2).add(c4);
        Contact c5 = new Contact("Pavan", "Roy", "Mumbai");
        ab.map.get(bookName2).add(c5);
        Contact c6 = new Contact("Magesh", "Kumar", "Delhi");
        ab.map.get(bookName2).add(c6);

        System.out.println(ab.map);

        System.out.println("Enter the Name that needs to be searched");
        String fn = main.in.next();
        for (String key : ab.map.keySet()) {
            for (Contact info : ab.map.get(key)) {
                }
            }
        }
    }
}