package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    List<Product> basketballs = new ArrayList<>();

    public void addProduct(Product product) {
        basketballs.add(product);
        System.out.println("Product added: " + product.brandName());
    }

    public void displayAllProducts() {
        if (basketballs.isEmpty()){
            System.out.println("Keine Basketbaelle gefunden");
        } else {
            for (Product product : basketballs) {
                System.out.println(product);
            }
        }
    }

}
