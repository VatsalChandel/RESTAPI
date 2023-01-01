package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String vatTemplate = "%s really likes to sleep-in on breaks and listens to music";
    private static final String anujTemplate = "%s is really cute but can be seriously annoying sometimes";
    private static final String aparnTemplate = "%s is really good at baking and making cakes";
    private static final String narTemplate = "%s likes to make us do work :(";
    private final AtomicLong counter = new AtomicLong();
    private static final String counterTemplate = "You have clicked %s times";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name){

        switch(name){
            case "Vatsal":
                return new Greeting(String.format(vatTemplate, name), counter.incrementAndGet());
            case "Anuj":
                return new Greeting( String.format(anujTemplate, name), counter.incrementAndGet());
            case "Aparna":
                return new Greeting(String.format(aparnTemplate, name), counter.incrementAndGet());
            case "Narendra":
                return new Greeting(String.format(narTemplate, name), counter.incrementAndGet());
            default:


                return new Greeting(String.format(template,name), counter.incrementAndGet());

        }

    }

}
