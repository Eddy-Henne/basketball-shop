package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductRepo productRepo = new ProductRepo();

        Product bball01 = new Product("spalding", "black", 7, 22.90);
        Product bball02 = new Product("wilson", "orange", 7, 18.90);
        Product bball03 = new Product("najato", "orange", 6, 16.99);

        productRepo.addProduct(bball01);
        productRepo.addProduct(bball02);
        productRepo.addProduct(bball03);

        productRepo.displayAllProducts();

        boolean isRemoved = productRepo.removeProduct("spalding");
        System.out.println("Product spalding removed: " + isRemoved);

        productRepo.displayAllProducts();

        Product foundProduct = productRepo.getProduct("spalding");
        System.out.println("Found product: " + (foundProduct != null ? foundProduct.brandName() : "Product not found"));


        OrderListRepo orderListRepo = new OrderListRepo();

        Order order01 = new Order(1, "schulz", "bball01");
        Order order02 = new Order(2, "meier", "bball03");
        Order order03 = new Order(3, "schmidt", "bball02");

        orderListRepo.addOrder(order01);
        orderListRepo.addOrder(order02);
        orderListRepo.addOrder(order03);

        orderListRepo.displayAllOrders();

        boolean isRemoved2 = orderListRepo.removeOrder(1);
        System.out.println("Order number 1 removed: " + isRemoved2);

        orderListRepo.displayAllOrders();

        Order foundOrder = orderListRepo.getOrder(1);
        System.out.println("Found Order: " + (foundOrder != null ? foundOrder.orderNumber() : "Order not found"));
    }
}