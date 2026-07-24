export interface Prototype {
    clone(): Prototype;
}

export class Person implements Prototype {
    public addresses: Address[] = [];
    constructor(public name: string, public age: number) { }

    clone(): Person {
        const newObj = new Person(this.name, this.age);
        newObj.addresses = this.addresses.map(address => address.clone());
        return newObj;
    }

    addAddress(address: Address): void {
        this.addresses.push(address);
    }
}

export class Address implements Prototype {
    constructor(public street: string, public number: number) { }

    clone(): Address {
        return new Address(this.street, this.number);
    }
}


const address1 = new Address("Main St", 123);
const person1 = new Person("John", 30);
person1.addAddress(address1);

const person2 = person1.clone();

person1.addresses[0].street = "Elm St";

person2.name = "Jane";
console.log(person2);
console.log(person2.addresses);

console.log("==============================");
console.log(person1);
console.log(person1.addresses);