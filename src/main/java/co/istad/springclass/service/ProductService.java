package co.istad.springclass.service;

import co.istad.springclass.domain.Pro;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Pro> getAllProduct();
    Optional<Pro> getProductById(Integer id);
}