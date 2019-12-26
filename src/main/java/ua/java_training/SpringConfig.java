package ua.java_training;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ua.java_training")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
