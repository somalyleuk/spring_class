package co.istad.springclass.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
public class Pro {
    private Integer id;
    private String name;

    @Bean
    public List<Pro> productList() {
        List<Pro> products = new ArrayList<>();
        products.add(new Pro(1, "Coca"));
        products.add(new Pro(2, "Pepsi"));
        products.add(new Pro(3, "Sprite"));
        return products;
    }
}
