package com.local.commands;

import com.local.Command;
import com.local.Order;

public class AddItemCommand implements Command {

    private Order order;
    private String item;

    public AddItemCommand(Order order, String item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.addItem(item);
    }

}
