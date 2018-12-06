package lk.ijse.dep.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("lk.ijse.dep")
@EnableWebMvc
public class WebAppConfig {
}
