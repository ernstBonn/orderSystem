package de.neuefische;

import de.neuefische.exceptions.OrderNotFoundException;
import de.neuefische.exceptions.ProductNotFoundException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ProductNotFoundException, OrderNotFoundException{

        Product screwdriver = new Product("p1", "screwdriver");
        Product mirror = new Product("p2", "mirror");
        Product chair = new Product("p3", "chair");
        Product table = new Product("p4", "table");

        ArrayList<Product> products = new ArrayList<>();

        products.add(screwdriver);
        products.add(mirror);
        products.add(chair);
        products.add(table);

        ProductRepo productRepo = new ProductRepo(products);

        Order order1 = new Order("o1", products);

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(order1);

        OrderRepo orderRepo = new OrderRepo(orders);

        ShopService shopService = new ShopService(productRepo, orderRepo);
        shopService.startShopService();
    }
}