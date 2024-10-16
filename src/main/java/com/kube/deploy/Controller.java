package com.kube.deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }
}
