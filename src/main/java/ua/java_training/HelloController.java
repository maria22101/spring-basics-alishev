package ua.java_training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-my-big-world")
    public String sayHello() {
        return "hello_my_big_world"; // this is owr view name
    }
}
