package de.neuefische;

import de.neuefische.exceptions.OrderNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private ArrayList<Order> orders;

    public OrderRepo(ArrayList<Order> orders) {
        this.orders = orders;
    }
    public List<Order> getOrders() {
        return orders;
    }
    //##########
    public Order getOrderById(String orderId) throws OrderNotFoundException {
        for (Order order : orders){
            if (order.getOrderId().equals(orderId)){
                return order;
            }
        }
        throw new OrderNotFoundException("order with id " + orderId + " not found");
    }
    public ArrayList<Order> addNewOrder(Order newOrder){
        orders.add(newOrder);
        return orders;
    }
}
