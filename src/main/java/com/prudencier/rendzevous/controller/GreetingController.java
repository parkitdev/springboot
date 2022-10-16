package com.prudencier.rendzevous.controller;

import com.prudencier.rendzevous.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello shell, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping({"/greeting","/"})
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name,@RequestParam(value = "day", defaultValue = "today") String day) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name) +day);
    }
}
