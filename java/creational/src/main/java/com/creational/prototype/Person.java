package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Prototype<Person> {

    private String name;
    private int age;
    private List<Address> addresses = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<Address> addresses) {
        this.name = name;
        this.age = age;
        this.addresses = addresses;
    }

    @Override
    public Person clone() {
        Person newObj = new Person(this.name, this.age);

        for(Address a : this.addresses){
            newObj.addresses.add(a.clone());
        }

        return newObj;
    }

    public void addAddress(Address a){
        this.addresses.add(a);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", addresses=" + addresses + "}";
    }

}
