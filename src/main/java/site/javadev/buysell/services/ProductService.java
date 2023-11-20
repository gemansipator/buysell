package site.javadev.buysell.services;

import org.springframework.stereotype.Service;
import site.javadev.buysell.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "PlayStation 5", "Simple description", 67000, "Krasnoyarsk", "tomas"));
        products.add(new Product(++ID, "Iphone 8", "Simple description", 24000, "Moscow", "artmcoder"));
    }

    public List<Product> listProducts() { return products; }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> Objects.equals(product.getId(), id));
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (Objects.equals(product.getId(), id)) return product;
        }
        return null;
    }
}