package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="stream")
public class StreamController {

    @PostMapping(value="process")
    public void streamProcess(@RequestBody List<Person> ps){
        for (Person p: ps) {

            System.out.println("=======process:"+p.getFirstName());
            RestTemplate rest = new RestTemplate();
            rest.postForEntity(URI.create("http://localhost:8080/stream/callback"), p, Person.class);
        }
    }

    @PostMapping(value="callback")
    public void callback(@RequestBody Person p){
        System.out.println("=======callback:"+p.getFirstName());
    }

}
