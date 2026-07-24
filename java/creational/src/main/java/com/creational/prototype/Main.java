package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Main St", 123);
        Person person1 = new Person("John", 30);
        person1.addAddress(address1);

        Person person2 = person1.clone();

        person1.getAddresses().get(0).setStreet("Elm St");

        //person2.setName("Jane");
        person1.setName("Layon");

        System.out.println(person2);
        System.out.println(person2.getAddresses());

        System.out.println("==============================");

        System.out.println(person1);
        System.out.println(person1.getAddresses());
    }
}
