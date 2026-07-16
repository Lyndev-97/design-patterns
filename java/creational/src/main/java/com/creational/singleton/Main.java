package com.creational.singleton;
import com.creational.singleton.MyDatabaseClassic;
import com.creational.singleton.User;

// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Executando Código do Módulo A ---");
        executarModuloA();

        System.out.println("\n--- Executando Código do Módulo B ---");
        executarModuloB();
    }

    private static void executarModuloA() {
        MyDatabaseClassic myDatabaseClassic = MyDatabaseClassic.getInstance();
        myDatabaseClassic.add(new User(1, "Alice", 30));
        myDatabaseClassic.add(new User(2, "Bob", 25));
        myDatabaseClassic.show();
    }

    private static void executarModuloB() {
        MyDatabaseClassic myDatabaseClassic = MyDatabaseClassic.getInstance();
        myDatabaseClassic.add(new User(3, "Layon", 30));
        myDatabaseClassic.add(new User(4, "Amanda", 25));
        myDatabaseClassic.show();
    }
}
