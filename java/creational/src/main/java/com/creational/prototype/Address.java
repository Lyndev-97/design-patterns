package com.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address implements Prototype<Address> {

    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public Address clone() {
        return new Address(this.street, this.number);
    }

    @Override
    public String toString() {
        return "Address{street='" + street + "', number=" + number + "}";
    }

}



