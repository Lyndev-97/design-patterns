package com.creational.singleton;

import com.creational.singleton.User;
import java.util.ArrayList;
import java.util.List;

public class MyDatabaseClassic {
    // Instância estática privada
    private static MyDatabaseClassic instance = null;

    // Lista de usuários simulando o array
    private final List<User> users = new ArrayList<>();

    // Construtor privado impede a criação de novas instâncias com 'new'
    private MyDatabaseClassic() {}

    // Método estático público para obter a instância única
    public static MyDatabaseClassic getInstance() {
        if (instance == null) {
            instance = new MyDatabaseClassic();
        }
        return instance;
    }

    // Adiciona um usuário à lista
    public void add(User user) {
        this.users.add(user);
    }

    // Remove um usuário pelo índice (equivalente ao splice do TS)
    public void remove(int index) {
        if (index >= 0 && index < this.users.size()) {
            this.users.remove(index);
        }
    }

    // Exibe os usuários no console
    public void show() {
        for (User user : this.users) {
            System.out.println(String.format("ID: %d, Name: %s, Age: %d",
                    user.id(), user.name(), user.age()));
        }
    }
}