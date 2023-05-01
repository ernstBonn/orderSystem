package de.neuefische;

import de.neuefische.exceptions.ProductNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private ArrayList<Product> products;

    public ProductRepo(ArrayList<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    //###########
    public Product getProductById(String productId) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        throw new ProductNotFoundException("product with id " + productId + " not found" );
    }
        //###########
}