package com.local.commands;

import com.local.Command;
import com.local.Order;

public class SendOrderCommand implements Command {

    private Order order;

    public SendOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.sendOrder();
    }

}
