package com.local;

import com.local.commands.*;

// Cliente es quien ejecuta 
public class Cliente {
    public static void main(String[] args) {

        Order order = new Order();

        Command addItem = new AddItemCommand(order, "Ensalada Rusa");
        Command addItem2 = new AddItemCommand(order, "Piña con queso");
        Command addItem3 = new AddItemCommand(order, "Arroz de leche");
        Command delItem = new DeleteItemCommand(order, "Arroz de leche");
        Command sendOrder = new SendOrderCommand(order);

        Cook cook = new Cook();
        cook.takeOrder(addItem);
        cook.takeOrder(addItem2);
        cook.takeOrder(addItem3);
        cook.takeOrder(delItem);
        cook.takeOrder(sendOrder);
        cook.placeOrders();

    }
}