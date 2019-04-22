package it.diepet.spring.playground.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Product Service!";
    }

}
