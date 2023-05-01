package de.neuefische;

import de.neuefische.exceptions.OrderNotFoundException;
import de.neuefische.exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopService {
    private ProductRepo productRepo;
    private OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }
    public void startShopService() throws ProductNotFoundException, OrderNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.println("choose: [a] listProducts || [b] getProduct || [c] getOrder || [d] listOrders || [e] addOrder");
        String choice = sc.next();
        switch (choice){
            case "b":
                System.out.println("type productId");
                String productId = sc.next();
                System.out.println(productRepo.getProductById(productId));
                startShopService();
            case "a":
                System.out.println(productRepo.getProducts());
                startShopService();
            case "c":
                System.out.println("type orderId");
                String orderId = sc.next();
                System.out.println(orderRepo.getOrderById(orderId));
                startShopService();
            case "d":
                System.out.println(orderRepo.getOrders());
                startShopService();
            case "e":
                boolean flag = true;
                System.out.println("type newOrderId");
                String newOrderId = sc.next();
                Order newOrder = new Order(newOrderId);
                orderRepo.addNewOrder(newOrder);
                ArrayList<Product> newProducts = new ArrayList<>();

                while (flag == false){
                    System.out.println("type ProductId");
                    String newProductsId = sc.nextLine();
                    newProducts.add(productRepo.getProductById(newProductsId));
                }
                System.out.println(orderRepo.getOrderById(newOrderId));
                startShopService();
        }
    }
}
