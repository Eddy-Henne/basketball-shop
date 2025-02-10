package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

        //Erstelle ArrayListe 'basketballs'

    List<Product> basketballs = new ArrayList<>();

        //Produkte hinzufügen

    public void addProduct(Product product) {
        basketballs.add(product);
        System.out.println("Product added: " + product.brandName());
    }

        //Alle Produkte Ausgeben

    public void displayAllProducts() {
        if (basketballs.isEmpty()){
            System.out.println("Keine Basketbaelle gefunden");
        } else {
            for (Product product : basketballs) {
                System.out.println(product);
            }
        }
    }

        //Produkt anhand von Namen entfernen

    public boolean removeProduct(String brandName) {
        return basketballs.removeIf(product -> product.brandName() == brandName);
    }

        //Ein bestimmtes Product anzeigen


    public Product getProduct(String brandName) {
        for (Product product : basketballs) {
            if (product.brandName() == brandName) {
                return product;
            }
        }
        return null;
    }

}
