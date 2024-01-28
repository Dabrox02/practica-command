package com.local;

import java.util.ArrayList;
import java.util.List;

// Receptor - Receiver
public class Order {

    List<String> platos;

    public Order() {
        platos = new ArrayList<>();
    }

    public void addItem(String item) {
        platos.add(item);
    }

    public void deleteItem(String item) {
        platos.remove(item);
    }

    public void sendOrder() {
        System.out.println("Pedido es: ");
        for (String string : platos) {
            System.out.println("- " + string);
        }
    }

}
