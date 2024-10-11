package com.ampta.central_shops.service.product;

import com.ampta.central_shops.model.Product;
import com.ampta.central_shops.request.ProductRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(ProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    int countProductsByBrandAndName (String brand, String name);
}
