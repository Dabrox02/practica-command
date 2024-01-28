package com.local.commands;

import com.local.Command;
import com.local.Order;

public class DeleteItemCommand implements Command {

    private Order order;
    private String item;

    public DeleteItemCommand(Order order, String item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.deleteItem(item);
    }

}
