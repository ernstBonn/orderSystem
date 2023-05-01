package de.neuefische;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private ArrayList<Product> products;

    public Order(String orderId, ArrayList<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", products=" + products +
                '}';
    }
}
