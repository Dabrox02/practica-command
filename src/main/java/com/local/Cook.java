package com.local;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Cook {

    List<Command> orderCommandList = new ArrayList<>();

    public void takeOrder(Command command) {
        orderCommandList.add(command);
    }

    public void placeOrders() {
        for (Command command : orderCommandList) {
            command.execute();
        }
    }

}
