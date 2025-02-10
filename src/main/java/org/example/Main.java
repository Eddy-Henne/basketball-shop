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

    }
}