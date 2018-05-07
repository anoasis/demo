package com.example.demo;

import com.sun.xml.internal.ws.api.pipe.ContentType;
import org.springframework.http.MediaType;
import org.springframework.http.codec.multipart.Part;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@RequestMapping(value="multipart")
public class MultipartController {

    @PostMapping(value="/post", consumes= MediaType.MULTIPART_FORM_DATA_VALUE)
    public Mono<String> postMultipart(@RequestBody Flux<Part> parts){
        parts.subscribe(p-> WebClient.create().post()
                            .uri(URI.create("http://localhost:8080/stream/process"))
                            .contentType(MediaType.APPLICATION_JSON)
                            .body(BodyInserters.fromDataBuffers(p.content()))
                            .retrieve()
                            .bodyToMono(Person.class)
                            .subscribe(System.out::println)
        );

        return Mono.just("complete");
    }

}
