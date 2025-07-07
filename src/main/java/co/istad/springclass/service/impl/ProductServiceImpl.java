package co.istad.springclass.service.impl;

import co.istad.springclass.domain.Pro;
import co.istad.springclass.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final List<Pro> products;

    public ProductServiceImpl(List<Pro> productList) {
        this.products = productList;
    }

    @Override
    public List<Pro> getAllProduct() {
        return products;
    }

    @Override
    public Optional<Pro> getProductById(Integer id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
}