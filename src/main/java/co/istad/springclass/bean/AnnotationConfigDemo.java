package co.istad.springclass.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//act as products service where we write
//@service
//@repository
@Component
public class AnnotationConfigDemo {
//    Product products = new Product();

    //get all products
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();

        products.add(new Product(UUID.randomUUID(), "Coca-Cola"));
        products.add(new Product(UUID.randomUUID(), "Pepsi"));

        return products;
    }
}
