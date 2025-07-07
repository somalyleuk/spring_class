package co.istad.springclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import co.istad.springclass.bean.AnnotationConfigDemo;
import co.istad.springclass.bean.Product;

@SpringBootApplication
public class SpringClassApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringClassApplication.class, args);
    }

    //Define dependency
//    private final AnnotationConfigDemo config;
    private Product p;

    //Constructor base configuration
    // @Autowired
//    public SpringClassApplication(AnnotationConfigDemo config) {
//        this.config = config;
//    }

//    @Autowired
//    @Qualifier("createProduct1")
//    public void setP(Product p) {
//        this.p = p;
//    }

    @Value("${my-server.path}")
    private String path;

    @Override
    public void run(String... args) throws Exception {
//        System.out.println(config.getAllProdutcts());
//        System.out.println(config.getAllProdutcts().get(0).getUuid());
//        System.out.println(config.getAllProdutcts().get(0).getName());
//        System.out.println(p);
    }
}
