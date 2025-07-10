package co.istad.springclass.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
public class Courses {
  private UUID uuid;
  private String name;
}
