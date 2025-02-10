package org.example;

public record Order(
        int orderNumber,
        String orderName,
        String orderProduct
) {
}
