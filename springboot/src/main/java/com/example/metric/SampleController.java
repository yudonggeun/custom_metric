package com.example.metric;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SampleController {

    @GetMapping
    public String getHandler() {
        return "Let's apply custom metric component to k8s!!";
    }

    @GetMapping("/out")
    public String scaleOut() {
        return "scale out";
    }

    @GetMapping("/in")
    public String scaleIn() {
        return "scale out";
    }
}
