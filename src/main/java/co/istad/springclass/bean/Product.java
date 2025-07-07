package co.istad.springclass.bean;

// role of pojo / role of java bean

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
//import lombok.Setter;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class
Product {
    private UUID uuid;
    private String name;
}
