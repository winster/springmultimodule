package com.example.multimodule.application;

import com.example.multimodule.stringtype.StringTypeFinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
@RestController
//@Import({StringTypeFinder.class, EmptyType.class})
public class SampleApplication {

    private final StringTypeFinder stringTypeFinder;

    public SampleApplication(StringTypeFinder stringTypeFinder) {
        this.stringTypeFinder = stringTypeFinder;
    }

    @GetMapping("/")
    public List<String> home() {
        List<String> inputs = new ArrayList<>();
        inputs.add("");
        inputs.add("aba");
        inputs.add("abcd");
        List<String> outputs = this.stringTypeFinder.execute(inputs);
        for(String output : outputs) {
            System.out.println(output);
        }
        return outputs;
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}