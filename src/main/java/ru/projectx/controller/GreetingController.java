package ru.projectx.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.projectx.service.GreetingService;

@RestController
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService service;

    @GetMapping("/greeting")
    public String greeting() {
        return service.greeting();
    }
}
