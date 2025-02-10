package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {

    List<Order> orders = new ArrayList<>();

        //Order hinzufügen

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Product added: " + order.orderNumber());
    }

        //Alle Orders ausgeben

    public void displayAllOrders() {
        if (orders.isEmpty()){
            System.out.println("Keine Bestellung gefunden");
        } else {
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

        //Order anhand von Nummer entfernen

    public boolean removeOrder(int orderNumber) {
        return orders.removeIf(order -> order.orderNumber() == orderNumber);
    }

        //Eine bestimmte Order anzeigen

    public Order getOrder(int orderNumber) {
        for (Order order : orders) {
            if (order.orderNumber() == orderNumber) {
                return order;
            }
        }
        return null;
    }
}
